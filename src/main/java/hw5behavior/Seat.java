package hw5behavior;

public class Seat implements Component {
    Long id;
    String color;
    String Material;
    private Seat seat;

    public Seat(Long id, String color, String material) {
        this.id = id;
        this.color = color;
        Material = material;
    }

    @Override
    public String toString() {
        return
                "color is'" + color + '\'' +
                        ", Material:'" + Material + '\'';
    }

    @Override
    public void show() {
        System.out.printf("Your %s : \n", this.getClass().getSimpleName());
        System.out.println(this.toString());
    }
}
//