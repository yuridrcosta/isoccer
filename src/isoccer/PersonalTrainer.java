
package isoccer;


public class PersonalTrainer extends Employee{
    public PersonalTrainer() {
        super(null, null, null, 0, 0,"Preparador Físico");
    }

    public PersonalTrainer(String name, String email, String cpf, float salary, int phone) {
        super(name,email,cpf,salary,phone,"Preparador Físico");
    }
}
