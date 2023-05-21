
package hotel;

import java.util.*;

/**
 *
 * @author Donia
 */
public class Hotel {
    
    
   
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      
      //----------------------------------------------
      ArrayList<Employees> employees=new ArrayList<Employees>();
     employees.add(new Employees("1234567","Donia","Donia@gmail.com"));
     employees.add(new Employees("7654321","sara","sara@gmail.com"));
     employees.add(new Employees("11223344","leen","leen@gmail.com"));
     employees.add(new Employees("44332211","noura","noura@gmail.com"));
              
      //----------------------------------------------
      //room------------------------------------------
     Room[] room=new Room[RoomsManage.TOTAL_ROOM_NUM]  ;    
     room[0]=new Room(100,false,500);
     room[1]=new Room(101,false,500);
     room[2]=new Room(102,false,1000);
     room[3]=new Room(103,false,1000);
     room[4]=new Room(104,false,1000);
     room[5]=new Room(105,false,500);
     room[6]=new Room(106,false,700);
     room[7]=new Room(107,false,700);
     room[8]=new Room(108,false,1000);
     room[9]=new Room(200,false,2000);
     room[10]=new Room(201,false,2000);
     room[11]=new Room(202,false,2050);
     room[12]=new Room(203,false,2050);
     room[13]=new Room(204,false,2000);
     room[14]=new Room(205,false,2000);
     
     
        System.out.println("-------------Welcome------------");
        System.out.println("--------------------------------");
      
       //=====================================================================
       // if ID true
              boolean flag=false;
        for(;flag==false;){
        System.out.print("Enter your ID: "); String userID=in.next();
       
        for(int i=0;i<employees.size();i++){
            
             if((employees.get(i)).compare(userID)){   
             
                  System.out.println("Hello "+employees.get(i).getName());flag=true; break;
              }    
        }
              if(!flag){
                 System.out.println("ID not found");
              }
        }
        
        //===================================================================
        //Services
        int num1=1;
        do{
        System.out.println("-------------------\n1-add employee\n2-guest bill\n3-new guest\n4-room information\n5-print employee email\n6-Print Customers information\n7-chang room status\n8-change Room information\n9-Log Out\n0-End\n-------------------\nEnter services num");
        int num=in.nextInt();
        
        
        
        if(num==1){
            System.out.print("Enter Name: ");String name=in.next();System.out.print("\nEnter Email: ");String email=in.next();
            System.out.print("\nEnter ID: ");String id=in.next();
            employees.add(new Employees(id,name,email));
        }
        
        
        else if(num==2){
            System.out.print("Costemar ID: ");String id=in.next();
            for(int i=0;i<CustomerInfo.newCustomer.size();i++){
               if(CustomerInfo.newCustomer.get(i).compareCustomerInfo(id)){
                 CustomerInfo obj=(CustomerInfo) CustomerInfo.newCustomer.get(i);
                System.out.print("Enter number of days: ");int day=in.nextInt();
                   
                   System.out.println("************************************");
                   System.out.print("\n"+obj.toString());
                  
                   obj.myBill(day);
                   
                 break;
               }
               else {System.out.println("ID not found");
                   
               }   
            }
         
        }
        else
            end: if(num==3){
            System.out.print("Enter Customer name:");String name=in.next();
            System.out.print("Enter Customer id:");String id=in.next();
            System.out.print("Enter Customer  phone:");String  phone=in.next();
            
            for(int i=0;i<CustomerInfo.newCustomer.size();i++){
             if(CustomerInfo.newCustomer.get(i).compareCustomerInfo(id)){
                 System.out.println("***Unavailable ID***");
                 break end;
             }    
            }
         
            System.out.print("Enter room number: ");int roomnum=in.nextInt();
            
              for(int i=0;i<room.length;i++){
            
                 if((room[i].getRoomNum())==roomnum){
                    if(room[i].isStatus()){System.out.println("**Unavailable room**");
                    }
                    else {System.out.println("available"); room[i].changeStatus();
                    CustomerInfo.addCustomer(new CustomerInfo(name,id, phone,room[i].getPrice(),roomnum));
                    
                    } 
                  }   
              }
             
        }
        else if(num==4){
          for(int i=0;i<room.length;i++){
              System.out.println(room[i]+"\n_______________________________________");
              
          }  
        }
        else if(num==5){
            System.out.print("Enter the employee's name: "); String name=in.next();
            boolean flag1=false;
            for(int i=0;i<employees.size();i++){
          if((employees.get(i)).compareName(name)){
              System.out.println("Email: "+employees.get(i).getEmail());flag1=true;
          }
        }
            if(!flag1){
                 System.out.println("Not found");
            }
            
        }
        else if(num==6){
            for(int i=0;i<CustomerInfo.newCustomer.size();i++){
              System.out.println(CustomerInfo.newCustomer.get(i));
              
          }  
            
        }
        else if(num==7){
                System.out.print("Enter room number: ");int room1=in.nextInt();
                for(int i=0;i<room.length;i++){
                     if((room[i].getRoomNum())==room1){
                         room[i].changeStatus();
                     }
                }     
        }
        else if(num==8){
                System.out.println("Enter room number:");int room2=in.nextInt();
                for(int i=0;i<room.length;i++){
                     if((room[i].getRoomNum())==room2){
                         System.out.print("\nEnter new room number"); int roomnew=in.nextInt();
                         System.out.print("\nEnter new room status"); boolean statusnew=in.nextBoolean();
                          System.out.print("\nEnter new room price"); int pricenew=in.nextInt();
                       Object m=RoomsManage.changeRoom(room[i],roomnew,statusnew,pricenew);
                       room[i]=(Room)m;
                     }
                }    
                
        }
        else if(num==9){
             boolean flag0=false;
        for(;flag0==false;){
        System.out.print("Enter your ID: "); String userID=in.next();
       
        for(int i=0;i<employees.size();i++){
            
             if((employees.get(i)).compare(userID)){   
             
                  System.out.println("Hello "+employees.get(i).getName());flag0=true; break;
              }    
        }
              if(!flag0){
                 System.out.println("ID not found");
              }
        }
            
        }
        else if(num==0){
            System.out.println("End of program");
            num1=0;
        }
        else System.out.println("Sorry,the service number is not available");
        
        }while(num1!=0);
        
    }
    
}
