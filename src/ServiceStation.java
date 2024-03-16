public class ServiceStation {

    public static void updateTyres(Vehicle vehicle) {
        for (int i = 0; i < vehicle.wheelsCount; i++) {
            System.out.println("Меняем покрышку №" + (i+1));
        }
    }

    public static void checkEngine(Vehicle vehicle) {
            System.out.println("Проверяем двигатель");
    }
    public static void checkTrailer(Vehicle vehicle) {
        System.out.println("Проверяем прицеп");
    }
};