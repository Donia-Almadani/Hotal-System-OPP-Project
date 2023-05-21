
package hotel;


public class Room extends RoomsManage{
   private int roomNum;
   private boolean status;
   private int price;

    public Room() {
    }
   

    public Room(int roomNum, boolean status,int price) {
        this.roomNum = roomNum;
        this.status = status;
        this.price=price;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public boolean isStatus() {
        return status;
    }

    public int getPrice() {
        return price;
    }
    
   
    
    
    
    public void changeStatus(){
      status=!(status);
    }
    
    
   @Override
    public String toString(){
        String t;
        if(status==true){
          t="Unavailable";  
        }
        else t="available";  
        return"room number:  "+roomNum+"  room status: "+t+"  room price:  "+price+"SR";
    }
   
}
