import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(item.getId());
        Invoice order = new Buy_Paid(temp);
        //Invoice order1 = new Buy_Paid(1, item, date, 10, item.getPrice());
        
        if (order instanceof Sell_Paid == true)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah Invoice Type bukan Sell _Paid");
        }
    }

    
    public void orderSecondItem(Item item)
    {
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(item.getId());
        Invoice order = new Buy_Paid(temp);
        //Invoice order1 = new Buy_Paid(1, item, date, 10, item.getPrice());

        if (order instanceof Sell_Paid == true)
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
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(item.getId());
        Invoice order = new Buy_Paid(temp);
        //Invoice order1 = new Buy_Paid(1, item, date, 10, item.getPrice());

        if (order instanceof Sell_Paid == true)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah Invoice Type bukan Sell _Paid");
        }
    }
    
    public void sellItemPaid(Item item,Customer customer)
    {
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        item.setStatus(ItemStatus.valueOf("Sold"));
        //order1.printData();
    }
    
    public void sellItemUnpaid(Item item, Customer customer)
    {
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        item.setStatus(ItemStatus.valueOf("Sold"));
        //order1.printData();
    }
    
    public void sellItemInstallment(Item item, Customer customer, int installmentPeriod)
    {
        String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        item.setStatus(ItemStatus.valueOf("Sold"));
        //order1.printData();
    }
    
    public boolean finishTransaction(Invoice invoice)
    {
        boolean result = false;
        if(DatabaseInvoice.getInvoice(invoice.getId())!=null) {
            if(DatabaseInvoice.getInvoice(invoice.getId()).getIsActive()){
                DatabaseInvoice.getInvoice(invoice.getId()).setIsActive(false);
                result = true;
            }
            else {
                //Already in-active

            }
        }
        return result;
    }

    public boolean cancelTransaction(Invoice invoice)
    {
        boolean result = false;
        if(DatabaseInvoice.getInvoice(invoice.getId())!=null) {
            result = DatabaseInvoice.removeInvoice(invoice.getId());
        }
        return result;
    }


}
