package archon.solutions.com.backgroundstopwatch.domain.model;

public class BaseModel {

    private long id;

    public BaseModel(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
