public class Baker {
    private int bakerId;
    private String bakerCompanyName;
    private String bakerCountry;
    private String bakerWorkTime;
    private static int nextId = 0;

    public Baker(String bakerCompanyName, String bakerCountry, String bakerWorkTime) {
        this.bakerId = nextId++;
        this.bakerCompanyName = bakerCompanyName;
        this.bakerCountry = bakerCountry;
        this.bakerWorkTime = bakerWorkTime;
    }

    public Baker(String bakerCompanyName, String bakerCountry) {
        this.bakerId = nextId++;
        this.bakerCompanyName = bakerCompanyName;
        this.bakerCountry = bakerCountry;
        this.bakerWorkTime = "N/A";
    }

    public void print() {
        System.out.println(this.bakerId + ": " + this.bakerCompanyName + " " + this.bakerCountry + " " + this.bakerWorkTime);
    }

    public int getBakerId() {
        return bakerId;
    }

    public void setBakerId(int bakerId) {
        this.bakerId = bakerId;
    }

    public String getBakerCompanyName() {
        return bakerCompanyName;
    }

    public void setBakerCompanyName(String bakerCompanyName) {
        this.bakerCompanyName = bakerCompanyName;
    }

    public String getBakerCountry() {
        return bakerCountry;
    }

    public void setBakerCountry(String bakerCountry) {
        this.bakerCountry = bakerCountry;
    }

    public String getBakerWorkTime() {
        return bakerWorkTime;
    }

    public void setBakerWorkTime(String bakerWorkTime) {
        this.bakerWorkTime = bakerWorkTime;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Baker.nextId = nextId;
    }
}
