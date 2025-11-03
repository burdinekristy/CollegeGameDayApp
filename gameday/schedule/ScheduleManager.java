package gameday.schedule;

import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private List<Event> events;
    
    public ScheduleManager() {
        events = new ArrayList<>();
        loadEvents();
    }

    private void loadEvents() {
        events.add(new Event("Tailgate Kickoff","Lot A", "9:00 AM", "Start the day with food, music, and games."));
        events.add(new Event("Live Broadcast", "Main Stage", "10:30 AM", "Watch the GameDay crew go live."));
        events.add(new Event("Marching Band Parade", "Campus Loop", "11:15", "Cheer on the band as they march through campus."));
        events.add(new Event("Fan Zone", "Stadium Plaza", "12:00 PM", "Interactive games, giveaways, and meet & greets."));
        events.add(new Event("Kickoff", "Stadium", "2:30 PM", "The big game begins!"));
    }

    public List<Event> getEvents() {
        return events;
    }
}
