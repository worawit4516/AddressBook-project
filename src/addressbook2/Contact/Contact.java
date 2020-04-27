package addressbook2.Contact;

import java.util.Comparator;
import addressbook2.Base.Address;

public abstract class Contact {

    private Address address;
    private String email;
    private String phone;
    private Contactype type;

    public static Comparator<Contact> contactComparetor = new Comparator<Contact>() {
        @Override
        public int compare(Contact o1, Contact o2) {
            return o1.getType().compareTo(o2.getType());

        }

    };

    public Contact(Address address, String email, String phone, Contactype type) {
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Contactype getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Contact{" + "address=" + address + ", email=" + email + ", phone=" + phone + ", type=" + type + '}';
    }
    
    
    
}
