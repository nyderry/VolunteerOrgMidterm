/**
 * Created by Ny Derry on 7/13/2017.
 */
public class Staff {
    private String name;
    private String address;
    private String description;
    private String contact;

    public Staff(String name, String address, String description, String contact) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.contact = contact;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
