
/**
 * Write a description of class WORKSHOP03_1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations_java
{public static void main(String[] args)
    { int a= 10;
      int b=7;
      // Airthmetic operator
      int sum = a + b;
      int diff = a - b;
      int multiply = a * b;
      int division = a / 2;
       
       System.out.println("Sum= "+sum+ "\tDifference = "+diff+"\tmultiply = "+multiply+"\tdivision = "+division+"");
        
       // Unary operator
       System.out.println(++a);
       System.out.println(a++);
    
       // Relational operator
       System.out.println(a > b);
       System.out.println(a != b);
        
       // Logical operator
       System.out.println(a > b & a != b);
       
       // ternary
       String isValid = (a > b) ? "A is greater than B" : "B is greater than A";
       
       System.out.println(isValid);
       
      
        
    
    
    
    
    
    
    
    }
}