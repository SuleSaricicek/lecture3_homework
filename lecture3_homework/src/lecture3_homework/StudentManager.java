package lecture3_homework;

public class StudentManager {
	public void addCourseToStudent (Student student, Course course) {
		System.out.println(student.getFirstname()+" "+student.getLastname()+ " kullan�c�s� " + course.getCourseName() + " kursuna kayd� ba�ar�l�");
	}
	
	public void deleteStudent (Student student) {
		System.out.println(student.getFirstname()+" "+student.getLastname()+ " kullan�c�s�n�n sistemden kayd� silindi");
	}

}
