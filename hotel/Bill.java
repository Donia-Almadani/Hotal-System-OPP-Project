
package hotel;

/**
 *
 * @author Donia
 */
public  class Bill implements InterfaceBill{
    private double totalCost;
    private double price;
    private int day;
    public static int billNum=0;
    
    public Bill(){
        billNum++;
    }

    public Bill(double price,int day) {
        this.price = price;
        
        billNum++;
    }
    //-----------------------------------
    
    public void setPrice(double price) {
        this.price = price;
    }
    
   public double getTotalCost(){
       return totalCost;
   }
    @Override
    public void calculateCost(int Day) {
       
      this.totalCost=price*TAX*Day;
       
    }

    @Override
    public String printBill() {
        
      return"\n___________total Cost: "+getTotalCost()+"___________\n****************Bill number: "+Bill.billNum+"******************";
    }
    
    
    
}
