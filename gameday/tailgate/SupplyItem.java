package gameday.tailgate;

public class SupplyItem {
    private String name;
    private int quantity;

    public SupplyItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return quantity + " x " + name;
    }
}
