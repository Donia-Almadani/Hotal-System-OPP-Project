
package hotel;

/**
 *
 * @author Donia
 */
import java.util.*;
public class CustomerInfo extends Customer{
    private int roomnum;
    private int day;
   
  public static ArrayList<Customer> newCustomer=new ArrayList<Customer>();
  
    public CustomerInfo() {
    }
  

    public CustomerInfo(String name, String id, String phone, double cost,int roomnum) {
        super(name, id, phone, cost);
        this.roomnum=roomnum;
       
        
        
    }
    
    public void myBill(int Day){
       Bill bill=new Bill(getCost(),Day);
       bill.calculateCost(Day);
        System.out.println(bill.printBill());
    }
    
   public static void addCustomer(Object O ){
     CustomerInfo m=(CustomerInfo) O;
     newCustomer.add(m);
   }
   
    
    @Override
  public String toString(){
      return "name: "+getName()+"      ID: "+getId()+"      phone: "+getPhone()+"     Room number:"+roomnum;
  }
 
}
