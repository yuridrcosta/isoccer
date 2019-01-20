
package isoccer;

public class Lawyer extends Employee{
    
    public Lawyer() {
        super(null, null, null, 0, 0,"Advogado");
    }

    public Lawyer(String name, String email, String cpf, float salary, int phone) {
        super(name,email,cpf,salary,phone,"Advogado");
    }
    
}
