
/**
 * class Invoice to print the total price.
 *
 * @author Abby Savero
 * @version 7/3/19
 */
public class Invoice
{
    private static int id;
    private static Item item;
    private static String date;
    protected static int totalPrice;
    private static int totalItem;
    private static InvoiceStatus status;
    private static InvoiceType type;

   
    public Invoice(int id, Item item, String date, int totalItem,
    int totalPrice)
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    
    public static int getId()
    {
        return id;
    }
    
    public static Item getItem()
    {
        return item;
    }
    
    public static String getDate()
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
    
    public static InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return status;
    }
    
    public static InvoiceType getInvoiceType()
    {
        
        return type;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    
    public void setItem(Item item)
    {
        this.item = item;
    }
    
    public void setDate(String date)
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
        this.status = status;
    }
    
    public static void  printData()
    {
        System.out.println("\n========INVOICE========");
		System.out.println("ID: " + id);
		System.out.println("Date: " + date);
		System.out.println("Item: " + item.getName());
		System.out.println("Total Price: " + totalPrice);
		System.out.println("Status: " + status);
    }
}
