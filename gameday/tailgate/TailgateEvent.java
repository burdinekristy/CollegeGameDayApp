package gameday.tailgate;

import java.util.ArrayList;
import java.util.List;

public class TailgateEvent {
    private String location;
    private String time;
    private List<String> invitedFriends;
    private List<SupplyItem> supplies;
    
    public TailgateEvent(String location, String time) {
        this.location = location;
        this.time = time;
        this.invitedFriends = new ArrayList<>();
        this.supplies = new ArrayList<>();
    }

    public void addFriend(String name) {
        invitedFriends.add(name);
    }

    public void addSupply(SupplyItem item) {
        supplies.add(item);
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public List<String> getInvitedFriends() {
        return invitedFriends;
    }

    @Override
    public String toString() {
        return "Tailgate at" + location + " at " + time +
               "\nFriends: " + invitedFriends +
               "\nSupplies: " + supplies;
    }
}
