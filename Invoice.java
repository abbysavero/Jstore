import java.util.*;
/**
 * class Invoice to print the total price.
 *
 * @author Abby Savero
 * @version 7/3/19
 */
public abstract class Invoice
{
    private static int id;
    private static Item item;
    private static Calendar date;
    protected static int totalPrice;
    private static int totalItem;
   

   
    public Invoice(int id, Item item, int totalItem)
    {
        this.id = id;
        this.item = item;
        this.totalItem = totalItem;
        totalPrice = item.getPrice() * totalItem;
    }

    
    public static int getId()
    {
        return id;
    }
    
    public static Item getItem()
    {
        return item;
    }
    
    public static Calendar getDate()
    {
        return date;
    }
    
    public static int getTotalPrice()
    {
        return totalPrice;
    }
    
    public static int getTotalItem()
    {
        return totalItem;
    }
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    
    public abstract InvoiceType getInvoiceType();
    
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    
    public void setItem(Item item)
    {
        this.item = item;
    }
    
    public void setDate(Calendar date)
    {
        this.date = date;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    
    public void setTotalItem(int totalItem)
    {
        this.totalItem = totalItem;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    
    public String toString()
    {
        return "";
    }
    
    /*public static void  printData()
    {
        /*System.out.println("\n========INVOICE========");
		System.out.println("ID: " + id);
		System.out.println("Date: " + date);
		System.out.println("Item: " + item.getName());
		System.out.println("Total Price: " + totalPrice);
		System.out.println("Status: " + status);*/
    
}
