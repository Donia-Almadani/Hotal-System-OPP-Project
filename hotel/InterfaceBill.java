package hotel;

/**
 *  Bill Interface class 
 * @author Donia
 */
 public interface InterfaceBill {
     /**
      * tax rate
      */
   public static final double TAX=1.15;
   public void calculateCost(int Day);
   public String printBill();
       
   
}
