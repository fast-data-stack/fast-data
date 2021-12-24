package ltd.fdsa.database.sql.schema;

import lombok.NoArgsConstructor;
import ltd.fdsa.database.sql.columns.Column;

import static lombok.AccessLevel.PRIVATE;

/**
 * @author zhumingwu
 * @since 3/20/2021 10:36 AM
 */
@NoArgsConstructor(access = PRIVATE)
public final class TableBuilderUtil {
    public static void addColumnToTable(Column column, Table table) {
        table.addColumn(column);
    }
}
