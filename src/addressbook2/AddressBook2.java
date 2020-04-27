package addressbook2;

import addressbook2.Base.*;
import addressbook2.Contact.*;
import java.util.Iterator;

public class AddressBook2 {

    private Contact[] friend;
    private int count;

    private AddressBook2(int size) {
        this.friend = new Contact[(size < 0 ? 0 : size)];
    }

    public int getCount() {
        return count;
    }

    public boolean isFull() {
        return count == friend.length;

    }

    public Iterator<Contact> iterator()
    {return new Iterator<Contact>() {
        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Contact next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    }

     
    
    public boolean Addfriend(Contact contact) {
        if (isFull()) {
            return false;
        }
        friend[count] = contact;
        count++;
        return true;
    }

    public int searchForname(String name) {
        if (name == null) {
            return -1;
        }
        for (int i = 0; i < count; i++) {
            if (friend[i] instanceof Personcontact) {
                if (((Personcontact) friend[i]).getPerson().getFirstname().equals(name)) {
                    return i;
                }
            } else if (((BusinessContact) friend[i]).getCompany().getName().equals(name)) {
                return i;
            }

        }
        return -1;

    }
}
