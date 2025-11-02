package gameday.store;

import java.util.ArrayList;
import java.util.List;

public class StoreManager {
    private List<MerchItem> inventory;

    public StoreManager() {
        inventory = new ArrayList<>();
        loadInventory();
    }

    private void loadInventory() {
        inventory.add(new MerchItem("Alabama Jersey", 79.99));
        inventory.add(new MerchItem("Georgia Hat", 24.99));
        inventory.add(new MerchItem("Ohio State Hoodie", 59.99));
        inventory.add(new MerchItem("Texas Flag", 19.99));
        // Add more items as needed
    }

    public List<MerchItem> getInventory() {
        return inventory;
    }

    public MerchItem getItemByName(String name) {
        for (MerchItem item : inventory) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}