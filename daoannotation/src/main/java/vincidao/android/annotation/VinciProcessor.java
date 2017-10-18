package vincidao.android.annotation;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.JavaFileObject;

@SupportedAnnotationTypes({
        "vincidao.android.annotation.Entity",
        "vincidao.android.annotation.Id",
})
@SupportedSourceVersion(SourceVersion.RELEASE_7)
public class VinciProcessor extends AbstractProcessor {

    private static final String DAO_CLASS_SUFFIX = "Dao";
    private Types mTypeUtils;
    private Elements mElementUtils;
    private Filer mFiler;
    private Messager mMessager;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        mTypeUtils = processingEnv.getTypeUtils();
        mElementUtils = processingEnv.getElementUtils();
        mFiler = processingEnv.getFiler();
        mMessager = processingEnv.getMessager();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        for (Element element :roundEnv.getElementsAnnotatedWith(Entity.class)) {

            String className = element.getSimpleName().toString();
            String packageName = mElementUtils.getPackageOf(element).asType().toString();

            StringBuilder builder = new StringBuilder();
            builder.append("package " + packageName + ";\n\n")
                    .append("public class " + className + DAO_CLASS_SUFFIX + " {\n")
                    .append("\tpublic static String createTableSql() {\n")
                    .append("return null;\n")
                    .append("\t}\n")
                    .append("}");

            generateCode(packageName+"\\" +className+ DAO_CLASS_SUFFIX, builder.toString());
        }

        return true;
    }


    private void generateCode(String className, String code) {
        try {
            JavaFileObject file = mFiler.createSourceFile(className);
            Writer writer = file.openWriter();
            writer.write(code);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
