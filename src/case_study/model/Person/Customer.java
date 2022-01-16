package case_study.model.Person;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String id, String fullName, String dayOfBirth, String sex, String identityCardNo, String phoneNo, String email, String customerType, String address) {
        super(id, fullName, dayOfBirth, sex, identityCardNo, phoneNo, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
