package exam2;

//subscriber
public class Customer {
    private String fullName;
    private String email;
    private String phone;
    
    public Customer(String fullName, String email, String phone) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void update(Book b){
        System.out.println("Book "+b+" is now available");
    }

    @Override
    public String toString() {
        return "Customer [fullName=" + fullName + ", email=" + email + ", phone=" + phone + "]";
    }

}
