
package isoccer;

public class Player extends Employee{
    
    private String position;
    private boolean healthy;
    
    public Player() {
        super(null, null, null, 0, 0,"Jogador");
    }

    public Player(String name, String email, String cpf, float salary, int phone, String pos) {
        super(name,email,cpf,salary,phone,"Jogador");
        this.position = pos;
        this.healthy = true;
    }

    public String getPosition() {
        return position;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
}
