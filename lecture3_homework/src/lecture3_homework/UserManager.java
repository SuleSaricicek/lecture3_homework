package lecture3_homework;

public class UserManager {
	public void logIn(User user) {
		System.out.println("Kullanýcý bilgilerini giriniz:" + user.getUsername());
		System.out.println("Kullanýcý adý: " + user.getUsername() + " kullanýcýsý giriþ yaptý");
	}
	public void logOut(User user) {
		System.out.println("Çýkýþ yapmak istiyor musunuz?" + user.getUsername());
		System.out.println("Kullanýcý adý: " + user.getUsername()+ " kullanýcýsý oturumunu kapattý");
		
	}


}
