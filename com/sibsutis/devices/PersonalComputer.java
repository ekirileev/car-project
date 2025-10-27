public class PersonalComputer extends Device {
    
    public PersonalComputer(int id, int price) {
        super(id, price, null);
    }
    
    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }
    
    public String getDeviceType() {
        return "PersonalComputer";
    }
    
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
    public int hashCode() {
        return super.hashCode();
    }
}
