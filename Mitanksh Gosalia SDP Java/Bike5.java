class Vehicle
{
    Vehicle()
    {
        System.out.println("Vehicle is Created");
    }
}
public class Bike5 extends Vehicle
{
    Bike5()
    {
        super();
        System.out.println("Bike is Created");
    }
    public static void main(String[] args)
    {
        Bike5 b = new Bike5();
    }
}