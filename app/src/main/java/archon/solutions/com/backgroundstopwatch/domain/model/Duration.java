package archon.solutions.com.backgroundstopwatch.domain.model;

public class Duration extends BaseModel {

    private long duration;

    public Duration(long id, long duration) {
        super(id);
        this.duration = duration;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
