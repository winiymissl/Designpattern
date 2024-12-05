package designpattern.命令模式;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-04-26
 */

public class Scene {
    public static void main(String[] args) {
        //定义接受者
        Sender s = new Sender();
        //定义命令
        Command command = new TurnOnCommand(new Light());
        //设置命令
        s.setCommand(command);
        //发送命令
        s.sendCommand();
    }
}
