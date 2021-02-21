package hw5behavior;

public class Car {
    private String model;
    private Brand brand;
    private Exterior exterior;
    private Interior interior;
    private Seat seat;


    public Car(String model, Brand brand, Exterior exterior, Interior interior) {
        this.model = model;
        this.brand = brand;
        this.exterior = exterior;
        this.interior = interior;
    }


    public void changeOptions(Exterior newExterior, Interior newIntreior) {

        exterior = newExterior;
        interior = newIntreior;
    }

    public CarMemento saveConfiguration() {
        CarMemento carMemento = new CarMemento();
        carMemento.setInterior(interior);
        carMemento.setExterior(exterior);
        return carMemento;
    }

    public void restoreConfiguration(CarMemento snapshot) {
        interior = snapshot.getInterior();
        exterior = snapshot.getExterior();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                brand.toString() +
                ", exterior=" + exterior.toString() +
                ", interior=" + interior.toString() +
                '}';
    }
}
