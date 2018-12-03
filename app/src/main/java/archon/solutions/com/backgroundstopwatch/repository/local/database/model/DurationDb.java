package archon.solutions.com.backgroundstopwatch.repository.local.database.model;

import android.arch.persistence.room.Entity;

import static archon.solutions.com.backgroundstopwatch.repository.local.database.constants.TableNames.STOPWATCH_DURATION_TABLE_NAME;

@Entity(tableName = STOPWATCH_DURATION_TABLE_NAME)
public class DurationDb extends BaseModelDb {
}
