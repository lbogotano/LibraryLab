public class CardHolder {
    
    private String firstname, lastname, age, address;
    private int memberId;
    private static int nextIdnumber=1001; 
    private boolean available;


    public CardHolder(String firstname, String lastname, String age, String address, int memberId,boolean available) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;

        this.memberId = nextIdnumber;
        nextIdnumber++;
        this.available = available;
    }

    // Getters

    public static String getNextIdMember(){
        return " The next Id member number would be : " + nextIdnumber;
    }

    public String getFirstname() {
        return firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
   

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
   

    public int getMemberId() {
        return memberId;
    }
    

    public boolean isAvailable() {
        return available;
    }

        // setters

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAvailabilityt(boolean available) {
        this.available= available;
    }

    public String getMemberInfo() {
        return " The member " + firstname + lastname + " has the member ID number:" + memberId;
    }


    

}    