package ltd.fdsa.database.sql.functions;

import lombok.ToString;
import ltd.fdsa.database.sql.columns.Column;
import ltd.fdsa.database.sql.domain.BuildingContext;
import ltd.fdsa.database.sql.utils.Indentation;

import static java.sql.Types.INTEGER;

/**
 * @author zhumingwu
 * @since 3/20/2021 10:36 AM
 */
@ToString(callSuper = true)
public class DistinctCount extends NumberColumnFunction {
    public DistinctCount(Column column) {
        super(column, "COUNT");
    }

    public DistinctCount(Column column, String alias) {
        super(column, "COUNT", alias);
    }

    public DistinctCount as(String alias) {
        return new DistinctCount(column, alias);
    }

    @Override
    public String getValue(BuildingContext context, Indentation indentation) {
        return definition + "(" + context.getDialect().getLabels().getDistinct() + " " + (column != null ? column.getFullNameOrAlias(context) : "*") + ")";
    }

    @Override
    public int getSqlType() {
        return INTEGER;
    }
}
