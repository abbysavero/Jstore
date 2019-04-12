import java.util.ArrayList;

/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE;
    private static int LAST_INVOICE_ID = 0;

    public static ArrayList<Invoice> getInvoiceDatabase()
    {
       //this.supplier = supplier;
       return INVOICE_DATABASE;
    }
    
    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }
    
    public static boolean addInvoice(Invoice invoice)
    {
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID=invoice.getId();
        return true;
    }
    
    public static Invoice getInvoice(int id)
    {
        Invoice temp = null;
        for(int i = 0; i<INVOICE_DATABASE.size();i++) {
            if(INVOICE_DATABASE.get(i).getId()==id) {
                temp = INVOICE_DATABASE.get(i);
            }
        }
       return temp;
    }
    
    public static Invoice getActiveOrder(Customer customer)
    {
        Invoice temp = null;
        for(int i = 0; i<INVOICE_DATABASE.size();i++) {
            if(INVOICE_DATABASE.get(i).getCustomer() == customer && INVOICE_DATABASE.get(i).getIsActive()==true) {
                temp = INVOICE_DATABASE.get(i);
            }
        }
        return temp;
    }
    
    public static boolean removeInvoice(int id)
    {
        boolean result = false;
        for(int i = 0; i<INVOICE_DATABASE.size();i++) {
            if(INVOICE_DATABASE.get(i).getCustomer().getId()==id) {
                if(INVOICE_DATABASE.get(i).getIsActive()==false) {
                    INVOICE_DATABASE.remove(i);
                    result = true;
                }
                else {
                    INVOICE_DATABASE.get(i).setIsActive(true);
                }
            }
        }
        return result;
    }
}

