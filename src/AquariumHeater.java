public class AquariumHeater implements AquariumDevice {
    private int watts;
    private int hoursPerDay;
    private int temperature;

    public AquariumHeater(int watts, int hoursPerDay, int temperature) {
        this.watts = watts;
        this.hoursPerDay = hoursPerDay;
        this.temperature = temperature;
    }

    public int getWatts() {
        return watts;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visitHeater(this);
    }
}