package gameday.teams;


import java.util.Scanner;

public class TeamSelectionApp {
    public static void main(String[] args) {
        TeamManager manager = new TeamManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Team Selection!");
        System.out.println("Available Teams:");

        for (Team team : manager.getTeams()) {
            System.out.println("- " + team.getName());
        }

        System.out.print("\nEnter the name of your favorite team: ");
        String input = scanner.nextLine();

        Team selected = manager.getTeamByName(input);
        if (selected != null) {
            System.out.println("\nYou selected:");
            System.out.println(selected);
        } else {
            System.out.println("Team not found. Please try again.");
        }

        scanner.close();
    }    
}
