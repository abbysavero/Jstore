
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE;
    private InvoiceStatus INVOICE_STATUS;
    private String dueDate;

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Unpaid(int id, Item item, String date, int totalItem,
    int totalPrice, String dueDate)
    {
        // initialise instance variables
        super(id, item, date, totalItem, totalPrice);
        this.dueDate = dueDate;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        // put your code here
        return INVOICE_TYPE;
    }
    
    public String getDueDate()
    {
       return dueDate; 
    }
    public static void prinData()
    {
        // put your code here
         System.out.println("\n========INVOICE========");
		System.out.println("ID: " + Sell_Unpaid.getId());
		System.out.println("Date: " + Sell_Unpaid.getDate());
		System.out.println("Item: " + Sell_Unpaid.getItem());
		System.out.println("Total Price: " + Sell_Unpaid.getTotalPrice());
		System.out.println("Due Date: " + dueDate);
    }
}
