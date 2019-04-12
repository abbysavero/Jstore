import java.util.ArrayList;

/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer {
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE;
    private static int LAST_CUSTOMER_ID = 0;

    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    public static boolean addCustomer(Customer customer) {
        boolean result = false;
        for(int i=0;i<CUSTOMER_DATABASE.size();i++) {
            //Name check
            if(CUSTOMER_DATABASE.get(i).getName().equals(customer.getName())) {
                //If name already exist, end loop
                i = CUSTOMER_DATABASE.size();
            }
            else {
                //Check status
                if(CUSTOMER_DATABASE.get(i).getEmail().equals(customer.getEmail())) {
                    i = CUSTOMER_DATABASE.size();
                }
                else {
                    CUSTOMER_DATABASE.add(customer);
                    LAST_CUSTOMER_ID=customer.getId();
                    result = true;
                }
            }
        }
        return result;
    }


    public static Customer getCustomer(int id) {
        Customer temp = null;
        for(int i = 0;i<CUSTOMER_DATABASE.size();i++) {
            if(CUSTOMER_DATABASE.get(i).getId()==id){
                temp = CUSTOMER_DATABASE.get(i);
            }
        }
        return temp;
    }

    public static boolean removeCustomer(int id) {
        boolean result = false;
        for(int i = 0;i<CUSTOMER_DATABASE.size();i++){
            if(CUSTOMER_DATABASE.get(i).getId()==id){
                CUSTOMER_DATABASE.remove(i);
                result=true;
            }
        }
        return result;
    }
}
