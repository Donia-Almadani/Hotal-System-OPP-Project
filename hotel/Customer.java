
package hotel;

public class Customer {
    private String name;
    private String id;
    private String phone;
    private double cost;

    public Customer() {
    }

    public Customer(String name, String id, String phone, double cost) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.id = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
     public boolean compareCustomerInfo(String i){

      if(i.equals(getId()))
          return true;
      else return false;
    }
   
}
