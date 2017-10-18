package vincidao.android.database;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author YougaKingWu
 * @descibe ...
 * @date 2017/10/18 0018-14:22
 */

public abstract class DatabaseOpenHelper extends SQLiteOpenHelper {


    public DatabaseOpenHelper(Context context, String name, int version) {
        this(context, name, null, version);
    }

    public DatabaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DatabaseOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }
}
