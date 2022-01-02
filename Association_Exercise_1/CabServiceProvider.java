package Association_Exercise_1;

public class CabServiceProvider {
    private String cabServiceName;
    private int totalCabs;

    public CabServiceProvider(String cabServiceName, int totalCabs) {
        this.cabServiceName = cabServiceName;
        this.totalCabs = totalCabs;
    }

    public double calculateRewardPrice(Driver driver) {
        if(this.cabServiceName == "Halo") {
            if(driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5) {
                return 10 * driver.getAverageRating();
            }
            else if(driver.getAverageRating() >= 4 && driver.getAverageRating() < 4.5) {
                return 5 * driver.getAverageRating();
            }
        }
        else if(this.cabServiceName == "Aber") {
            if(driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5) {
                return 8 * driver.getAverageRating();
            }
            else if(driver.getAverageRating() >= 4 && driver.getAverageRating() < 4.5) {
                return 3 * driver.getAverageRating();
            }
        }
        return 0;
    }

    public String getCabServiceName() {
        return this.cabServiceName;
    }

    public void setCabServiceName(String cabServiceName) {
        this.cabServiceName = cabServiceName;
    }

    public int getTotalCabs() {
        return this.totalCabs;
    }

    public void setTotalCabs(int totalCabs) {
        this.totalCabs = totalCabs;
    }
    
}
