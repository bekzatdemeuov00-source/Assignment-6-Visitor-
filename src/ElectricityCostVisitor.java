public class ElectricityCostVisitor implements DeviceVisitor {
    private double totalCost = 0;
    private double pricePerKwh = 30;

    @Override
    public void visitFilter(AquariumFilter filter) {
        double energy = filter.getWatts() * 24 * 30 / 1000.0;
        totalCost += energy * pricePerKwh;
    }

    @Override
    public void visitHeater(AquariumHeater heater) {
        double energy = heater.getWatts()
                * heater.getHoursPerDay() * 30 / 1000.0;
        totalCost += energy * pricePerKwh;
    }

    public double getTotalCost() {
        return totalCost;
    }
}