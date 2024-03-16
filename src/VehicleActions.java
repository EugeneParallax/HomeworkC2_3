public interface VehicleActions {

    default void service(){
        System.out.println("Отсутсвует реализация метода для данного класса");
    };
}
