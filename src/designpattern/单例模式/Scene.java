package designpattern.单例模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-23
 */
public class Scene {
    public static void main(String[] args) {
        Person person = Person.getInstance();
        System.out.println(person);
        Person person1 = Person.getInstance();
        System.out.println(person1);
    }
}
