
/**
 * Class DatabaseItem to keep track of jstore's items
 *
 * @author Abby Savero
 * @version 7/3/19
 */
public class DatabaseItem
{
    private String[] listitem;
    private Item item;
        
    public boolean addItem(Item item)
    {
       this.item = item;
       return true;
    }
    
    public boolean removeItem(Item item)
    {
       this.item = item;
       return true;
    }
    
    public Item getItem()
    {
       return item;
    }
    
    public String[] getItemDatabase()
    {
       return listitem;
    }
}
