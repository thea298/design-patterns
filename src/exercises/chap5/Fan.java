package exercises.chap5;
//reciever 2 // context 2
public class Fan {
    private FanState state;
    public Fan(){
        //set initial light state
        this.state = new FanOffState(this);
    }
    public void setState(FanState state){
        this.state = state;
    }
    public FanState getState(){
        return this.state;
    }

    public void changeSpeed(int speed){
        this.state.changeSpeed(speed);
    }
    public void turnOff(){
        this.state.turnOff();
    }

}
