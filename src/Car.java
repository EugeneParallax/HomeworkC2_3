public class Car extends Vehicle implements VehicleActions {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("== Обслуживаем автомобиль " + this.modelName);
        ServiceStation.updateTyres(this);
        ServiceStation.checkEngine(this);

    }
}