package ETicaret.jLogger;

import ETicaret.entities.concretes.User;

public class JGoogleManager {
	public void registerWithGoogle(User user) {
		System.out.println("Registered with Google : " + user.getFirstName());
	}
}
