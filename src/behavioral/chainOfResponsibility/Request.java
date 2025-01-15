package behavioral.chainOfResponsibility;

public class Request {
    private int requestID;
    private String requestType;
    private String requestDesc;
    private String customerName;
    static int requestCount;

    public Request(String requestType, String requestDesc, String customerName) {
        this.requestID = requestCount++;
        this.requestType = requestType;
        this.requestDesc = requestDesc;
        this.customerName = customerName;
    }

    public int getRequestID() {
        return requestID;
    }
    public String getRequestType() {
        return requestType;
    }
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    public String getRequestDesc() {
        return requestDesc;
    }
    public void setRequestDesc(String requestDesc) {
        this.requestDesc = requestDesc;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

}
