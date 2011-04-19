package src;

import java.util.Stack;

import simpleIO.TextReader;
import simpleIO.TextWriter;
import simpleIO.UserDialog;

public class Register {
	private UserDialog dialog;
	private TextWriter writer;
	private TextReader reader;
	private Stack students;
	public Register() {
		dialog = new UserDialog();
	}
	
	private void loadData() {
		reader = new TextReader("students.txt", this);
		while (reader.readLine() != null) {
			String[] entry = reader.readLine().split(";");
			// 5 entries
			String name;
			String gender;
			
		}
		
	}
	
	private void addStudent(){
		students.add(new Student());
		
	}
	
	private void commitChanges(){
		
	}
	
	
	public static void main(String[] aArgs) {
		
		/**
		 * load text file into memory
		 * add more students to the list / edit the data
		 * print the new list back to the file
		 */
		Register r = new Register();
		String[] options = {"Undergraduate", "Taught Postgraduate", "Research Postgraduate", "Quit"};
		String type = r.dialog.selectString("Please select the type of student to be added", options);
		String name = r.dialog.getString("Please enter the name of the student.");
		String gender = r.dialog.getString("Please enter the gender of the student");
		// java 7 finally gives us strings in switch.  soon.  
		Student student = new Student();
		if (type.equals("Undergraduate")) {
			student = (Undergraduate)student; 
		}
		else if (type.equals("Taught Postgraduate")) {
			student = (Undergraduate)student; 
		}
		
		else if (type.equals("Research Postgraduate")) {
			student = (Undergraduate)student; 
		}
	
		
	}
	
	

	private static void printFile() {
		// TODO Auto-generated method stub
		
	}
	
}
