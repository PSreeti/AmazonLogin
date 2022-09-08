package Interface;

public class Database implements  Employee2 {

    @Override
    public void name() {
        System.out.println("Preeti");
    }
    
    @Override
    public void departments() {
        System.out.println("IT");
    }


    public static void main(String[] args) {
        Database e = new Database();
        e.name();
        e.departments();
        int salary1 = Employee1.salary;
        System.out.println(salary1);
        int experience1 = Employee2.experience;
        System.out.println(experience1);

    }
}