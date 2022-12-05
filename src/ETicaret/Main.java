package ETicaret;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ETicaret.business.abstracts.UserService;
import ETicaret.business.concretes.GoogleUserManager;
import ETicaret.business.concretes.UserCheckManager;
import ETicaret.dataAccess.concretes.HibernateGoogleUserDao;
import ETicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<User> userList = new ArrayList<>();
		
		UserService userService = new GoogleUserManager(new UserCheckManager(), new HibernateGoogleUserDao());
		
		User user1 = new User("Kübra", "Çelik", "kkbra.celik92@gmail.com", "9292");
		userService.SignUp(user1, userList);
		
		User user2 = new User("Ezgi", "Dolma", "ezgidolma@gmail.com", "1923");
		userService.SignUp(user2, userList);
		
		System.out.println("Your e-mail : ");
		String email = scanner.nextLine();
		System.out.println("Your password : ");
		String password = scanner.nextLine();
		userService.SignIn(userList, email, password);
			
	

}
}
