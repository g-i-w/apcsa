public class Item
{
    private static String description;
    private double price;
    private static double taxPercentage;
    
    public Item(String d, double p, double t)
    {
        description = d;
        price = p;
        taxPercentage = t;
    }
    
    public double totalAmount()
    {
        return price + calculateTax(price);
    }

    public static double calculateTax (double p) {
        return p * taxPercentage;
    }

    public static void main(String[] args) {
        Item laptop = new Item("MacBook Air", 7000.00, 0.1);
        System.out.println( laptop.totalAmount() );
    }
}