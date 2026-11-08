import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<AquariumDevice> devices = new ArrayList<>();

        devices.add(new AquariumFilter(20, 18));
        devices.add(new AquariumHeater(100, 8, 27));

        ElectricityCostVisitor cost = new ElectricityCostVisitor();
        MaintenanceVisitor maintenance = new MaintenanceVisitor();

        for (AquariumDevice device : devices) {
            device.accept(cost);
            device.accept(maintenance);
        }

        System.out.println("Monthly cost: "
                + cost.getTotalCost() + " KZT");
    }
}