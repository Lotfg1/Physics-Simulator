public class IWANNALEARNCPP {

    public static class Employee 
{ 
// Fields 
private String firstName; 
private String lastName; 
private int employeeID; 
private double salary; 
 // Methods 
public String get_firstName() 
{ 
 return firstName; 
} 
public String get_lastName() 
{ 
 return lastName; 
} 
public int get_employeeID() 
{ 
 return employeeID; 
}
public double get_salary() 
{ 
 return salary; 
} 
public void set_firstName(String new_firstName) 
{ 
 firstName = new_firstName; 
} 
public void set_lastName(String new_lastName) 
{ 
 lastName = new_lastName; 
} 
public void set_employeeID(int new_employeeID) 
{ 
 employeeID = new_employeeID; 
} 
public void set_salary(double new_salary) 
{ 
 salary = new_salary; 
} 
 // Constructor Method 
 public Employee(String f, String l, int e, double s) 
{ 
 firstName = f; 
 lastName = l; 
 employeeID = e; 
 salary = s; 
} 
} 
public static class Admin extends Employee {
    private final String pos;
    private  final int exten;
    public String get_position() {
        return pos;
    }
    public int get_extension() {
        return exten;
    }
    public Admin(String f, String l, int e, double s, String p, int ex) {
        super(f, l, e, s);
        pos = p;
        exten = ex;
    }
}
public static class Teacher extends Employee 
{ 
// Fields 
private final String department; 
private  final int homeroom; 
 // Methods 
public String get_department() 
{ 
 return department; 
} 
  
public int get_homeroom() 
{ 
 return homeroom;
} 
// Constructor Method 
public Teacher (String f, String l, int e, double s, String d, int h) 
{ 
 super(f, l, e, s);
 department = d; 
 homeroom = h; 
} 
} 

 public static void main (String[] args) 
 { 
 // Objects 
 Teacher teacher1 = new Teacher("H", "Chow", 1, 50000, "Computer Studies", 208);  Admin admin1 = new Admin("P", "Obadia", 2, 150000, "Principal", 101);   
 System.out.println("First Name: "+ teacher1.get_firstName()); 
 System.out.println("Last Name: " + teacher1.get_lastName()); 
 System.out.println("Employee ID: "+ teacher1.get_employeeID());  System.out.println("Annual Salary: "+ teacher1.get_salary()); 
 System.out.println("Department: "+ teacher1.get_department()); 
 System.out.println("Homeroom: "+ teacher1.get_homeroom()); 
  
 System.out.println("\nFirst Name: "+ admin1.get_firstName()); 
 System.out.println("Last Name: " + admin1.get_lastName()); 
 System.out.println("Employee ID: "+ admin1.get_employeeID()); 
 System.out.println("Annual Salary: "+ admin1.get_salary()); 
 System.out.println("Position: "+ admin1.get_position()); 
 System.out.println("Extension: "+ admin1.get_extension()); 
 } 
} 

