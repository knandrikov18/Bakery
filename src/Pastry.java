public class Pastry {
    private int pastryId;
    private String pastryName;
    private String pastryFrosting;
    private double pastryWeight;

    private static int nextId;

    public Pastry(String pastryName, String pastryFrosting, double pastryWeight) {
        this.pastryName = pastryName;
        this.pastryFrosting = pastryFrosting;
        this.pastryWeight = pastryWeight;
        this.pastryId = nextId++;
    }

    public Pastry(String pastryName, double pastryWeight) {
        this.pastryName = pastryName;
        this.pastryFrosting = "No Frosting";
        this.pastryWeight = pastryWeight;
    }

    public void print() {
        System.out.println(this.pastryId + ": " + this.pastryName + " " + this.pastryFrosting + " " + this.pastryWeight);
    }

    public int getPastryId() {
        return pastryId;
    }

    public void setPastryId(int pastryId) {
        this.pastryId = pastryId;
    }

    public String getPastryName() {
        return pastryName;
    }

    public void setPastryName(String pastryName) {
        this.pastryName = pastryName;
    }

    public String getPastryFrosting() {
        return pastryFrosting;
    }

    public void setPastryFrosting(String pastryFrosting) {
        this.pastryFrosting = pastryFrosting;
    }

    public double getPastryWeight() {
        return pastryWeight;
    }

    public void setPastryWeight(double pastryWeight) {
        this.pastryWeight = pastryWeight;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Pastry.nextId = nextId;
    }
}
