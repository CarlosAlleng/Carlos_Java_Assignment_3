package utility;

public class Form {
    private String applicantName;
    private String address;
    private String phoneNumber;

    // Constructors
    public Form(String applicantName, String address, String phoneNumber) {
        this.applicantName = applicantName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Form() {
        // Empty constructor
    }

    // Getters and Setters
    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
