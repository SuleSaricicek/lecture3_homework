package lecture3_homework;

public class InstructorManager {
	public void addInstructor(User user) {
		System.out.println("Sisteme " + user.getFirstname() +" "+ user.getLastname() + " eðitmeni kaydedildi");

		
	}
	public void DeleteInstructor(User user) {
		System.out.println("Sistemden " + user.getFirstname() +" "+ user.getLastname() + " eðitmeni silindi");
		
	}


}
