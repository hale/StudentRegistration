package src;

public class Student {
	private String name;
	private String gender;
	
	public Student()  {
		setName("Unknown");
		setGender("Unknown");
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	
}
	

