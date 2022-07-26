package command.client;

import command.cmd.CeilingFanOffCommand;
import command.cmd.CeilingFanOnCommand;
import command.cmd.GarageDoorDownCommand;
import command.cmd.GarageDoorUpCommand;
import command.cmd.LightOffCommand;
import command.cmd.LightOnCommand;
import command.cmd.StereoOffCommand;
import command.cmd.StereoOnWithCDCommand;
import command.vendor.CeilingFan;
import command.vendor.GarageDoor;
import command.vendor.Light;
import command.vendor.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();


    }
}
