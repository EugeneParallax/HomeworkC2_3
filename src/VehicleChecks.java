public interface VehicleChecks {
    default void updateTyres(){
        System.out.println("У данной техники колеса не найдены");
    };
}
