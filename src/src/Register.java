package src;

import simpleIO.TextReader;
import simpleIO.TextWriter;
import simpleIO.UserDialog;

public class Register {
	private UserDialog dialog;
	private TextWriter writer;
	private TextReader reader;
	public Register() {
		dialog = new UserDialog();
		writer = new TextWriter();
		reader = new TextReader();
	}
	
	private void addStudent(){
		
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
