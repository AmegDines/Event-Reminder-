
import java.time.LocalDate;

public class Event{
    private String title;
    private String description;
    private LocalDate date;
    private boolean isComplete;

    public Event(String title, String description, LocalDate date) {
        this.title = title;
        this.description = description;
        this.date = date;
        isComplete = false;
    }

    public String getitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public boolean getEventStatus() {
        return isComplete;
    }

    public void setEventStatus(boolean status) {
        this.isComplete = status;
    }
}
