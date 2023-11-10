package MappingPkg;


import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class SocialMedia {
	@Id
	private int sId;
	private String soccialMediaName;
	@ManyToMany
	private Collection<Person> UserList;

	public Collection<Person> getUserList() {
		return UserList;
	}

	public void setUserList(Collection<Person> userList) {
		UserList = userList;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getSoccialMediaName() {
		return soccialMediaName;
	}

	public void setSoccialMediaName(String soccialMediaName) {
		this.soccialMediaName = soccialMediaName;
	}

}
