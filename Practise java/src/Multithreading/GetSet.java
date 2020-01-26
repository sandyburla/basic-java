package Multithreading;

public class GetSet {

	
	private Integer id;
	private Integer externalId;
	
	public void setId(Integer id) {
		this.id=id;
	}
	public Integer getId() {
		return id;
	}
	public Integer getExternalId() {
		return externalId;
	}
	public void setExternalId(Integer externalId) {
		this.externalId = externalId;
	}
}
