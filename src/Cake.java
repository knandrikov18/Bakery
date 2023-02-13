public class Cake extends Pastry {
    private String cakeCrust;
    private boolean cakeMultipleLayers;

    public Cake(String cakeName, String cakeFrosting, double cakeWeight,  String cakeCrust, boolean cakeMultipleLayers) {
        super(cakeName, cakeFrosting, cakeWeight);
        this.cakeCrust = cakeCrust;
        this.cakeMultipleLayers = cakeMultipleLayers;
    }

    public Cake() {
        super("N/A", "None", 0d);
        this.cakeCrust = "None";
        this.cakeMultipleLayers = false;
    }

    public void print() {
        System.out.println("Cake -  Cake Crust:" + this.cakeCrust + " Has Multiple Layers: " + this.cakeMultipleLayers);
    }

    public String getCakeCrust() {
        return cakeCrust;
    }

    public void setCakeCrust(String cakeCrust) {
        this.cakeCrust = cakeCrust;
    }

    public boolean isCakeMultipleLayers() {
        return cakeMultipleLayers;
    }

    public void setCakeMultipleLayers(boolean cakeMultipleLayers) {
        this.cakeMultipleLayers = cakeMultipleLayers;
    }
}

