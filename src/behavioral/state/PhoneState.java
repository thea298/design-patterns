package behavioral.state;

public interface PhoneState {
    void pressButton(String button);
    void setContext(PhoneContext context);
}
