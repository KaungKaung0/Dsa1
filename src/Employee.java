public class Employee {

    private String emp_name;
    private String emp_address;
    private String emp_phnum;
    private int emp_age;

    // Creating a constructor
    public Employee(String empname, String empadress, String empphnum, int age) {
        emp_name = empname;
        emp_address = empadress;
        emp_phnum = empphnum;
        emp_age = age;
    }
    public String getEmp_name(){
        return emp_name;
    }
    public String getEmp_address(){
        return emp_address;
    }
    public String getEmp_phnum(){
        return emp_phnum;
    }
    public int getEmp_age(){
        return emp_age;
    }
 
    

}