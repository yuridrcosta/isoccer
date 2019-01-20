package isoccer;
public class TrainingCenter {
    
    private int code;
    private boolean available;
    private int bedrooms;

    public TrainingCenter(int code, int bedrooms) {
        this.code = code;
        this.available = true;
        this.bedrooms = bedrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getCode() {
        return code;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    
    
    
}
