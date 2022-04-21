package second;

public class PostOffices {

    static final String pass = "Pass";
    private String name;
    private String address;
    private String workTime;
    private int employers;

    public static String getPass(){
        return pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public int getEmployers() {
        return employers;
    }

    public void setEmployers(int employers) {
        this.employers = employers;
    }
}
