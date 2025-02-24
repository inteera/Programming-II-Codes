


public class IpAddress {
    private int ipAddress;
    private int firstUsableAddress;
    private int lastUsableAddress;
    private int broadcastAddress;
    private int subnetMask;
    
    public IpAddress(int ipAddress, int subnetMask){
        this.ipAddress = ipAddress;
        this.subnetMask = subnetMask;
        
        int interval = ~subnetMask + 1;
        
        this.firstUsableAddress = ipAddress + 1;
        this.lastUsableAddress = ipAddress + interval - 2;
        this.broadcastAddress = ipAddress + interval - 1;
    }

    public int getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(int ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getFirstUsableAddress() {
        return firstUsableAddress;
    }

    public void setFirstUsableAddress(int firstUsableAddress) {
        this.firstUsableAddress = firstUsableAddress;
    }

    public int getLastUsableAddress() {
        return lastUsableAddress;
    }

    public void setLastUsableAddress(int lastUsableAddress) {
        this.lastUsableAddress = lastUsableAddress;
    }

    public int getBroadcastAddress() {
        return broadcastAddress;
    }
    public void setBroadcastAddress(int broadcastAddress) {
        this.broadcastAddress = broadcastAddress;
    }

    public int getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(int subnetMask) {
        this.subnetMask = subnetMask;
    }
    
}
