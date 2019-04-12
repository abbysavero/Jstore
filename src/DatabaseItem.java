import java.util.ArrayList;

/**
 * Class DatabaseItem to keep track of jstore's items
 *
 * @author Abby Savero
 * @version 7/3/19
 */
public class DatabaseItem
{
    private static ArrayList<Item> ITEM_DATABASE;
    private static int LAST_ITEM_ID = 0;
        
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    
    public static int getLastItemId()
    {
       return LAST_ITEM_ID;
    }
    
    public static boolean addItem(Item item)
    {
        boolean result = false;
        for(int i=0;i<ITEM_DATABASE.size();i++) {
            //Name check
            if(ITEM_DATABASE.get(i).getName().equals(item.getName())) {
                //If name already exist, end loop
                i = ITEM_DATABASE.size();
            }
            else {
                //Check status
                if(ITEM_DATABASE.get(i).getStatus()==item.getStatus()) {
                    i = ITEM_DATABASE.size();
                }
                else {
                    if(ITEM_DATABASE.get(i).getSupplier()==item.getSupplier()) {
                        i = ITEM_DATABASE.size();
                    }
                    else {
                        ITEM_DATABASE.add(item);
                        LAST_ITEM_ID=item.getId();
                        result = true;
                    }
                }
            }
        }
       return result;
    }
    
    public static Item getItemFromID(int id)
    {
        Item temp = null;
        for(int i = 0;i<ITEM_DATABASE.size();i++) {
            if(ITEM_DATABASE.get(i).getId()==id){
                temp = ITEM_DATABASE.get(i);
            }
        }
       return temp;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> result = null;
        for(int i=0;i<ITEM_DATABASE.size();i++) {
            if(ITEM_DATABASE.get(i).getSupplier()==supplier) {
                result.add(ITEM_DATABASE.get(i));
            }
        }
        return result;
    }
    
    public static ArrayList<Item> getItemFromCategory(ItemCategory category)
    {
        ArrayList<Item> result = null;
        for(int i=0;i<ITEM_DATABASE.size();i++) {
            if(ITEM_DATABASE.get(i).getCategory()==category) {
                result.add(ITEM_DATABASE.get(i));
            }
        }
        return result;
    }
    
    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
    {
        ArrayList<Item> result = null;
        for(int i=0;i<ITEM_DATABASE.size();i++) {
            if(ITEM_DATABASE.get(i).getStatus()==status) {
                result.add(ITEM_DATABASE.get(i));
            }
        }
        return result;
    }
    
    public static boolean removeItem(int id)
    {
        boolean result = false;
        for(int i = 0;i<ITEM_DATABASE.size();i++){
            if(ITEM_DATABASE.get(i).getId()==id){
                ITEM_DATABASE.remove(i);
                result=true;
            }
        }
        return result;
    }
    
}
