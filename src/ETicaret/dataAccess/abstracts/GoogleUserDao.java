package ETicaret.dataAccess.abstracts;

import java.util.List;

import ETicaret.entities.concretes.User;

public interface GoogleUserDao {
	void SignIn(User user, List<User> userList);
	void SignUp(User user, List<User> userList);
}
