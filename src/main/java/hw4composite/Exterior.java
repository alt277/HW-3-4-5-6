package hw4composite;

public class Exterior implements Component {
    Long id;

    public Exterior(Long id, String color, boolean chromMoldings,
                    boolean tintedWindows, String wheelDesign,
                    Long wheellSize, String grillDesign) {
        this.id = id;
        this.color = color;
        this.chromMoldings = chromMoldings;
        this.tintedWindows = tintedWindows;
        this.wheelDesign = wheelDesign;
        this.wheellSize = wheellSize;
        this.grillDesign = grillDesign;
    }

    String color;
    boolean chromMoldings;
    boolean tintedWindows;
    String wheelDesign;
    Long wheellSize;
    String grillDesign;

    @Override
    public void show() {
        System.out.printf("Your %s options:  \n", this.getClass().getSimpleName());
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return
                " color is '" + color + '\'' +
                        ", has chromMoldings: " + chromMoldings +
                        ", has tintedWindows: " + tintedWindows +
                        ", wheelDesign: '" + wheelDesign + '\'' +
                        ", wheellSize: " + wheellSize +
                        ", grillDesign: " + grillDesign + '\'';
    }
}

