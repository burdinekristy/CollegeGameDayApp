package gameday.store;

import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StoreManager manager = new StoreManager();
        Cart cart = new Cart();

        System.out.println("Welcome to the College GameDay Store!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View merchandise");
            System.out.println("2. Add item to cart");
            System.out.println("3. View cart");
            System.out.println("4. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nAvailable Merchandise:");
                    for (MerchItem item : manager.getInventory()) {
                        System.out.println("- " + item);
                    }
                    break;
                case "2":
                    System.out.println("Enter item name to add: ");
                    String itemName = scanner.nextLine();
                    MerchItem item = manager.getItemByName(itemName);
                    if (item != null) {
                        cart.addItem(item);
                        System.out.println("Added to cart!");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case "3":
                    System.out.println("\n" + cart);
                    break;
                case "4":
                    System.out.println("Thanks for shopping! Enjoy GameDay!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
