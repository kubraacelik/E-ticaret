package ETicaret.dataAccess.abstracts;

import java.util.List;

import ETicaret.entities.concretes.User;

public interface UserDao {
	void signIn(User user, List<User> userList);
	void signUp(User user, List<User> userList);
}
