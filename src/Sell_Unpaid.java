import java.util.*;
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        // initialise instance variables
        super(item);
        isActive = true;
        this.customer = customer;
        
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
    
    public Customer getCustomer()
    {
        // initialise instance variables
        return customer;
    }
    
    public Calendar getDueDate()
    {
       return dueDate; 
    }
    
    public void setCustomer(Customer customer)
    {
        // initialise instance variables
        this.customer = customer;
    }
    
    public void setDueDate(Calendar dueDate)
    {
       this.dueDate = dueDate; 
    }
    
     public String toString()
    {
        return "";
    }
    
    /*public static void printData()
    {
        // put your code here
         System.out.println("\n========INVOICE========");
		System.out.println("ID: " + Sell_Unpaid.getId());
		System.out.println("Date: " + Sell_Unpaid.getDate());
		System.out.println("Item: " + Sell_Unpaid.getItem());
		System.out.println("Total Price: " + Sell_Unpaid.getTotalPrice());
		System.out.println("Due Date: " + dueDate);
    }*/
}
