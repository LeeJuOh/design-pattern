package command.client;

import command.cmd.Command;
import command.cmd.NoCommand;

public class RemoteControl {

    private static final int SLOT_SIZE = 7;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        offCommands = new Command[SLOT_SIZE];
        onCommands = new Command[SLOT_SIZE];

        Command noCommand = new NoCommand();
        for (int i = 0; i < SLOT_SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;

        }
        // 다른 슬롯과 마찬가지로 사용자가 다른 버튼을 한 번도 누르지 않은 상태에서 undo 버튼을 누르더라도 별 문제가 없도록 한다.
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        // 사용자가 버튼을 누르면 해당 커맨드 객체의 execute() 메서드를 호출한 다음
        // 그 객체의 레퍼런스를 undoCommand 인스턴스 변수에 저장한다.
        // on과 off 버튼을 처리할 때도 같은 방법 사용
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder
                .append("[slot ")
                .append(i)
                .append("] ")
                .append(onCommands[i].getClass().getSimpleName())
                .append("    ")
                .append(offCommands[i].getClass().getSimpleName())
                .append("\n");
        }
        return stringBuilder
            .append("[undo]")
            .append("    ")
            .append(undoCommand.getClass().getSimpleName())
            .toString();
    }
}
