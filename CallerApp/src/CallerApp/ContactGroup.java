package CallerApp;

import java.util.ArrayList;
import java.util.List;

public class ContactGroup {
    private String name;
    private List<Contact> contacts;

    public ContactGroup(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public boolean addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        return contacts.remove(contact);
    }

    @Override
      public String toString() {
        return "Group: " + name + ", Contacts: " + contacts.size();
    }
}
