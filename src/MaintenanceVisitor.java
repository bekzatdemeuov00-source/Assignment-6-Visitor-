public class MaintenanceVisitor implements DeviceVisitor {

    @Override
    public void visitFilter(AquariumFilter filter) {
        if (filter.getDaysSinceCleaning() > 14) {
            System.out.println("Filter needs cleaning");
        } else {
            System.out.println("Filter is OK");
        }
    }

    @Override
    public void visitHeater(AquariumHeater heater) {
        if (heater.getTemperature() > 28) {
            System.out.println("Heater temperature is too high");
        } else {
            System.out.println("Heater is OK");
        }
    }
}