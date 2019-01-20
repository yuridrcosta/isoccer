
package isoccer;

public class Partner extends Person {
    
    private float contribution;
    private boolean compliance;//ADIMPLÊNCIA
    private int type; //1 for junior, 2 for senior, 3 for elite
    
    public Partner(String name, String email, String cpf,int phone, float contrib, int tp) {
        super(name, email, cpf, phone);
        this.contribution = contrib;
        this.compliance = true;
        this.type = tp;
    }

    public float getContribution() {
        return contribution;
    }

    public boolean isCompliance() {
        return compliance;
    }

    public void setCompliance(boolean compliance) {
        this.compliance = compliance;
    }

    public void setContribution(float contribution) {
        this.contribution = contribution;
    }    

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    
    
}
