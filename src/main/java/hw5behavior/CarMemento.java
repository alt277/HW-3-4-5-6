package hw5behavior;

public class CarMemento {
    private String model;
    private Brand brand;
    private Exterior exterior;
    private Interior interior;

    public CarMemento() {
    }

    public CarMemento(Exterior exterior, Interior interior) {
        this.exterior = exterior;
        this.interior = interior;
    }

    public Exterior getExterior() {
        return exterior;
    }

    public void setExterior(Exterior exterior) {
        this.exterior = exterior;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }
}
