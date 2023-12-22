import java.util.Scanner;

public class PlayerRatingTester {
    public static void main(String[] args) {
        // Input for two critics
        PlayerRating player1 = new PlayerRating(1, "Beckham", 9, 9.9, 0);

        // Display details for two critics
        player1.displayPlayerDetails();

        // Input for three critics
        PlayerRating player2 = new PlayerRating(1, "Oscar", 1, 1, 1);

        // Display details for three critics
        player2.displayPlayerDetails();
    }
}
class PlayerRating {
    private int playerPosition;
    private String playerName;
    private double criticOneRating;
    private double criticTwoRating;
    private double criticThreeRating;

    // Constructor to initialize player details
    public PlayerRating(int position, String name, double rating1, double rating2, double rating3) {
        this.playerPosition = position;
        this.playerName = name;
        this.criticOneRating = rating1;
        this.criticTwoRating = rating2;
        this.criticThreeRating = rating3;
    }

    // Method to calculate average rating
    public double calculateAverageRating() {
        double total = criticOneRating + criticTwoRating + criticThreeRating;
        return total / 3.0;
    }

    // Method to determine category based on average rating
    public String getCategory() {
        double average = calculateAverageRating();
        if (average >= 9.0) {
            return "A";
        } else if (average >= 7.0) {
            return "B";
        } else if (average >= 5.0) {
            return "C";
        } else {
            return "D";
        }
    }

    // Method to display player details and rating
    public void displayPlayerDetails() {
        System.out.println("The player name is " + playerName);
        System.out.println("The player position is " + playerPosition);
        System.out.println("The average rating is " + calculateAverageRating());
        System.out.println("The category is " + getCategory());
    }
}


