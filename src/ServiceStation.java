public class ServiceStation {
    public void check(Car car) {
        System.out.println("Обслуживаем автомобиль " + car.getModelName());
        car.updateTyres();
        car.checkEngine();
    }

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем велосипед " + bicycle.getModelName());
        bicycle.updateTyres();
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем грузовик " + truck.getModelName());
        truck.updateTyres();
        truck.checkEngine();
        truck.checkTrailer();
    }
};