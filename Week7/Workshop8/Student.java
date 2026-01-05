package Week7.Workshop8;


public class Student
{ //attributes
    private String name;
    private int id;
    private String add;
    private long phno;
    private String collegename;
    //constructors
    public Student(String name, int ID,String add, long phno, String collegename)
    {this.name= name;
    this.id= id;
    this.add= add;
    this.phno= phno;
    this.collegename= collegename;
    }
    
    // setters and getters methods
    public void SetName(String name)
    {this.name= name;
    }
    
    public String getName()
    {return this.name;
    }
    
    
    // getters and setters for id as well
    public void setID(int id)
    {
     this.id= id;
    }
    
    public int getID()
    {
        return this.id;
    }
    
   public void setadd(String add)
{
this.add = add;
}

public String getadd(){
return this.add;
}
public void setphno(long phno){

this.phno = phno;
}

public long getphno()
{

return this.phno;
}
public void setcollegename(String collegename){

this.collegename = collegename;
}

public String getcollegename()
{

return this.collegename;
}

    public void displayInfo()
    {
      System.out.println("Name of student is: "+ this.name);
      System.out.println("id of student is: "+  this.id);
      System.out.println("Address: "+this.add);
      System.out.println("Phone no.: "+this.phno);

    }
}