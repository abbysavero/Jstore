import java.util.*;
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        // initialise instance variables
        super(item);
        isActive = false;
        this.customer=customer;
    }
    
    public Customer getCustomer()
    {
        // initialise instance variables
        return customer;
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
    
    public void setCustomer(Customer customer)
    {
        // initialise instance variables
        this.customer = customer;
    }

    public String toString()
    {
        return "";
    }
    
    /*public void printData()
    {
        // put your code here
         System.out.println("\n========INVOICE========");
		System.out.println("ID: " + Sell_Paid.getId);
		System.out.println("Date: " + Sell_Paid.getDate);
		System.out.println("Item: " + Sell_Paid.getItem());
		System.out.println("Total Price: " + Sell_Paid.getTotalPrice);
		
    }*/
}
