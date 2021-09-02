
public class cars {                     //the super class cars
    private String Name;
    private int Id;
    private String owner_name;
    private int Owner_Id;
      //using return to geter
    String getName ()
      {return Name;}
      //using this to setter
     void setName (final String Name)
      {this.Name =Name;}
      //using return to geter
     int getID ()
      {return Id;}
      //using this to setter
    void setID (final int Id)
      {this.Id =Id;}
    //using return to geter
     int get_Owner_Id ()
      {return Owner_Id;}
      //using this to setter
     void set_Owner_Id (final int Owner_Id)
      {this.Owner_Id =Owner_Id;}
     //using return to geter
     String get_owner_name ()
      {return owner_name;}
      //using this to setter
    private void setowner_name  (final String owner_name)
      {this.owner_name =owner_name;}
     void  Get_Fuel_type(){
          System.out.println("choose fuel type please \n"
          + "1:Regular 87 octane \n "
          + "2:Midgrade 89  octane \n"
          + "3:Premium - 91 - 93 octane \n");
  }
}
//...............................................................................................................
class trucks extends cars                              //class trucks(sub class) inharites frome cars class
{     int capacity;
      //using return to geter
      int get_capacity ()
      {return capacity;}
      //using this to setter
      void set_capacity (final int capacity)
      {this.capacity =capacity;}
    void  Get_Fuel_type()
   {
          System.out.println("choose fuel type please \n"
          + "1:A:E85 \n "
          + "2:Premium - 91 \n");
   }
public static void main(String args[])                        // test method 
{
  cars lada = new cars();
  trucks Toyota = new trucks();
  lada.Get_Fuel_type();                                       //1)chech the inharitance (done)
  Toyota.Get_Fuel_type();
  lada.setName("model1");                                     //2)using geter and setter 
  lada.setID(1309);
  System.out.println("the lada id is "+lada.getID()+"\n");    
  Toyota.setID(123);
  System.out.println("the Toyota  id is "+Toyota.getID()+"\n");
}
}