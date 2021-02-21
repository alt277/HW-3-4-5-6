package hw4composite;

public class Main {
    public static void main(String[] args) {
        Component seat = new Seat(1l, "Black", "leather");
        Component interior = new Interior(1l, seat, "Basic");
        Component exterior = new Exterior(1l,
                "Blue", true,
                true,
                "luxury",
                17L,
                "Bold");
        Component composite = new Composite().add(seat, interior, exterior);
        seat.show();
        System.out.println("----------");
        interior.show();
        System.out.println("----------");
        exterior.show();
        System.out.println("----------");
        composite.show();

    }
}