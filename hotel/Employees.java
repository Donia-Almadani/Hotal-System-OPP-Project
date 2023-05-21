
package hotel;


public  class  Employees {
    
    private String id;
    private String name;
    private String email;
    public  static int numOfEmployees=0;

    public Employees() {
        numOfEmployees++;
    }
    
    public Employees(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        numOfEmployees++;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        return"Name:"+name+"  Email: "+email+"id";
    }
    
    public boolean compare(String i){

      if(i.equals(this.id))
          return true;
      else return false;
    }
    
    public boolean compareName(String i){

     if(i.equals(this.name))
        return true;
      else return false;
    }
    
   
}
