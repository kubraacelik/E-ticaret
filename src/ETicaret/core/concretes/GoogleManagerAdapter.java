package ETicaret.core.concretes;

import ETicaret.core.abstracts.GoogleService;
import ETicaret.entities.concretes.User;
import ETicaret.jLogger.JGoogleManager;

public class GoogleManagerAdapter implements GoogleService{

	@Override
	public void withGoogle(User user) {
		JGoogleManager googleManager = new JGoogleManager();
		googleManager.registerWithGoogle(user);
		
	}

}
