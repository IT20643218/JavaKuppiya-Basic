/*encapsulation easy method
Encapsulation shortcuts getter and setter--> ctrl + shift + alt + T
<-- Create full args and default constructor -->
<-- default constructor -->
alt + insert
<-- full args constructor -->
alt + insert + select constructor + select all + ok
 */

package encapsulation;

public class Customer1 {
    private String name;
    private String address;
    private int contact;
    private String nic;

    public Customer1() {
    }

    public Customer1(String name, String address, int contact, String nic) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.nic = nic;
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

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}
