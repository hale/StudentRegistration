package src;

public class PostResearch extends Student{
	private String supervisor;
	private String origin;
	
	public PostResearch() {
		supervisor = "";
		origin = "";
	}
	
	public PostResearch(Student stu){
		super.setType(stu.getType());
		super.setName(stu.getName());
		super.setGender(stu.getGender());
	}
	
	public PostResearch(String supervisor, String origin) {
		this.supervisor = supervisor;
		this.origin = origin;
	}
	
	/**
	 * @param supervisor the supervisor to set
	 */
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	/**
	 * @return the supervisor
	 */
	public String getSupervisor() {
		return supervisor;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	
	public String toString() {
		return super.getType() + ";" + super.getName() + ";" + super.getGender() + ";" + supervisor + ";" + origin;
	}

}
