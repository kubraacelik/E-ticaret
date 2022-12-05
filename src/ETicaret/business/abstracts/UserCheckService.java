package ETicaret.business.abstracts;

import java.util.List;

import ETicaret.entities.concretes.User;

public interface UserCheckService {
	boolean checkUserInfo(User user, List<User> userList);
	boolean isEmailVerified(User user, List<User> userList);
	boolean validateEmail(User user);
	boolean isEmailUnique(User user, List<User> userList);
}
