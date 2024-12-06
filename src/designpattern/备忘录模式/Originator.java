package designpattern.备忘录模式;

public class Originator implements Memento {
    private String state;

    public Originator(String state) {
        this.state = state;
    }


    @Override
    public Memento saveToMemento() {
        return new Originator(state);
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }

    public void setState(String str) {
        this.state = str;
    }

    public Memento getState() {
        return this;
    }

    @Override
    public void restore(Memento memento) {
        Originator originator = (Originator) memento;
        this.state = originator.state;
    }
}