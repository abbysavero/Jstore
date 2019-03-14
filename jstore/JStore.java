
/**
 * Jstore class which acts as main.
 *
 * @author Abby Savero
 * @version 7/3/19
 */
public class JStore
{
    
    
    public JStore()
    {
        
    }

    public static void main(String[] args)
    {
        Location indo = new Location ("place","place","somewhere");
        Supplier depot = new Supplier (10,"abby","sa@gmail", "1234", indo);
        Item thing = new Item (1, "game", 3, 765, "game", depot);
        Invoice reciept = new Invoice (10, thing, "7/7/7", 1234);
        
        depot.printData();
        depot.setName("boi");
        depot.printData();
        
        System.out.println(depot.getEmail());
        
        
        
        
    }
}
