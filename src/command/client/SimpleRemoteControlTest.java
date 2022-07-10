package command.client;

import command.cmd.LightOnCommand;
import command.vendor.Light;

class SimpleRemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
    }

}
