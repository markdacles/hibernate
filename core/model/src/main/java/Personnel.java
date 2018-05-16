import java.time.*;
import java.util.Set;
import java.util.*;
 
public class Personnel {
 
    private long id;
    private Name name;
    private Address address;
    private Date birthday;
    private double gwa;
    private Date dateHired;
    private Set<Contact> contact  = new HashSet<Contact>();
    private Set<Roles> roles  = new HashSet<Roles>();

    public Personnel() { }
    
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public Date getBirthday() { return birthday; }
    public void setBirthday(Date birthday) { this.birthday = birthday; }    

    public double getGwa() { return gwa; }
    public void setGwa(double gwa) { this.gwa = gwa; }

    public Date getDateHired() { return dateHired; }
    public void setDateHired(Date dateHired) { this.dateHired = dateHired; }  

    public Set<Contact> getContact() { return contact; }
    public void setContact(Set<Contact> contact) { this.contact = contact; }

    public Set<Roles> getRoles() { return roles; }
    public void setRoles(Set rroles) { roles = rroles; }

}