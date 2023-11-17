package MappingPkg;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	private int pId;
	private String personName;
	@ManyToMany
	@JoinColumn(name = "Media_ID")
	private List<SocialMedia> AppList;

	public List<SocialMedia> getAppList() {
		return AppList;
	}

	public void setAppList(List<SocialMedia> appList) {
		AppList = appList;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
}
