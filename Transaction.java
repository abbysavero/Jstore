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
    public void orderNewItem(Item item)
    {
        
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        Invoice order1 = new Invoice(1, item, date, 10, item.getPrice); 
        
        if (order1 instanceof Sell_Paid == true)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah Invoice Type bukan Sell _Paid");
        }
    
            
        
        thing.setStatus(ItemStatus.valueOf("New"));
        
        
        
        item.printData();
        order1.printData();   
              
        
    }

    
    public void orderSecondItem(Item item)
    {
        
        
       
        
        
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        Invoice order1 = new Invoice(1, item, date, 10, item.getPrice); 
        
        if (order1 instanceof Sell_Paid == true)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah Invoice Type bukan Sell _Paid");
        }
    
    }
    
    public void orderRefurbishedItem(Item item)
    {
        
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        Invoice order1 = new Invoice(1, item, date, 10, item.getPrice()); 
        
        if (order1 instanceof Sell_Paid == true)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah Invoice Type bukan Sell _Paid");
        }
    
        
        
        item.printData();
        order1.printData(); 
        
    }
    
    public void sellItemPaid(Item item)
    {
     String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
     
     
     
     
     item.setStatus(ItemStatus.valueOf("Sold"));
     
     order1.printData();
     
     
     
     
     
    }
    
    public void sellItemUnpaid(Item item)
    {
     String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
     
     
     
     
     item.setStatus(ItemStatus.valueOf("Sold"));
     
     order1.printData();
    }
    
    public void sellItemInstallment(Item item)
    {
     String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
     
     
     
     
     item.setStatus(ItemStatus.valueOf("Sold"));
     
     order1.printData();
    }


}
