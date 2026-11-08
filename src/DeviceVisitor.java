public interface DeviceVisitor {
    void visitFilter(AquariumFilter filter);
    void visitHeater(AquariumHeater heater);
}