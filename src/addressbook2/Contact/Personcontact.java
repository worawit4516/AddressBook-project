package addressbook2.Contact;

import addressbook2.Base.Address;
import addressbook2.Base.Person;
import java.time.LocalDate;
import java.util.Comparator;

public class Personcontact extends Contact{

    private Person person;
    private LocalDate dateOfbirth;

    private Comparator<Personcontact> fristnameComparator = new Comparator<Personcontact>() {
        @Override
        public int compare(Personcontact o1, Personcontact o2) {
            return o1.person.getFirstname().compareTo(o2.person.getFirstname());
        }
    };

    private Comparator<Personcontact> lastComparator = new Comparator<Personcontact>() {
        @Override
        public int compare(Personcontact o1, Personcontact o2) {
            return o1.person.getLastname().compareTo(o2.person.getLastname());
        }
    };

    public Personcontact(Person person, LocalDate dateOfbirth, Address address, String email, String phone, Contactype type) {
        super(address, email, phone, type);
        this.person = person;
        this.dateOfbirth = dateOfbirth;
    }

    public Person getPerson() {
        return person;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    @Override
    public String toString() {
        return "Personcontact{" + "person=" + person + ", dateOfbirth=" + dateOfbirth + ", fristnameComparator=" + fristnameComparator + ", lastComparator=" + lastComparator + '}';
    }
    
    
    
    
}
