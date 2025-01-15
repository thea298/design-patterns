package behavioral.state;

public class LowBattery implements PhoneState{

    private PhoneContext context;

    public void setContext(PhoneContext context){
        this.context=context;
    }

    @Override
    public void pressButton(String button) {
        System.out.println("Displaying charging screen");
    }
}
