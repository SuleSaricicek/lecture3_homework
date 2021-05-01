package lecture3_homework;

public class Student extends User {
	int studentId;
	String courseTaken;
	double completionRate;
	
	
	public Student() {
		
	}
	

	public Student(int studentId, String courseTaken, double completionRate) {
		super();
		this.studentId = studentId;
		this.courseTaken = courseTaken;
		this.completionRate = completionRate;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCourseTaken() {
		return courseTaken;
	}
	public void setCourseTaken(String courseTaken) {
		this.courseTaken = courseTaken;
	}
	public double getCompletionRate() {
		return completionRate;
	}
	public void setCompletionRate(double completionRate) {
		this.completionRate = completionRate;
	}

}
