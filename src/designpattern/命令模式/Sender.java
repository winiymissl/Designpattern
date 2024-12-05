package designpattern.命令模式;

public class Sender {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void sendCommand() {
        command.execute();
    }
}
