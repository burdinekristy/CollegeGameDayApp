package gameday.predictions;

import java.util.Scanner;

public class PredictionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PredictionManager manager = new PredictionManager();

        System.out.println("Welcome to Game Predictions!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Make a prediction");
            System.out.println("2. View predictions");
            System.out.println("3 Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Team A: ");
                    String teamA = scanner.nextLine();

                    System.out.print("Enter Team B: ");
                    String teamB = scanner.nextLine();

                    System.out.print("Who do you predict will win? ");
                    String winner = scanner.nextLine();

                    System.out.print("Predicted score for " + teamA + ": ");
                    int scoreA = Integer.parseInt(scanner.nextLine());

                    System.out.print("Predicted score for " + teamB + ": ");
                    int scoreB = Integer.parseInt(scanner.nextLine());

                    GamePrediction prediction = new GamePrediction(teamA, teamB, winner, scoreA, scoreB);
                    manager.addPrediction(prediction);
                    System.out.println("Prediction saved!");
                    break;

                case "2":
                    System.out.println("\nYour Predictions:");
                    for (GamePrediction p : manager.getPredictions()) {
                        System.out.println(p);
                        System.out.println("-----");
                    }
                    break;

                case "3":
                    System.out.println("Exiting Game Predictions. Good luck with your picks!");
                    scanner.close();
                    return;
                                        
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }    
}
