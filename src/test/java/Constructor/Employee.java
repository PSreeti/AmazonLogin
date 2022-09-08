package Constructor;

import org.apache.hc.client5.http.entity.DecompressingEntity;

public class Employee {

    public String name;
    public int empId;
    public String department;

    public static void main(String[] args) {

        Employee e = new Employee();
        e.department = "IT";
        e.empId = 123;
        e.name = "Preeti";

    }
}
