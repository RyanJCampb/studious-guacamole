public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo()
    {
        this("Ryan", "Carleton U", "5554057689");
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Homer", "Carleton U", "5554057689");
        System.out.println("Hello " + buddy.getName());
    }
}
