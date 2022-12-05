package ETicaret.business.abstracts;

import java.util.List;

import ETicaret.entities.concretes.User;

public interface UserService {
	void SignUp(User user, List<User> userList);
	void SignIn(List<User> userList, String email, String password);
}
