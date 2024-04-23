package designpattern.单例模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-23
 */
public class Person {
    private static Person instance;


    private Person() {
    }

    public static Person getInstance() {
        if (instance == null) {
            instance = new Person();
        }
        return instance;
    }

    public static Person getConcurrencyInstance() {

        if (instance == null) {
            synchronized (Person.class) {
                if (instance == null) {
                    return new Person();
                }
            }
        }
        return instance;
    }
    /**
     * double-lock
     * 并不是最优秀的写法
     * 最优秀的写法：
     * private static final Person person = new Person();
     * private Person(){}
     * public static Person getInstance(){
     *     return person;
     * }
     * public static void doSomething(){}
     * */

    /**
    * 单例模式的扩展如果一个类可以产生多个对象，对象数量不受限制
    * 使用集合存储，记得在static{}代码块中加载就可以
    * */
}