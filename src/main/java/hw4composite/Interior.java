package hw4composite;

public class Interior implements Component {
    Long id;
    Component seat;
    String panel;

    public Interior(Long id, Component seat, String panel) {
        this.id = id;
        this.seat = seat;
        this.panel = panel;
    }

    @Override
    public void show() {
        System.out.printf("Your %s options:  \n", this.getClass().getSimpleName());
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return " panel: '" + panel +
                " seat :" + seat +
                '\'';
    }
}
