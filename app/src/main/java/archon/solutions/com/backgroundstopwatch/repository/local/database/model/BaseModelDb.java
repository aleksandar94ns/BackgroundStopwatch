package archon.solutions.com.backgroundstopwatch.repository.local.database.model;

import android.arch.persistence.room.PrimaryKey;

public class BaseModelDb {

    @PrimaryKey(autoGenerate = true)
    private long id;

    public BaseModelDb() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
