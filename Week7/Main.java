package Week7;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{public static void main(String[] args)
{
    Student s1= new Student();
    s1.collegeID="np018899";
    s1.name="Sambriddhi";
    s1.age=19;
    s1.study();
    System.out.println(s1.collegeID);
    System.out.println(s1.name);
    System.out.println(s1.age);
    
    
    
    Student s2= new Student();
    s2.collegeID="np01234";
    s2.name="Sanchit";
    s2.age=19;
    s2.laugh();
    System.out.println(s2.collegeID);
    System.out.println(s2.name);
    System.out.println(s2.age);
    
    
    Car c1=new Car();
    c1.color="Black";
    c1.model="2014";
    c1.price=10000000;
    c1.brand="Hyundai";
    c1.stable();
    System.out.println(c1.color);
    System.out.println(c1.model);
    System.out.println(c1.price);
    System.out.println(c1.brand);
    
    
    
    Car c2= new Car();
    c2.color="Blue";
    c2.model="2024";
    c2.price= 40000000;
    
      
    
    

}
}