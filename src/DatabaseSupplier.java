import java.util.ArrayList;

/**
 * Write a description of class DatabaseSupplier here.
 *
 * @author Abby Savero
 * @version 7/3/19
 */
public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private static ArrayList<Supplier> SUPPLIER_DATABASE;
    private static int LAST_SUPPLIER_ID = 0;
        
    public static ArrayList<Supplier> getSupplierDatabase()
    {
       return SUPPLIER_DATABASE;
    }
    
    public static int getLastSupplierID()
    {
       return LAST_SUPPLIER_ID;
    }
    
    public static boolean addSupplier(Supplier supplier)
    {
        boolean result = false;
        for(int i=0;i<SUPPLIER_DATABASE.size();i++) {
            //Name check
            if(SUPPLIER_DATABASE.get(i).getName().equals(supplier.getName())) {
                //If name already exist, end loop
                i = SUPPLIER_DATABASE.size();
            }
            else {
                //Check status
                if(SUPPLIER_DATABASE.get(i).getEmail().equals(supplier.getEmail())) {
                    i = SUPPLIER_DATABASE.size();
                }
                else {
                    if(SUPPLIER_DATABASE.get(i).getPhoneNumber().equals(supplier.getPhoneNumber())) {
                        i = SUPPLIER_DATABASE.size();
                    }
                    else {
                        SUPPLIER_DATABASE.add(supplier);
                        LAST_SUPPLIER_ID=supplier.getId();
                        result = true;
                    }
                }
            }
        }
        return result;
    }
    
    public static Supplier getSupplier(int id)
    {
        Supplier temp = null;
        for(int i = 0;i<SUPPLIER_DATABASE.size();i++) {
            if(SUPPLIER_DATABASE.get(i).getId()==id){
                temp = SUPPLIER_DATABASE.get(i);
            }
        }
        return temp;
    }
    
    public static boolean removeSupplier(int id)
    {
        boolean result = false;
        for(int i = 0;i<SUPPLIER_DATABASE.size();i++){
            if(SUPPLIER_DATABASE.get(i).getId()==id){
                SUPPLIER_DATABASE.remove(i);
                result=true;
            }
        }
        return result;
    }
}
