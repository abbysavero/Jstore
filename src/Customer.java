import java.util.*;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String username;
    private String password;
    private Calendar birthDate;

    public Customer( String name, String email, String username,
    String password, int id, Calendar birthDate)
    {
        this.id = (DatabaseCustomer.getLastCustomerID()+1);
        this.name = name;
        this.email = email;
        this.birthDate = Calendar.getInstance();
    }
    
    public Customer( String name, String email, String username,
    String password, int id, int year, int month, int dayOfMonth)
    {
        this.id = (DatabaseCustomer.getLastCustomerID()+1);
        this.name = name;
        this.email = email;
        this.birthDate = Calendar.getInstance();
        birthDate.set(year, month, dayOfMonth);
    }


    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public int getId()
    {
        return id;
    }
    
    public Calendar getBirthdate()
    {
        Date date = this.birthDate.getTime();
        SimpleDateFormat aformat = new SimpleDateFormat("dd MMMM yyyy");
        String adate = aformat.format(date);
        System.out.println("Birth date: " + adate);
        
        //System.out.printf("Birth date: %s" + adate);
        
        return this.birthDate;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        String pattern = 
        "(([a-zA-Z0-9&\\*_~]+(\\.?))+)[@]((\\w+)([\\.\\-]?))+";
        if (Pattern.matches(pattern ,email))
        {
             this.email = email;
             System.out.println("You have successfully changed your email");
        }
        else {
            this.email = null;
            System.out.println("Email is invalid");
        }
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    public void setPassword(String password)
    {
        String pattern = ".{6,}";
        String pattern1 = "(.*)[a-z]{1,}(.*)";
        String pattern2 = "(.*)[A-Z]{1,}(.*)";
        String pattern3 = "(.*)[0-9]{1,}(.*)";
        
        if (Pattern.matches(pattern, password)&& 
        Pattern.matches(pattern1, password))
        {
            this.password = password;
            System.out.println("You have changed your password successfully");
        }
        else
        {
            this.password = null;
            System.out.println("Invalid password!");
        }
        
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setBirthDate(Calendar birthDate)
    {
        this.birthDate = birthDate;
    }
    
    public void setBirthDate(int year, int month, int dayOfMonth)
    {
        this.birthDate = Calendar.getInstance();
        birthDate.set(year, month, dayOfMonth);
    }
    
    public String toString()
    {
        return "";
    }
}
