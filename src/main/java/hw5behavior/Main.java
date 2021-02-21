package hw5behavior;

public class Main {
    public static void main(String[] args) {

        final Car car = new Car("X4",
                new Brand(1l, "BMW"),
                new Exterior.Builder()
                        .setChromMoldings(true)
                        .setId(1l)
                        .setColor("White")
                        .setWheelSize(19l)
                        .setWheelDesign("Bright")
                        .setTintedWindows(true)
                        .setGrillDesign("Luxury")
                        .build(),
                new Interior(1l, new Seat(1L, "Browm", "Leather"), "lux")
        );
        CarMemento snapshot = car.saveConfiguration();
        Exterior exter = new Exterior.Builder()
                .setChromMoldings(false)
                .setId(1l)
                .setColor("Blue")
                .setWheelSize(18l)
                .setWheelDesign("Bright")
                .setTintedWindows(false)
                .setGrillDesign("Vertical")
                .build();
        Interior inter = new Interior(2l, new Seat(1L, "Black", "Combine"), "lux");
        System.out.println(car.toString());

        car.changeOptions(exter, inter);
        System.out.println(car);

        car.restoreConfiguration(snapshot);
        System.out.println(car);
    }
}