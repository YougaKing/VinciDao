//package vincidao.android.database;
//
//import android.database.Cursor;
//import android.database.SQLException;
//
///**
// * @author YougaKingWu
// * @descibe ...
// * @date 2017/10/18 0018-14:46
// */
//
//public interface Database {
//    Cursor rawQuery(String sql, String[] selectionArgs);
//
//    void execSQL(String sql) throws SQLException;
//
//    void beginTransaction();
//
//    void endTransaction();
//
//    boolean inTransaction();
//
//    void setTransactionSuccessful();
//
//    void execSQL(String sql, Object[] bindArgs) throws SQLException;
//
//    DatabaseStatement compileStatement(String sql);
//
//    boolean isDbLockedByCurrentThread();
//
//    void close();
//
//    Object getRawDatabase();
//}
