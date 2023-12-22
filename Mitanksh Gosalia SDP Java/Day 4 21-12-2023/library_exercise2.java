package com.infy.string;
public class Tester {
    public static void main(String[] args) {
        LocationChanger locationChanger = new LocationChanger();

        // Test Case 1
        System.out.println("Test Case 1:");
        locationChanger.welcomeEmployee("Annabelle Michael");
        locationChanger.checkCity("Delhi");
        locationChanger.editAddress(false);

        // Test Case 2
        System.out.println("\nTest Case 2:");
        locationChanger.welcomeEmployee("John Doe");
        locationChanger.checkCity("Trivandrum");
        locationChanger.editAddress(true);
    }
}
class LocationChanger {
    public void welcomeEmployee(String fullName) {
        String firstName = fullName.split(" ")[0];
        System.out.println("Welcome, " + firstName + "!");
    }

    public void checkCity(String location) {
        switch (location) {
            case "Delhi":
                System.out.println("Welcome to Delhi!");
                break;
            case "Trivandrum":
                System.out.println("Welcome to Trivandrum!");
                break;
            case "Bhubaneshwar":
                System.out.println("Welcome to Bhubaneshwar!");
                break;
            default:
                System.out.println("Unknown City!");
                break;
        }
    }

    public void editAddress(boolean worksInSTP) {
        if (worksInSTP) {
            System.out.println("Your location has been changed to SEZ.");
        } else {
            System.out.println("You are already working in SEZ.");
        }
    }
}


