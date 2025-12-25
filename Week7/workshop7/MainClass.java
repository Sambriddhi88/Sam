package Week7.workshop7;
import javax.swing.Box;


/**
 * Write a description of class MainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass
{public static void main(String [] args)
    
    
{
  Book b1= new Book();
  b1.title="Harry Potter";
  b1.author="JK Rowling";
  b1.price=1000;
  
  System.out.println(b1.title);
  System.out.println(b1.author);
  System.out.println(b1.price);
    
  
   Book b2= new Book();
   b2.title="Muna Madan";
   b2.author="Laxmi Prasad Devkota";
   b2.price=390;
  System.out.println(b2.title);
  System.out.println(b2.author);
  System.out.println(b2.price);
  
  
  
  
  
  Rectangle r1= new Rectangle();
  r1.length=20;
  r1.breadth=18;
  r1.display();
  
  Rectangle r2= new Rectangle();
  r2.length=22;
  r2.breadth=11;
  r2.display();
  
  
  Employee e1= new Employee();
  e1.ID="123";
  e1.name="Ram";
  e1.salary= 10000;
  
  Employee e2= new Employee();
  e2.ID="456";
  e2.name="Sam";
  e2.salary=25000;
  
  Employee e3= new Employee();
  e3.ID="789";
  e3.name="Sanchu";
  e3.salary=58000;
  
  
  
        Laptop l1 = new Laptop("ASUS", 4, 65000);
        Laptop l2 = new Laptop("Acer", 8, 85000);
        Laptop l3 = new Laptop("Dell", 16, 120000);
       
        l1.displaydetails();
        l2.displaydetails();
        l3.displaydetails();
       
        Mobile m1 = new Mobile("Apple", 100000);
        Mobile m2 = new Mobile("Samgsung", 85000);
        Mobile m3 = new Mobile("xiomi", 120000);
       
        m1.isAffordable();
        m2.isAffordable();
        m3.isAffordable();
       
        Result o1 = new Result(30,85,60);
        Result o2 = new Result(85,70,57);
       
        o1.total();
        o2.total();
    }
}  
  
  
  

    

