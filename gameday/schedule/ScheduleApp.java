package gameday.schedule;

import java.util.Scanner;

public class ScheduleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScheduleManager manager = new ScheduleManager();

        System.out.println("College GameDay Campus Schedule");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View all events");
            System.out.println("2. Search event by name");
            System.out.println("3. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nGameDay Events:");
                    for (Event event : manager.getEvents()) {
                        System.out.println("-----");
                        System.out.println(event);
                    }
                    break;

                case "2":
                    System.out.print("Enter event name: ");
                    String name = scanner.nextLine().toLowerCase();
                    boolean found = false;
                    for (Event event : manager.getEvents()) {
                        if (event.getName().toLowerCase().contains(name)) {
                            System.out.println("\nEvent Found:");
                            System.out.println(event);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No event found with that name.");
                    }
                    break;

                case "3":
                    System.out.println("Exiting Campus Schedule. Enjoy GameDay!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}