

public class NormalUserUI extends userUI {
	
	public boolean upgradeAccount( String userName ) {
		return controller.upgradeUserAccount(userName);
	}
}
