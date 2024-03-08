public class Vehicle implements VehicleChecks {
    public String modelName;
    public int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyres() {
        for (int i = 0; i < this.wheelsCount; i++) {
            System.out.println("Меняем покрышку №" + (i+1));
        }
    }
}
