package designpattern.备忘录模式;

public interface Memento {

    void restore(Memento memento);

    Memento saveToMemento();
}
