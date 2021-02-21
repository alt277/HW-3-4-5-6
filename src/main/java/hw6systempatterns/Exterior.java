package hw6systempatterns;

public class Exterior {
    private int id;
    private String color;
    private boolean chromMoldings;
    private boolean tintedWindows;
    private String wheelDesign;
    private double wheelSize;
    private String grillDesign;

    public Exterior() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isChromMoldings() {
        return chromMoldings;
    }

    public void setChromMoldings(boolean chromMoldings) {
        this.chromMoldings = chromMoldings;
    }

    public boolean isTintedWindows() {
        return tintedWindows;
    }

    public void setTintedWindows(boolean tintedWindows) {
        this.tintedWindows = tintedWindows;
    }

    @Override
    public String toString() {
        return "Exterior{" +
                " id=" + id +
                ", color='" + color + '\'' +
                ", chromMoldings=" + chromMoldings +
                ", tintedWindows=" + tintedWindows +
                ", wheelDesign='" + wheelDesign + '\'' +
                ", wheelSize=" + wheelSize +
                ", grillDesign='" + grillDesign + '\'' +
                '}' + "\n";
    }

    public String getWheelDesign() {
        return wheelDesign;
    }

    public void setWheelDesign(String wheelDesign) {
        this.wheelDesign = wheelDesign;
    }

    public double getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(double wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getGrillDesign() {
        return grillDesign;
    }

    public void setGrillDesign(String grillDesign) {
        this.grillDesign = grillDesign;
    }


    public Exterior(int id, String color, boolean chromMoldings,
                    boolean tintedWindows, String wheelDesign, double wheelSize, String grillDesign) {
        this.id = id;
        this.color = color;
        this.chromMoldings = chromMoldings;
        this.tintedWindows = tintedWindows;
        this.wheelDesign = wheelDesign;
        this.wheelSize = wheelSize;
        this.grillDesign = grillDesign;
    }
}
