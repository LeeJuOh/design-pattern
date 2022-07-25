package command.client;

import command.cmd.Command;
import command.cmd.NoCommand;

public class RemoteControl {

    private static final int SLOT_SIZE = 7;
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        offCommands = new Command[SLOT_SIZE];
        onCommands = new Command[SLOT_SIZE];

        Command noCommand = new NoCommand();
        for (int i = 0; i < SLOT_SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;

        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder
                .append("[slot ")
                .append(i)
                .append("] ")
                .append(onCommands[i].getClass().getName())
                .append("    ")
                .append(offCommands[i].getClass().getName())
                .append("\n");
        }
        return stringBuilder.toString();
    }
}
