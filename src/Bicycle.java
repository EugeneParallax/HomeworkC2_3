public class Bicycle extends Vehicle implements VehicleChecks {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyres() {
        System.out.println("Меняем покрышку велосипеда №");
    }
}