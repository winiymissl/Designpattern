package designpattern.备忘录模式;

public class Scene {
    public static void main(String[] args) {
        Originator originator = new Originator("asdfa");
        CareTaker c = new CareTaker();
        originator.setState("0");
        System.out.println(originator.saveToMemento());
        c.addTask(originator.saveToMemento());
        originator.setState("1");
        System.out.println(originator.saveToMemento());
        c.addTask(originator.saveToMemento());

        originator.restore(c.getMemento(0));
        System.out.println(originator.getState());
        originator.restore(c.getMemento(1));
        System.out.println(originator.getState());
    }
}
