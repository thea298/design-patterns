package exercises.chap5;

public class Demo {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new TurnOffLightCommand(light));
        remoteControl.pressButton();       
    }
}
