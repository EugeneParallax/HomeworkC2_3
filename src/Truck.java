public class Truck extends Vehicle implements VehicleActions{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("== Обслуживаем грузовик " + this.modelName);
        ServiceStation.updateTyres(this);
        ServiceStation.checkEngine(this);
        ServiceStation.checkTrailer(this);
    }
}
