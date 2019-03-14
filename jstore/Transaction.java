import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Transaction
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class Transaction
     */
    public void orderNewItem(Supplier supplier)
    {
        Item thing = new Item (1, "game", 3, 765, 
        ItemStatus.valueOf("New"), 
        supplier, ItemCategory.valueOf("Electronics"));
        
        DatabaseItem.addItem(thing);
        
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        
        Invoice order1 = new Invoice (1, thing, date, thing.getPrice());
        
        thing.setStatus(ItemStatus.valueOf("New"));
        
        order1.setInvoiceStatus(InvoiceStatus.valueOf("Paid"));
        
        thing.printData();
        order1.printData();   
              
        
    }

    
    public void orderSecondItem(Supplier supplier)
    {
        Item thing = new Item (1, "game", 3, 765, 
        ItemStatus.valueOf("New"), 
        supplier, ItemCategory.valueOf("Electronics"));
        
        DatabaseItem.addItem(thing);
        
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        
        Invoice order1 = new Invoice (1, thing, date, thing.getPrice());
        
        thing.setStatus(ItemStatus.valueOf("Second"));
        
        order1.setInvoiceStatus(InvoiceStatus.valueOf("Paid"));
        
        thing.printData();
        order1.printData(); 
        
    }
    
    public void orderRefurbishedItem(Supplier supplier)
    {
        Item thing = new Item (1, "game", 3, 765, 
        ItemStatus.valueOf("New"), 
        supplier, ItemCategory.valueOf("Electronics"));
        
        DatabaseItem.addItem(thing);
        
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        
        Invoice order1 = new Invoice (1, thing, date, thing.getPrice());
        
        thing.setStatus(ItemStatus.valueOf("Refurbished"));
        
        order1.setInvoiceStatus(InvoiceStatus.valueOf("Paid"));
        
        thing.printData();
        order1.printData(); 
        
    }
    
    public void sellItemPaid(Item item)
    {
     String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
     
     Invoice order1 = new Invoice (1, item, date, item.getPrice());
     
     order1.setInvoiceStatus(InvoiceStatus.valueOf("Paid"));
     item.setStatus(ItemStatus.valueOf("Sold"));
     
     order1.printData();
     
     
     
     
     
    }
    
    public void sellItemUnpaid(Item item)
    {
     String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
     
     Invoice order1 = new Invoice (1, item, date, item.getPrice());
     
     order1.setInvoiceStatus(InvoiceStatus.valueOf("Unpaid"));
     item.setStatus(ItemStatus.valueOf("Sold"));
     
     order1.printData();
    }
    
    public void sellItemInstallment(Item item)
    {
     String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
     
     Invoice order1 = new Invoice (1, item, date, item.getPrice());
     
     order1.setInvoiceStatus(InvoiceStatus.valueOf("Installment"));
     item.setStatus(ItemStatus.valueOf("Sold"));
     
     order1.printData();
    }


}
