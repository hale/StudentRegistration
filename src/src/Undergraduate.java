package src;

public class Undergraduate extends Student {
	private String degreeIntention;
	private int courseLength;
	
	public Undergraduate() {
		degreeIntention = "";
		courseLength = 0;
	}
	
	public Undergraduate(Student stu){
		super.setType(stu.getType());
		super.setName(stu.getName());
		super.setGender(stu.getGender());
	}
	
	public Undergraduate(String degreeIntention, int courseLength) {
		this.degreeIntention = degreeIntention;
		this.courseLength = courseLength;
	}
	
	/**
	 * @param courseLength the courseLength to set
	 */
	public void setCourseLength(int courseLength) {
		this.courseLength = courseLength;
	}
	/**
	 * @return the courseLength
	 */
	public int getCourseLength() {
		return courseLength;
	}
	/**
	 * @param degreeIntention the degreeIntention to set
	 */
	public void setDegreeIntention(String degreeIntention) {
		this.degreeIntention = degreeIntention;
	}
	/**
	 * @return the degreeIntention
	 */
	public String getDegreeIntention() {
		return degreeIntention;
	}

	public String toString() {
		return super.getType() + ";" + super.getName() + ";" + super.getGender() + ";" + degreeIntention + ";" + courseLength;
	}
}
