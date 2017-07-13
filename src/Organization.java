/**
 * Created by Ny Derry on 7/13/2017.
 */
public class Organization {

    private String type;
    private String address;
    private String description;

    private boolean acceptingVolunteer;
    private boolean volunteerNeeded;

    private Staff volCoordinator;


    public Organization (){

    }

    public Organization(String type, String address, String description, boolean acceptingVolunteer, boolean volunteerNeeded, Staff volCoordinator) {
        this.type = type;
        this.address = address;
        this.description = description;
        this.acceptingVolunteer = acceptingVolunteer;
        this.volunteerNeeded = volunteerNeeded;
        this.volCoordinator = volCoordinator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAcceptingVolunteer() {
        return acceptingVolunteer;
    }

    public void setAcceptingVolunteer(boolean acceptingVolunteer) {
        this.acceptingVolunteer = acceptingVolunteer;
    }

    public boolean isVolunteerNeeded() {
        return volunteerNeeded;
    }

    public void setVolunteerNeeded(boolean volunteerNeeded) {
        this.volunteerNeeded = volunteerNeeded;
    }

    public Staff getVolCoordinator() {
        return volCoordinator;
    }

    public void setVolCoordinator(Staff volCoordinator) {
        this.volCoordinator = volCoordinator;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", acceptingVolunteer=" + acceptingVolunteer +
                ", volunteerNeeded=" + volunteerNeeded +
                ", volCoordinator=" + volCoordinator +
                '}';
    }
}
