package gameday.store;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<MerchItem> items;
    
    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(MerchItem item) {
        items.add(item);
    }

    public List<MerchItem> getItems() {
        return items;
    }

    public double getTotal() {
        double total = 0;
        for (MerchItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cart:\n");
        for (MerchItem item : items) {
            sb.append("- ").append(item).append("\n");
        }
        sb.append("Total: $").append(String.format("%.2f", getTotal()));
        return sb.toString();
    }
}