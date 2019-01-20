package isoccer;


public class Cooker extends Employee {
    
    public Cooker() {
        super(null, null, null, 0, 0,"Cozinheiro");
    }

    public Cooker(String name, String email, String cpf, float salary, int phone) {
        super(name,email,cpf,salary,phone,"Cozinheiro");
    }
    
}
