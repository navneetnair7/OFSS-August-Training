import java.util.Iterator;
import java.util.LinkedList;

public class PhoneBook {
    public static void main(String[] args) {
        ContactLog c1 = new ContactLog("Tejas", 100, "Powai gao");
        ContactLog c2 = new ContactLog("Hamza", 101, "Thane");
        ContactLog c3 = new ContactLog("Shruti", 102, "Dadar");

        BookLogger bl = new BookLogger();
        bl.addContact(c1);
        bl.addContact(c2);
        bl.addContact(c3);

        Iterator<ContactLog> it = bl.contactLog.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }

        for(int i = 0; i < bl.contactLog.size(); i ++ ) {
            ContactLog log = bl.contactLog.get(i);
            System.out.println(log.toString());
        }
    }
}

class BookLogger {
    LinkedList<ContactLog> contactLog = new LinkedList<ContactLog>();

    void addContact(ContactLog c) {
        contactLog.add(c);
    }
}

class ContactLog {
    String name;
    int number;
    String address;

    public ContactLog(String name, int number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ContactLog{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", address='" + address + '\'' +
                '}';
    }
}