public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter the cost: ");
        double cost = 3;

        double tax = cost * .05;
        double costTax = cost + tax;
        System.out.println("The total cost plus tax is: " + costTax);
    }
}