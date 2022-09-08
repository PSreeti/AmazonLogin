package Constructor;

public class Employee1 {

    public String name;
    public int empId;
    public String department;

    public Employee1()
    {                                          // default const
        System.out.println("Default");
    }

    public Employee1(String name1, int empId1)
    {
        name = name1;
        empId= empId1;
        //this.name = name
        //System.out.println("name is " + name + " emp id is " + empId);
    }
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Preeti" , 12);
        System.out.println(e1.name + " " + e1.empId);

    }
}