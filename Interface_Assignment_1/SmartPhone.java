package Interface_Assignment_1;

public class SmartPhone extends Mobile implements Testable {
    private String networkGeneration;

    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
        super(name, brand, operatingSystemName, operatingSystemVersion);
        this.networkGeneration = networkGeneration;
    }

    public String getNetworkGeneration() {
        return this.networkGeneration;
    }

    public void setNetworkGeneration(String networkGeneration) {
        this.networkGeneration = networkGeneration;
    }

    public boolean testCompatibility() {
        if(super.getOperatingSystemName() == "Saturn") {
            if(this.networkGeneration == "3G") {
                if(super.getOperatingSystemVersion() == "1.1" || super.getOperatingSystemVersion() == "1.2" || super.getOperatingSystemVersion() == "1.3") {
                    return true;
                }
                return false;
            }
            else if(this.networkGeneration == "4G") {
                if(super.getOperatingSystemVersion() == "1.2" || super.getOperatingSystemVersion() == "1.3") {
                    return true;
                }
                return false;
            }
            else if(this.networkGeneration == "5G") {
                if(super.getOperatingSystemVersion() == "1.3") {
                    return true;
                }
                return false;
            }
        }
        else if(super.getOperatingSystemName() == "Gara") {
            if(this.networkGeneration == "3G") {
                if(super.getOperatingSystemVersion() == "EXRT.1" || super.getOperatingSystemVersion() == "EXRT.2" || super.getOperatingSystemVersion() == "EXRU.1") {
                    return true;
                }
                return false;
            }
            else if(this.networkGeneration == "4G") {
                if(super.getOperatingSystemVersion() == "EXRT.2" || super.getOperatingSystemVersion() == "EXRU.1") {
                    return true;
                }
                return false;
            }
            else if(this.networkGeneration == "5G") {
                if(super.getOperatingSystemVersion() == "EXRU.1") {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
    
}
