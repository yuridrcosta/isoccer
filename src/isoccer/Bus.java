package isoccer;

public class Bus {
    
    private int code;
    private boolean available;

    public Bus(int cd) {
        this.code = cd;
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
 
}
