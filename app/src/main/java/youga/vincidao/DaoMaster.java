package youga.vincidao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import vincidao.android.database.DatabaseOpenHelper;

/**
 * @author YougaKingWu
 * @descibe ...
 * @date 2017/10/18 0018-14:34
 */

public class DaoMaster {


    public static class DevOpenHelper extends DatabaseOpenHelper {

        public DevOpenHelper(Context context, String name, int version) {
            super(context, name, version);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
}
