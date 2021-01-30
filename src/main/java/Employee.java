public class Employee {
    public final static String COMPANY_NAME = "pragra";

    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    //copy contructor
    public Employee(Employee obj) {
        this.employeeId = obj.employeeId;
        this.name = obj.name;
    }

    public void work() {

    }

   public String toString() {
       System.out.println("TJJSHJSHSJ");
        return "LEARNING JAVA";
   }
}
/*
    when your variable are private who can access them

    1. Can you access private values of an object -- NO

 */
