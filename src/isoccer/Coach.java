
package isoccer;


public class Coach extends Employee{
    
    public Coach() {
        super(null, null, null, 0, 0,"Treinador");
    }

    public Coach(String name, String email, String cpf, float salary, int phone) {
        super(name,email,cpf,salary,phone,"Treinador");
    }
    
}
