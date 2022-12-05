package ETicaret.business.concretes;

import java.util.List;

import ETicaret.business.abstracts.UserCheckService;
import ETicaret.business.abstracts.UserService;
import ETicaret.dataAccess.abstracts.GoogleUserDao;
import ETicaret.entities.concretes.User;

public class GoogleUserManager implements UserService{
	
	private UserCheckService userCheckService;
	private GoogleUserDao googleUserDao;

	public GoogleUserManager(UserCheckService userCheckService, GoogleUserDao googleUSerDaO) {
		super();
		this.userCheckService = userCheckService;
		this.googleUserDao = googleUSerDaO;
	}

	@Override
	public void SignUp(User user, List<User> userList) {
		
		if (userCheckService.checkUserInfo(user, userList)) {
			userList.add(user);
			googleUserDao.SignUp(user, userList);
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
