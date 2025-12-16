
/**
 * Write a description of class week6tut1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week6tut1
{ public static void main(String[] args)
    { int[] age; // declaring an array
        age= new int[5]; // constructing an array
        
        System.out.println(age.length); // finding length of an array
        
        //first index= 0, lastIndex= age.length-1= 5-1= 4;
        
        age[0]= 10;
        age[1]= 20;
        age[2]= 30;
        age[3]= 40;
        age[4]= 50;
        
        
        int[] agr= {5,10,15,20,25}; // all in one
        
        System.out.println(agr.length); //5 
        System.out.println(agr[0]); // 5
        
        
        for(int i= 0; i< agr.length; i++)
        { System.out.println(agr[i]);
            
        }
        for(int i= agr.length-1; i>=0; i--)
        {System.out.println(agr[i]);
        }
        int sum=0;
        for(int i=0; i< agr.length; i++)
        {sum = sum + agr[i];
         } 
         System.out.println(sum);
         
         // 2D array 
         
          int[][] matrix= { {1,2,3}, {4,5,6}, {7,8,9}, {10,11,12} };
          
          System.out.println(matrix.length); // length= 4, index= length-1=3
          
          for(int i=0; i< matrix.length; i++)
          {  
              for(int j=0; j< matrix[i].length; j++)
              { System.out.print(matrix[i][j]);
                }
                System.out.println();
            
          }
        
        
    
        
        
    






}
}