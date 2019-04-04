import java.util.*;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;

    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(int id, Item item, int totalItem)
    {
        // initialise instance variables
        super(id, item, totalItem);
        
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
    
    public String toString()
    {
        return "";
    }
    
    /*public void printData()
    {
        // put your code here
         System.out.println("\n========INVOICE========");
		System.out.println("ID: " + Buy_Paid.getId());
		System.out.println("Date: " + Buy_Paid.getDate());
		System.out.println("Item: " + Buy_Paid.getItem());
		System.out.println("Total Price: " + Buy_Paid.getTotalPrice);
		
    }*/
}
