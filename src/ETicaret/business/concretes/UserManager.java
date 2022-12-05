package ETicaret.business.concretes;

import java.util.List;

import ETicaret.business.abstracts.UserService;
import ETicaret.core.abstracts.GoogleService;
import ETicaret.dataAccess.abstracts.GoogleUserDao;
import ETicaret.dataAccess.abstracts.UserDao;
import ETicaret.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserCheckManager userCheckManager;
	private UserDao userDao;
	
	public UserManager(UserCheckManager userCheckManager, UserDao userDao) {
		super();
		this.userCheckManager = userCheckManager;
		this.userDao = userDao;
	}

	@Override
	public void SignUp(User user, List<User> userList) {
		if(userCheckManager.checkUserInfo(user, userList)) {
			userList.add(user);
			userDao.signUp(user, userList);
		}
		
	}

	@Override
	public void SignIn(List<User> userList, String email, String password) {
		
		boolean checkSign = false;
		
		for (int i = 0; i < userList.size(); i++) {
			
			if (userList.get(i).getEmail().equals(email) && userList.get(i).getPassword().equals(password)) {
				System.out.println("Login successful");
				checkSign = true;
			}
			
		}
		
		if (!checkSign) {
			System.out.println("Email or password is incorrect!");
		}
		
	}
}
