package designpattern.备忘录模式;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> list;

    public boolean addTask(Memento memento) {
        if (list == null) {
            list = new ArrayList<>();
        }
        return list.add(memento);
    }

    public Memento getMemento(int index) {
        if (list == null) {
            list = new ArrayList<Memento>();
        }
        return list.get(index);
    }

    public List<Memento> getList() {
        return list;
    }

    public void setList(List<Memento> list) {
        this.list = list;
    }
}
