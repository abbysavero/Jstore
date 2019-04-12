
/**
 * Class Item shows the specific types of items in jstore.
 *
 * @author Abby Savero
 * @version 7/3/19
 */
public class Item
{
    private int id;
    private String name;
    private int stock;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;

    
    public Item(int id, String name, int stock, int price, ItemStatus status, Supplier supplier, ItemCategory category)
    {
        this.id = (DatabaseItem.getLastItemId()+1);
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.category = category;
        this.supplier = supplier;
        
    }

    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getStock()
    {
        return stock;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public ItemCategory getCategory()
    {
        return category;
    }
    
    public ItemStatus getStatus()
    {
        return status;
    }
    
    public Supplier getSupplier()
    {
        return supplier;
    }
   
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;  
    }
    
    public void setStock(int stock)
    {
        this.stock = stock;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    public void setCategory(ItemCategory category)
    {
        this.category = category;
    }
    
    public void setStatus(ItemStatus status)
    {
        this.status = status;
    }
    
    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }
    
    public void printData()
    {
        System.out.println("\n======== ITEM ========");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Category: " + category);
		System.out.println("Status: " + status);
		System.out.println("Supplier: " + supplier.getName());
        
    }
}
