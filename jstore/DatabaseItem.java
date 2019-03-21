
/**
 * Class DatabaseItem to keep track of jstore's items
 *
 * @author Abby Savero
 * @version 7/3/19
 */
public class DatabaseItem
{
    private static String[] listitem;
    public static Item ItemDB;
        
    public static boolean addItem(Item item)
    {
       ItemDB = item;
       return true;
    }
    
    public static boolean removeItem(Item item)
    {
       ItemDB = item;
       return true;
    }
    
    public static Item getItem()
    {
       return ItemDB;
    }
    
    public static String[] getItemDatabase()
    {
       return listitem;
    }
}
