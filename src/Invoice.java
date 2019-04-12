import java.util.*;
/**
 * class Invoice to print the total price.
 *
 * @author Abby Savero
 * @version 7/3/19
 */
public abstract class Invoice
{
    private int id;
    private ArrayList<Integer> item;
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    
   

   
    public Invoice(ArrayList<Integer> item)
    {
        id = (DatabaseInvoice.getLastInvoiceID()+1);
    }

    
    public int getId()
    {
        return id;
    }
    
    public Item getItem()
    {
        //return item.get(1);
        return null;
    }
    
    public Calendar getDate()
    {
        return date;
    }
    
    public int getTotalPrice()
    {
        return totalPrice;
    }

    public abstract InvoiceStatus getInvoiceStatus();

    public abstract InvoiceType getInvoiceType();
    
    public boolean getIsActive()
    {
        return isActive;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    
    public void setItem(ArrayList<Integer> item)
    {
        this.item = item;
    }
    
    public void setDate(Calendar date)
    {
        this.date = date;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        ArrayList<Item> itemDB = DatabaseItem.getItemDatabase();
        for(int i = 0; i<item.size();i++) {
            for (int j = 0; j<itemDB.size(); j++) {
                if (itemDB.get(j).getId()==item.get(i)){
                    totalPrice=totalPrice+itemDB.get(j).getPrice();
                }
            }
        }
    }
    
    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
        
    }
    
    public abstract String toString();
    
    /*public static void  printData()
    {
        /*System.out.println("\n========INVOICE========");
		System.out.println("ID: " + id);
		System.out.println("Date: " + date);
		System.out.println("Item: " + item.getName());
		System.out.println("Total Price: " + totalPrice);
		System.out.println("Status: " + status);*/
    
}
