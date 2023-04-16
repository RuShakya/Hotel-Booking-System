package RegisterNow;

import RegisterNow.RegisterTest;

public class RegisterController {
	public boolean Submit(RegisterTest test) {
		boolean result = new RegisterJDBC().save(test);
		return result;
	}
}
