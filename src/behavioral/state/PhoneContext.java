package behavioral.state;

public class PhoneContext {
    private PhoneState currentState;

    public PhoneContext(PhoneState initialstate) {
        this.currentState = initialstate;
    }
    public void pressPhoneButton(String button){
        this.currentState.pressButton(button);
    }
    public void changeState(PhoneState currentState){
        this.currentState=currentState;
    }

}
