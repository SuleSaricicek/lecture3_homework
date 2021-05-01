package lecture3_homework;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentId=1;
		student1.setId(1);
		student1.setFirstname("Şule");
		student1.setLastname("Bilgi");
		student1.setUsername("schule");
		student1.setPassword(1144);
		student1.completionRate =50;
		student1.courseTaken= "Java";
		
		
		Student student2 = new Student();
		student2.studentId=2;
		student2.setId(2);
		student2.setFirstname("Ali");
		student2.setLastname("Sarıçiçek");
		student2.setUsername("aly");
		student2.setPassword(1485);
		student1.completionRate =30;
		student1.courseTaken= "C#";
		
		Instructor instructor = new Instructor();
		instructor.setId(3);
		instructor.setFirstname("Engin");
		instructor.setLastname("Demiroğ");
		instructor.setUsername("Devamke");
		instructor.setPassword(1478);
		instructor.instructorId=1;
		instructor.courseGiven="Java";
		
		Course course1= new Course(1,"Java");
		Course course2= new Course(2,"C#");
	
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.addCourseToStudent(student1, course2);
		studentManager.addCourseToStudent(student2, course1);
		studentManager.deleteStudent(student2);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor);

		UserManager userManager = new UserManager();
		userManager.logIn(student1);
		
		
	}

}
