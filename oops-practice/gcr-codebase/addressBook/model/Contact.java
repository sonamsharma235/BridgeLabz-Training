package addressBook.model;

public class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNo;
    private String email;

    public Contact(String firstName, String lastName, String address,
               String city, String state, int zip,
               long phoneNo, String email) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
    this.state = state;  // UC-8
    this.zip = zip;
    this.phoneNo = phoneNo;
    this.email = email;
}
    
    // UC-7: Override equals() Method
    // Duplicate check based on First Name + Last Name
    // ===============================
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Contact contact = (Contact) obj;

        return firstName.equalsIgnoreCase(contact.firstName)
                && lastName.equalsIgnoreCase(contact.lastName);
    }

    // IMPORTANT when overriding equals
    @Override
    public int hashCode() {
        return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }

    // Getters & Setters

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public int getZip() { return zip; }
    public void setZip(int zip) { this.zip = zip; }

    public long getPhoneNo() { return phoneNo; }
    public void setPhoneNo(long phoneNo) { this.phoneNo = phoneNo; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
}