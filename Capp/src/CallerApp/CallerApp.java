package CallerApp;


import java.util.ArrayList;
import java.util.List;

public class CallerApp {
    private List<Contact> contacts;
    private List<ContactGroup> groups;
    private List<Schedule> schedules;
    private List<Contact> blockedContacts;

    public CallerApp() {
        this.contacts = new ArrayList<>();
        this.groups = new ArrayList<>();
        this.schedules = new ArrayList<>();
        this.blockedContacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            return contacts.add(contact);
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        return contacts.remove(contact);
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = contacts.indexOf(oldContact);
        if (index != -1) {
            contacts.set(index, newContact);
            return true;
        }
        return false;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public boolean addGroup(ContactGroup group) {
        if (!groups.contains(group)) {
            return groups.add(group);
        }
        return false;
    }

    public boolean removeGroup(ContactGroup group) {
        return groups.remove(group);
    }

    public List<ContactGroup> getGroups() {
        return groups;
    }

    public ContactGroup getGroupByName(String name) {
        for (ContactGroup group : groups) {
            if (group.getName().equalsIgnoreCase(name)) {
                return group;
            }
        }
        return null;
    }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public void removeSchedule(Schedule schedule) {
        schedules.remove(schedule);
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void blockContact(Contact contact) {
        blockedContacts.add(contact);
    }

    public List<Contact> getBlockedContacts() {
        return blockedContacts;
    }

    public List<Contact> getFavoriteContacts() {
        List<Contact> favoriteContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.isFavorite()) {
                favoriteContacts.add(contact);
            }
        }
        return favoriteContacts;
    }
}
