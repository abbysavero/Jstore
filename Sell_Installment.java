import java.util.*;
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int InstallmentPeriod;
    private int InstallmentPrice;
    private Customer customer;

    /**
     * Constructor for objects of class Sell_Paid
     */
    Sell_Installment(int id, Item item, int totalItem, 
    int InstallmentPeriod, Customer customer)
    {
        // initialise instance variables
        super(id, item, totalItem);
    }

    public int getInstallmentPeriod()
    {
        return InstallmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        return InstallmentPrice;
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
    
    public int setInstallmentPrice()
    {
      InstallmentPrice = (Sell_Installment.totalPrice/InstallmentPeriod) * (102/100);
    }
    
    public int setTotalPrice()
    {
        /*Sell_Installment.totalPrice = installmentPrice*installmentPeriod;*/
    }
    
    public void setCustomer(Customer customer)
    {
        // initialise instance variables
       this.customer = customer;
    }
    
    public String toString()
    {
        // initialise instance variables
        return "";
    }
    
    /*public void printData()
    {
        System.out.println("==========INVOICE==========");
        System.out.println("ID:" + Sell_Installment.getId());
        System.out.println("Date:" + Sell_Installment.getDate());
        System.out.println("Item:" + Sell_Installment.getItem());
        System.out.println("Total Item:" + Sell_Installment.getTotalItem());
        System.out.println("Total Price:" + Sell_Installment.getTotalPrice());
        System.out.println("Status:" + Sell_Installment.getInvoiceStatus());
        System.out.println("Installment Price:" + InstallmentPrice);
}*/
}
