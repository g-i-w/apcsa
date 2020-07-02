import java.util.*;

public class Receipt
{
    // Instance variables.
    private String customerName;
    private String dateCode;
    private ArrayList<String> itemsPurchased;
    
    /** Constructs a Receipt object and initialized
     * all instance variables.
     */
    public Receipt(String n, String d)
    { /* to be implemented in part (a) */ }

    /** Adds an item String to itemsPurchased.
     */
    public void addItem(String i)
    { /* to be implemented in part (b) */ }

    /** Sorts the items in itemsPurchased alphabetically.
     */
    private void sortItems()
    { /* implementation not shown */ }

    /** Returns a string that can be printed as a receipt for
     * a customer.
     */
    public String formatReceipt()
    { /* to be implemented in part (c) */ }
}