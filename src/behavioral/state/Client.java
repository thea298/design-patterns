package behavioral.state;

public class Client {
    public static void main(String[] args) {
        PhoneState initialState = new Locked();
        PhoneContext context = new PhoneContext(new Locked());
        initialState.setContext(context);

        context.pressPhoneButton("T");
        context.pressPhoneButton("unlock");
    }
}
