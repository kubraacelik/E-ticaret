package ETicaret.dataAccess.concretes;

import java.util.List;

import ETicaret.dataAccess.abstracts.UserDao;
import ETicaret.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void signIn(User user, List<User> userList) {
		System.out.println("Signing in is successful.\n");
		
	}

	@Override
	public void signUp(User user, List<User> userList) {
		System.out.println("Signing up is successful.\n");
		
	}

}
