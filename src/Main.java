import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Bakery> bakeries;
    public static Scanner sc;
    private static void addFunctionForPastry() {
        System.out.println("Enter Bakery Name");
        String bakeryName = sc.nextLine();
        Integer output = Bakery.containsInputAsName(bakeryName);
        if (output == -1) {
            System.out.println("Couldn't find bakery with that name.");
            return;
        }
        String input = null;
        while(true) {
            System.out.println("Which one would you like to add: ");
            System.out.println("1. Add Cookie");
            System.out.println("2. Add Cake");
            input = sc.nextLine().trim();
            switch (input) {
                case "1":
                    System.out.println("Enter Cookie Name: ");
                    String cookieName = sc.nextLine().trim();
                    System.out.println("Enter Cookie Weight: ");
                    double cookieWeight = Double.parseDouble(sc.nextLine().trim());
                    System.out.println("Enter Cookie Texture: ");
                    String cookieTexture = sc.nextLine().trim();
                    System.out.println("Cookie has chocolate chips: (yes/no)");
                    boolean chocolateChips = (sc.nextLine().trim().equalsIgnoreCase("yes") ? true : false);
                    Main.bakeries.get(output).addPastry(new Cookie(cookieName, cookieWeight, chocolateChips, cookieTexture));
                    System.out.println("Cookie added successfully.");
                    return;
                case "2":
                    System.out.println("Enter Cake Name: ");
                    String cakeName = sc.nextLine().trim();
                    System.out.println("Enter Cake Frosting: ");
                    String cakeFrosting = sc.nextLine().trim();
                    System.out.println("Enter Cake Weight: ");
                    double cakeWeight = Double.parseDouble(sc.nextLine().trim());
                    System.out.println("Enter Cake Crust: ");
                    String cakeCrust = sc.nextLine().trim();
                    System.out.println("Cake has multiple layers: (yes/no)");
                    boolean multipleLayers = (sc.nextLine().trim().equalsIgnoreCase("yes") ? true : false);

                    Main.bakeries.get(output).addPastry(new Cake(cakeName, cakeFrosting, cakeWeight, cakeCrust, multipleLayers));
                    System.out.println("Cake added successfully.");
                    return;
                default:
                    System.out.println("Please enter a correct value.");
                    break;
            }
        }
    }

    public static void message() {
        System.out.println("1. Add a Paster To Bakery");
        System.out.println("2. Show all Pastery in all bakeries.");
        System.out.println("3. Add a Baker to Bakery");
        System.out.println("4. Remove a Pastry from Bakery");
        System.out.println("5. Remove a Baker from Bakery");
        System.out.println("6. Show all Bakers in all bakeries.");
    }


    public static void main(String[] args) {
        sc = new Scanner(System.in);
        bakeries = new ArrayList<>();

        bakeries.add(new Bakery("Lazar"));
        bakeries.add(new Bakery("Cister"));
        bakeries.add(new Bakery("Late"));

        String input = null;
        while (true) {
            message();
            input = sc.nextLine().trim();
            switch (input) {
                case "1":
                    addFunctionForPastry();
                    break;
                case "2":
                    showAllPasteriesInBakeries();
                    break;
                case "3":
                    addBaker();
                    break;
                case "4":
                    System.out.println("Input Pastry Id: ");
                    Integer id = Integer.parseInt(sc.nextLine().trim());
                    removePastryById(id);
                    break;
                case "5":
                    System.out.println("Input Baker Id: ");
                    Integer id1 = Integer.parseInt(sc.nextLine().trim());
                    removeBakerById(id1);
                    break;
                case "6":
                    showAllBakersInBakeries();
                    break;
            }
            if(input.equalsIgnoreCase("0")) {
                break;
            }
        }
        System.out.println("Thanks for using my program.");
    }

    private static void removeBakerById(int id) {
        System.out.println("Enter Bakery Name");
        String bakeryName = sc.nextLine();
        Integer output = Bakery.containsInputAsName(bakeryName);
        if (output == -1) {
            System.out.println("Couldn't find bakery with that name.");
            return;
        }
        Main.bakeries.get(output).removeBaker(id);

        System.out.println("Baker has been removed.");
    }

    private static void removePastryById(int id) {
        System.out.println("Enter Bakery Name");
        String bakeryName = sc.nextLine();
        Integer output = Bakery.containsInputAsName(bakeryName);
        if (output == -1) {
            System.out.println("Couldn't find bakery with that name.");
            return;
        }
        Main.bakeries.get(output).removePastry(id);

        System.out.println("Pastry has been removed.");
    }

    private static void showAllPasteriesInBakeries() {
        for (Bakery bakery: Main.bakeries) {
            System.out.println("Bakery - " + bakery.getBakeryName());
            for (Pastry pastry: bakery.getPastries()) {
                System.out.println(pastry.getPastryId() + ": " + pastry.getPastryName() + " " + pastry.getPastryWeight() + "g");
            }
        }
    }

    private static void showAllBakersInBakeries() {
        for (Bakery bakery: Main.bakeries) {
            System.out.println("Bakery - " + bakery.getBakeryName());
            for (Baker baker: bakery.getBakers()) {
                System.out.println(baker.getBakerId() + ": " + baker.getBakerCompanyName() + " " + baker.getBakerCountry() + " " + baker.getBakerWorkTime());
            }
        }
    }

    private static void addBaker() {
        System.out.println("Enter Bakery Name");
        String bakeryName = sc.nextLine();
        Integer output = Bakery.containsInputAsName(bakeryName);
        if (output == -1) {
            System.out.println("Couldn't find bakery with that name.");
            return;
        }
        System.out.println("Enter Baker Name: ");
        String bakerName = sc.nextLine().trim();
        System.out.println("Enter Baker Country: ");
        String bakerCountry = sc.nextLine().trim();
        System.out.println("Enter work time: ");
        String workTime = sc.nextLine().trim();

        Main.bakeries.get(output).addBaker(new Baker(bakerName, bakerCountry, workTime));
        System.out.println("Successfully added Baker.");
    }
}
