package archon.solutions.com.backgroundstopwatch.repository.local.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import archon.solutions.com.backgroundstopwatch.repository.local.database.model.DurationDb;
import io.reactivex.Flowable;

import java.util.List;

import static archon.solutions.com.backgroundstopwatch.repository.local.database.constants.TableNames.STOPWATCH_DURATION_TABLE_NAME;

@Dao
public interface DurationDao {

    @Query("SELECT * FROM " + STOPWATCH_DURATION_TABLE_NAME)
    Flowable<List<DurationDb>> read();
}
