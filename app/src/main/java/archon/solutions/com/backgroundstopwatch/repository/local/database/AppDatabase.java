package archon.solutions.com.backgroundstopwatch.repository.local.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import archon.solutions.com.backgroundstopwatch.repository.local.database.dao.DurationDao;
import archon.solutions.com.backgroundstopwatch.repository.local.database.model.DurationDb;

@Database(entities = {DurationDb.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract DurationDao stopwatchDurationDao();
}
