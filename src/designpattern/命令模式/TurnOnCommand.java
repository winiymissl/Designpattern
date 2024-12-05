package designpattern.命令模式;

public class TurnOnCommand implements Command {
    private Recevier receiver;

    public TurnOnCommand(Recevier receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
