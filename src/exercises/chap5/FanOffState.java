package exercises.chap5;

public class FanOffState implements FanState{
    private Fan context;

    public FanOffState(Fan context) {
        this.context = context;
    }

    @Override
    public void changeSpeed(int speed) {
        System.out.println("Fan speed set to" + speed);
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is already off");
    }

}
