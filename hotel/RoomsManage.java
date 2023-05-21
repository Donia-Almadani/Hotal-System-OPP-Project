
package hotel;

/**
 *
 * @author Donia
 */
import java.util.Scanner;
public abstract class RoomsManage {
    
    Scanner in=new Scanner(System.in);
    public static final int TOTAL_ROOM_NUM=15; 

    public abstract void changeStatus();
    
     public static Object changeRoom(Object o ,int room,boolean status,int price){
      o=new Room(room,status,price);
         return o;
     }
    
    
}
