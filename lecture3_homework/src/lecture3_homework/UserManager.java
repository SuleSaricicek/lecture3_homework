package lecture3_homework;

public class UserManager {
	public void logIn(User user) {
		System.out.println("Kullan�c� bilgilerini giriniz:" + user.getUsername());
		System.out.println("Kullan�c� ad�: " + user.getUsername() + " kullan�c�s� giri� yapt�");
	}
	public void logOut(User user) {
		System.out.println("��k�� yapmak istiyor musunuz?" + user.getUsername());
		System.out.println("Kullan�c� ad�: " + user.getUsername()+ " kullan�c�s� oturumunu kapatt�");
		
	}


}
