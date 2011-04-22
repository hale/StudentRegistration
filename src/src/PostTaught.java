package src;

public class PostTaught extends Student {
	private String dept;
	private int fee;
	
	public PostTaught() {
		dept = "";
		fee = 0;
	}
	
	public PostTaught(Student stu){
		super.setType(stu.getType());
		super.setName(stu.getName());
		super.setGender(stu.getGender());
	}
	
	public PostTaught(String dept, int fee) {
		this.dept = dept;
		this.fee = fee;
	}
	
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(int fee) {
		this.fee = fee;
	}
	/**
	 * @return the fee
	 */
	public int getFee() {
		return fee;
	}
	
	public String toString() {
		return super.getType() + ";" + super.getName() + ";" + super.getGender() + ";" + dept + ";" + fee;
	}
	

}
