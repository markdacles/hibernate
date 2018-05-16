import java.util.Objects;

public class Contact {

	private long contactId;
	private String landline;
	private String mobile;
	private String email;

    public Contact() { }

    public Contact(String landline, String mobile, String email) { 
        this.landline = landline;
        this.mobile = mobile;
        this.email = email;
    }

	public long getContactId() { return contactId; }
    public void setContactId(long cid) { contactId = cid; }  

    public String getLandline() { return landline; }
    public void setLandline(String l) { landline = l; }  

    public String getMobile() { return mobile; }
    public void setMobile(String m) { mobile = m; }  

    public String getEmail() { return email; }
    public void setEmail(String e) { email = e; } 

    @Override

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Contact))
            return false;
        if (obj == this)
            return true;
        return this.getContactId() == ((Contact) obj).getContactId();
    }

    public int hashCode() {
        return Objects.hash(contactId);
    }
}