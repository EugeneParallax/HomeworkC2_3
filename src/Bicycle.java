public class Bicycle extends Vehicle implements VehicleActions {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("== Обслуживаем велосипед " + this.modelName);
        ServiceStation.updateTyres(this);

    }
}