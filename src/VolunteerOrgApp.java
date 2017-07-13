/**
 * Created by Ny Derry on 7/13/2017.
 */
public class VolunteerOrgApp {
    public static void main(String[] args) {
        System.out.println("hello world");

        Staff coordinator = new Staff ("Ny", "123 Main St", "Girl Scout volunteer needed", "313-602-1234");
        System.out.println(coordinator);

        Organization girlScouts = new Organization("children", coordinator.getAddress(),coordinator.getDescription(), true,
                true, coordinator);
        System.out.println();
        System.out.println(girlScouts);
    }
}
