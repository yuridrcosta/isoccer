package isoccer;


public class Driver extends Employee {
    
    private int drivingLicense;
    
    public Driver() {
        super(null, null, null, 0, 0,"Motorista");
        this.drivingLicense = -1;//NOT LICENSED
    }

    public Driver(String name, String email, String cpf, float salary, int phone,int dl) {
        super(name,email,cpf,salary,phone,"Motorista");
        this.drivingLicense = dl;
    }

    public int getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(int drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
    
}
