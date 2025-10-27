public abstract class Device implements Printable {
    int id;
    int price;
    String ip;
    
    public Device(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }
    
    public abstract String getDeviceType();
    
    public String sprint() {
        return "Device id=" + id + " price=" + price + " ip=" + ip;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Device other = (Device) obj;
        return id == other.id && price == other.price && 
               (ip == null ? other.ip == null : ip.equals(other.ip));
    }
    
    public int hashCode() {
        return java.util.Objects.hash(id, price, ip);
    }
}
