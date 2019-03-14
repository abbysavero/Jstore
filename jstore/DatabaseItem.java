
/**
 * Class DatabaseItem to keep track of jstore's items
 *
 * @author Abby Savero
 * @version 7/3/19
 */
public class DatabaseItem
{
    private String[] listitem;
    public Item ItemDB;
        
    public boolean addItem(Item item)
    {
       this.ItemDB = item;
       return true;
    }
    
    public boolean removeItem(Item item)
    {
       this.ItemDB = item;
       return true;
    }
    
    public Item getItem()
    {
       return ItemDB;
    }
    
    public String[] getItemDatabase()
    {
       return listitem;
    }
}
