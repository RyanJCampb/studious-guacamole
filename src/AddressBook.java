import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook()
    {
        this.addBuddy(new BuddyInfo());
        this.addBuddy(new BuddyInfo());
        this.addBuddy(new BuddyInfo());
    }

    public void addBuddy(BuddyInfo buddy)
    {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy)
    {
        buddies.remove(buddy);
    }

    public static void main(String[] args)
    {
        System.out.println("Address Book");
    }
}