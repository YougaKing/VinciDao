package vincidao.android.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author YougaKingWu
 * @descibe ...
 * @date 2017/10/18 0018-15:23
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface Id {
    boolean autoincrement() default false;
}
