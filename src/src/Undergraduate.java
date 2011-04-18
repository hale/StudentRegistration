package src;

public class Undergraduate extends Student {
	private String degreeIntention;
	private int courseLength;
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

}
