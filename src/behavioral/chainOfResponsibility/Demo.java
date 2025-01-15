package behavioral.chainOfResponsibility;

public class Demo {
    public static void main(String[] args) {
        //building the chain responsability: operator<<basicSupport<<techSupport
        CustomerServiceAgent operator = new Operator();
        CustomerServiceAgent basicSupport = new BasicSupport();
        CustomerServiceAgent techSupport = new TechSupport();

        operator.setNext(basicSupport);
        basicSupport.setNext(techSupport);

        Request request = new Request ("connectivity", "no internet", "jana habib");
        operator.handle(request);

    }
}
