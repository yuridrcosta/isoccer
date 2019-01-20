
package isoccer;


public class Doctor extends Employee {
    
    private int crm;
    
    public Doctor() {
        super(null, null, null, 0, 0,"Médico");
    }

    public Doctor(String name, String email, String cpf, float salary, int phone,int cregister) {
        super(name,email,cpf,salary,phone,"Médico");
        this.crm = cregister;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }
       
}
