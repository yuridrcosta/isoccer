package isoccer;


public class Employee extends Person{
    
    private float salary;
    private String function;

    public Employee(String name, String email, String cpf, float salary,int phone,String fct) {
        super(name, email, cpf, phone);
        this.function = fct;
        this.salary = salary;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
    
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
