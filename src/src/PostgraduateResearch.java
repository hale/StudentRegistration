package src;

public class PostgraduateResearch extends Student{
	private String supervisor;
	private String origin;
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

}
