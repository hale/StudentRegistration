package src;

import java.util.Stack;

import simpleIO.TextReader;
import simpleIO.TextWriter;
import simpleIO.UserDialog;

public class Register {
	private UserDialog ud;
	private TextWriter writer;
	private TextReader reader;
	private Stack students;
	
	public Register() {
		ud = new UserDialog();
	}
	
	private void loadData() {
		reader = new TextReader("students.txt", this);
		while (reader.readLine() != null) {
			String[] entry = reader.readLine().split(";");
			// 5 entries
			String type = entry[0];
			String name = entry[1];
			String gender = entry[2];
			if (type.equals("UG")) {
				//String origin = entry
			}
			
		}
		
	}
	/**
	 * Queries the user for information about a new student to be added.
	 * 
	 */
	private void addStudent(){
		String[] options = {"Undergraduate", "Taught Postgraduate", "Research Postgraduate", "Quit"};
		String type = ud.selectString("Please select the type of student to be added", options);
		String name = ud.getString("Please enter the name of the student.");
		String gender = ud.getString("Please enter the gender of the student");
		
		Student student = new Student();
		if (student instanceof Undergraduate) {
			student = (Undergraduate) student;
			String degreeIntention = ud.getString("Please enter the student's degree intention.");
			int courseLength = ud.getInt("Please enter the length of the course in years");
			// Error checking.
			if (courseLength < 0 || courseLength > 10) {
				courseLength = ud.getInt("Please try again. Make sure you have entered the length of the course in years.");
			}
			students.push(student);
		}
		else if (student instanceof PostTaught) {
			student = (PostTaught) student; 
			String dept = ud.getString("Please enter the department under which the student will be studying");
			int fee = ud.getInt("Pleae enter the fee for the student's course");
			// Error checking
			if (fee < 0) {
				fee = ud.getInt("Sorry, I couldn't accept that.  Please enter the fee for the student's course.");
			}
			students.push(student);			
		}
		// TODO: THIS METHOD :D:D:D:D:D:D:D:D:D:D
		else if (student instanceof PostResearch) {
			student = (PostResearch) student; 
			
		}
		
	}
	
	/**
	 * Empties the stack and outputs the data to the file.
	 */
	private void commitChanges(){
			while (!students.isEmpty()) {
				writer.writeLine(students.pop().toString());
			}
			writer.close();
	}
	
	
	public static void main(String[] aArgs) {
		Register r = new Register();
		r.loadData();
		while (r.ud.getBoolean("Would you like to add a new student?")); {
			r.addStudent();
		}
		r.commitChanges();	
	}
	
	

	private static void printStudents() {
		for (Student student : students) {
			System.out.println(student.toString());
		}
		
	}
	
}
