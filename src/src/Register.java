package src;

import java.util.Stack;

import simpleIO.TextReader;
import simpleIO.TextWriter;
import simpleIO.UserDialog;

public class Register {
	private UserDialog ud;
	private TextWriter writer;
	private TextReader reader;
	private Stack<Student> students;
	
	public Register() {
		ud = new UserDialog();
	}
	
	private void loadData() {
		reader = new TextReader("/Users/phil989/gitrepos/StudentRegistration/students.txt");
		students = new Stack<Student>();
		while (reader.readLine() != null) {
			String[] entry = reader.readLine().split(";");
			// 5 entries
			String type = entry[0];
			String name = entry[1];
			String gender = entry[2];
			Student stu = new Student();
			//stu.setType(type);
			stu.setType(type);
			stu.setName(name);
			stu.setGender(gender);
			if (type.equals("Undergraduate")) {
				/*
				 * So we have:
				 * A student object stu with the basic fields filled in
				 * 
				 * We want:
				 * to make this a ugad object (parent -> child)
				 * call ugad specific methods.
				 * add ugad to students.
				 * 
				 * 
				 */
				
				Undergraduate ugrad = new Undergraduate(stu);
				ugrad.setDegreeIntention(entry[3]);
				ugrad.setCourseLength(Integer.parseInt(entry[4]));
				students.push(ugrad);
			}
			else if (type.equals("Taught Postgraduate")) {
				PostTaught postTaught = new PostTaught(stu);
				postTaught.setDept(entry[3]);
				postTaught.setFee(Integer.parseInt(entry[4]));				
				students.push(postTaught);
			}
			else if (type.equals("Research Postgraduate")) {
				PostResearch postResearch = new PostResearch(stu);
				postResearch.setSupervisor(entry[3]);
				postResearch.setOrigin(entry[4]);
				students.push(postResearch);			
			}
			reader.close();
			
		}
		
	}
	/**
	 * Queries the user for information about a new student to be added.
	 * 
	 */
	private void addStudent(){
		String[] types = {"Undergraduate", "Taught Postgraduate", "Research Postgraduate", "Quit"};
		String type = ud.selectString("Please select the type of student to be added", types);
		String name = ud.getString("Please enter the name of the student.");
		String gender = ud.getString("Please enter the gender of the student");
		
		Student stu = new Student();
		stu.setName(name);
		stu.setGender(gender);
		stu.setType(type);
		if (type.equals("Undergraduate")) {
			Undergraduate ugrad = new Undergraduate(stu);
			String degreeIntention = ud.getString("Please enter the student's degree intention.");
			int courseLength = ud.getInt("Please enter the length of the course in years");
			// Error checking.
			if (courseLength < 0 || courseLength > 10) {
				courseLength = ud.getInt("Please try again. Make sure you have entered the length of the course in years.");
			}
			ugrad.setDegreeIntention(degreeIntention);
			ugrad.setCourseLength(courseLength);
			students.push(ugrad);
		}
		else if (type.equals("Taught Postgraduate")) {
			PostTaught postTaught = new PostTaught(stu); 
			String dept = ud.getString("Please enter the department under which the student will be studying");
			int fee = ud.getInt("Pleae enter the fee for the student's course");
			// Error checking
			if (fee < 0) {
				fee = ud.getInt("Sorry, I couldn't accept that.  Please enter the fee for the student's course.");
			}
			postTaught.setDept(dept);
			postTaught.setFee(fee);
			students.push(postTaught);			
		}
		else if (type.equals("Research Postgraduate")) {
			PostResearch postResearch = new PostResearch(stu); 
			String supervisor = ud.getString("Please enter this student's supervisor");
			String[] origins = {"UK", "EU" +"International"};
			String origin = ud.selectString("Please select where this student is from", origins);
			postResearch.setOrigin(origin);
			postResearch.setSupervisor(supervisor);
			students.push(postResearch);
			
		}
		
	}
	
	/**
	 * Empties the stack and outputs the data to the file.
	 */
	private void commitChanges(){
			writer = new TextWriter("/Users/phil989/gitrepos/StudentRegistration/students.txt");
			while (!students.isEmpty()) {
				writer.writeLine(students.pop().toString());
			}
			writer.close();
	}
	
	
	public static void main(String[] aArgs) {
		System.out.println("TESTING TESTING!!");
		Register r = new Register();
		r.loadData();
		while (r.ud.getBoolean("Would you like to add a new student?")) {
			r.addStudent();
		}
		r.commitChanges();	
		r.printStudents();
	}
	
	

	public void printStudents() {
		for (Student student : students) {
			System.out.println(student.toString());
		}		
	}
	
}
