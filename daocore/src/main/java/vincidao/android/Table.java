package vincidao.android;

/**
 * @author YougaKingWu
 * @descibe ...
 * @date 2017/10/18 0018-14:31
 */

public interface Table {

    String ID = "_id";

    String tableName();

    String createTableSql();
}
