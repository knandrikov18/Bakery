import java.util.ArrayList;
import java.util.List;

public class Bakery {
    private String bakeryName;
    private List<Baker> bakers;
    private List<Pastry> pastries;

    public Bakery(String bakeryName) {
        this.bakeryName = bakeryName;
        bakers = new ArrayList<>();
        pastries = new ArrayList<>();
    }

    public List<Baker> getBakers() {
        return bakers;
    }

    public void setBakers(List<Baker> bakers) {
        this.bakers = bakers;
    }

    public List<Pastry> getPastries() {
        return pastries;
    }

    public void setPastries(List<Pastry> pastries) {
        this.pastries = pastries;
    }

    public static int containsInputAsName(String input) {
        for (int i = 0; i < Main.bakeries.size(); i++) {
            Bakery bakery = Main.bakeries.get(i);
            if (bakery.bakeryName.equalsIgnoreCase(input)) {
                return i;
            }
        }
        return -1;
    }

    public void addPastry(Pastry pastry) {
        pastries.add(pastry);
    }

    public void addBaker(Baker baker) {
        bakers.add(baker);
    }

    public void removePastry(int id) {
        pastries.remove(id);
    }

    public void removeBaker(int id) {
        bakers.remove(id);
    }

    public String getBakeryName() {
        return bakeryName;
    }
}
