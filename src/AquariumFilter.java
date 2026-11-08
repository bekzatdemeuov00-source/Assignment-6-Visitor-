public class AquariumFilter implements AquariumDevice {
    private int watts;
    private int daysSinceCleaning;

    public AquariumFilter(int watts, int daysSinceCleaning) {
        this.watts = watts;
        this.daysSinceCleaning = daysSinceCleaning;
    }

    public int getWatts() {
        return watts;
    }

    public int getDaysSinceCleaning() {
        return daysSinceCleaning;
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visitFilter(this);
    }
}