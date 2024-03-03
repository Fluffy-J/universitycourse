package za.ac.cput.domain;

/**
 * Mpumzi Mbula
 * 219053324
 * 03-03-2024
 */
public class Contact {
    private String phoneNumber;
    private String email;

    public Contact() {
    }

    public Contact(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }
}
