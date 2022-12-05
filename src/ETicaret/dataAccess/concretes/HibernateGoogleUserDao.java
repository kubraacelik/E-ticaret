package ETicaret.dataAccess.concretes;

import java.util.List;

import ETicaret.dataAccess.abstracts.GoogleUserDao;
import ETicaret.entities.concretes.User;

public class HibernateGoogleUserDao implements GoogleUserDao{

	@Override
	public void SignIn(User user, List<User> userList) {
		System.out.println("Signing in is successful with Google account.\n");
		
	}

	@Override
	public void SignUp(User user, List<User> userList) {
		System.out.println("Signing up is successful with Google account.\n");
		
	}

}
