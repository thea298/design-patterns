package behavioral.state;

public class Unlocked implements PhoneState{
    private PhoneContext context;

    public void setContext(PhoneContext context){
        this.context=context;
    }

    @Override
    public void pressButton(String button) {
        if(button.equals("Lock")){
            PhoneState state=new Locked();
            state.setContext(context);
            this.context.changeState(state);
            System.out.println("Locking");
        }
        else{
            System.out.println("Phone is unlocked.");
        }
    }

}
