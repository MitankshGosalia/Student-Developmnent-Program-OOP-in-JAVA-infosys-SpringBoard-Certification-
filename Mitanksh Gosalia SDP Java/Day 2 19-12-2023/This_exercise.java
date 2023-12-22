public class Chocolate {
    private int barCode;
    private String name;
    private double weight;
    private double cost;

    // Parameterized constructor
    public Chocolate(int barCode, String name, double weight, double cost) {
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    // Default constructor
    public Chocolate() {
        this.barCode = 101;
        this.name = "Cadbury";
        this.weight = 12;
        this.cost = 10;
    }

    // Setter methods to modify values
    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // Method to display chocolate details
    public void displayChocolateDetails() {
        System.out.println("Chocolate Details:");
        System.out.println("Barcode: " + barCode);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Cost: $" + cost);
    }

    public static void main(String[] args) {
        // Creating a Chocolate object using parameterized constructor
        Chocolate myChocolate = new Chocolate(101, "Cadbury", 12, 10);

        // Displaying default chocolate details
        myChocolate.displayChocolateDetails();

        // Modifying values using setter methods
        myChocolate.setBarCode(102);
        myChocolate.setName("Hershey's");
        myChocolate.setWeight(24);
        myChocolate.setCost(50);

        // Displaying updated chocolate details
        myChocolate.displayChocolateDetails();

        // Creating a Chocolate object using default constructor
        Chocolate defaultChocolate = new Chocolate();

        // Displaying default chocolate details
        defaultChocolate.displayChocolateDetails();
    }
}
