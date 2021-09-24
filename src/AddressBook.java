import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook()
    {
        buddies = new ArrayList<>();
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
        AddressBook book = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        book.addBuddy(buddy);
        book.removeBuddy(buddy);
        //This a comment for changes
        // This is the second comment
    }

    private void new_method(){}
}
