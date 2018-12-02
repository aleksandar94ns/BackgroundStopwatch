package archon.solutions.com.backgroundstopwatch.domain.model;

public class StopwatchDuration extends BaseModel {

    private long duration;

    public StopwatchDuration(long id, long duration) {
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
