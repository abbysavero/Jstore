
/**
 * Write a description of class DatabaseSupplier here.
 *
 * @author Abby Savero
 * @version 7/3/19
 */
public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private String[] listSupplier;
    private Supplier supplier;
        
    public boolean addSupplier(Supplier supplier)
    {
       this.supplier = supplier;
       return true;
    }
    
    public void removeSupplier(Supplier supplier)
    {
       this.supplier = supplier;
    }
    
    public Supplier getSupplier()
    {
       return supplier;
    }
    
    public String[] getListSupplier()
    {
       return listSupplier;
    }
}
