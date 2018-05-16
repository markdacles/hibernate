import java.util.Set;
import java.util.Objects;
import java.lang.*;

public class Roles {
	
	private long roleId;
	private String role;
	private Set<Personnel> personnel;
	
	public Roles() { }

	public long getRoleId() { return roleId; }
	public void setRoleId(long r) { roleId = r; }

	public String getRole() { return role; }
	public void setRole(String r) { role = r; }

	public Set<Personnel> getPersonnel() { return personnel; }
	public void setPersonnel(Set<Personnel> p) { personnel = p; }

	@Override

	public boolean equals(Object obj) {
	    if (obj == null) return false;
	    if (!(obj instanceof Roles))
	        return false;
	    if (obj == this)
	        return true;
	    return this.getRoleId() == ((Roles) obj).getRoleId();
	}

	public int hashCode() {
	    return Objects.hash(roleId);
	}
	
}