package command.client;

import command.cmd.GarageDoorUpCommand;
import command.cmd.LightOnCommand;
import command.vendor.GarageDoor;
import command.vendor.Light;

class SimpleRemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();

        Light light = new Light("Living Room");
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageOpen);
        remoteControl.buttonWasPressed();
    }

}
