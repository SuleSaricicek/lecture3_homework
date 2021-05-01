package lecture3_homework;

public class StudentManager {
	public void addCourseToStudent (Student student, Course course) {
		System.out.println(student.getFirstname()+" "+student.getLastname()+ " kullanıcısı " + course.getCourseName() + " kursuna kaydı başarılı");
	}
	
	public void deleteStudent (Student student) {
		System.out.println(student.getFirstname()+" "+student.getLastname()+ " kullanıcısının sistemden kaydı silindi");
	}

}
