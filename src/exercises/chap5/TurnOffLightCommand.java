package exercises.chap5;

public class TurnOffLightCommand implements Command{
    private Light light; // receiver
    private LightState prevState;

    public TurnOffLightCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.prevState = light.getState();
        light.turnOff();
    }

    @Override
    public void undo() {
        if(prevState != null){
            System.out.println("Undo light action");
            light.setState(prevState);
        } 
    }

}
