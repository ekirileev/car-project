public class Phone extends Device {
    
    public Phone(int id, int price) {
        super(id, price, null);
    }
    
    public Phone(int id, int price, String ip) {
        super(id, price, ip);
    }
    
    public String getDeviceType() {
        return "Phone";
    }
    
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
    public int hashCode() {
        return super.hashCode();
    }
}
