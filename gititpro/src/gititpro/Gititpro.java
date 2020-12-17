package gititpro;
public class Gititpro 
{
         int emp_id;
         double salary;
         String name;

    public Gititpro(int emp_id, double salary, String name) {
        this.emp_id = emp_id;
        this.salary = salary;
        this.name = name;
    }
         
         
         
   public static void main(String[] args) 
   {
      Gititpro g1 = new Gititpro(1,10000,"Mathi");
      Gititpro g2 = new Gititpro(2,30003,"Gopi");

      System.out.println(g1.salary);
   }
   

    
}
