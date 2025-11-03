package gameday.schedule;

public class Event {
    private String name;
    private String location;
    private String time;
    private String description;

    public Event(String name, String location, String time, String description) {
        this.name = name;
        this.location = location;
        this.time = time;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name + " @ " + location + " at " + time + "\n" + description;
    }
}