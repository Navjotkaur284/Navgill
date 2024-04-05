package Class;

public class Employee {

    int id;
    String name;

    public void printEmployeeDetails(String name, int id){
        System.out.println("Something");
    }

    public static void main (String[] args){

    Employee employee = new Employee();

    employee.printEmployeeDetails("Sonu", 101);
    }
}
