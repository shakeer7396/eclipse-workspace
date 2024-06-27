package class8_Encapsulation;

public class Student {
	private int rollNumber; //Private is a access modifier means with in the class only access other person not accessing the data
	private String name;
	private boolean isAttended;

	public Student (int rollNumber) { //Constructor
		this.rollNumber = rollNumber;
	}
	public void setStudentAttendence(boolean flag) {
		if(!isAttended)
			isAttended = flag;
		System.out.println("Teacher assigned attendence to student");//we can put log files also in this place

	}
	public boolean getStudentAttendence() {
		System.out.println("Teacher accessed student attendence");
		return isAttended;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
