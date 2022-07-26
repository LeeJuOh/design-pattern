package command.client;

import command.cmd.Command;
import command.cmd.LightOffCommand;
import command.cmd.LightOnCommand;
import command.cmd.MacroCommand;
import command.cmd.StereoOffCommand;
import command.cmd.StereoOnCommand;
import command.vendor.Light;
import command.vendor.Stereo;
import javax.crypto.Mac;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        Command[] partyOn = {lightOnCommand, stereoOnCommand};
        Command[] partyOff = {lightOffCommand, stereoOffCommand};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("---- macro on ------");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---- macro off ------");
        remoteControl.offButtonWasPushed(0);
    }
}
