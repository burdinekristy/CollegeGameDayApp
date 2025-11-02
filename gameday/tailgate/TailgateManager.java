package gameday.tailgate;

public class TailgateManager {
    private TailgateEvent currentEvent;

    public void createEvent(String location, String time) {
        currentEvent = new TailgateEvent(location, time);
    }

    public TailgateEvent getCurrentEvent() {
        return currentEvent;
    }

    public boolean hasEvent() {
        return currentEvent != null;
    }
}
