package designpattern.命令模式;

public class Light implements Recevier {

    @Override
    public void doSomething() {
        //业务逻辑
        System.out.println("打开电灯");
    }
}
