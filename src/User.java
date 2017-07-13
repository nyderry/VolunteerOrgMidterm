import java.util.ArrayList;

/**
 * Created by Ny Derry on 7/13/2017.
 */
public class User {
    private String name;
    private String address;
    private String interest;
    private ArrayList <Organization> orgList;


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

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }

    public void setOrgList(ArrayList<Organization> orgList) {
        this.orgList = orgList;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", interest='" + interest + '\'' +
                ", orgList=" + orgList +
                '}';
    }
}
