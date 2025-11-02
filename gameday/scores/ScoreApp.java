package gameday.scores;

import java.util.Scanner;

public class ScoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScoreManager manager = new ScoreManager();

        System.out.println("Live Score Updates");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View all scores");
            System.out.println("2. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nCurrent Scores:");
                    for (GameScore score : manager.getScores()) {
                        System.out.println(score);
                    }
                    break;
                case "2":
                    System.out.println("Exiting Live Scores. Enjoy the game!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
