

import java.util.Vector;

public class userUI {
	public static final userController controller = new userController();
	public static boolean signUp( String firstName , String lastName , String userName , String password , String email , String gender , String date , String country , Boolean isPremium ) {
		
		user object;
		
		if ( isPremium ) {
			object = new PremiumUser();
		}
		else {
			object = new NormalUser();
		}
		
		object.setFirstName(firstName);
		object.setLastName(lastName);
		object.setUserName(userName);
		object.setPassword(password);
		object.setEmail(email);
		object.setGender(gender);
		object.setDate(date);
		object.setCountry(country);

		return controller.signUp(object);
	}
	
	public static String login( String userName , String Password ) {
		String ret = controller.Login(userName, Password);
		return ret;
	}
	
	public static void logOut( String userName ) {
		controller.logOut(userName);
	}
	
	public boolean isPremuim( String userName ) {
		return controller.isPremuim( userName );
	}
	
	public String searchAboutUser( String userName ) {
		return controller.searchAboutUser(userName);
	}
	
	public String sendFriendRequest( String unFrom , String unTo ) {
		return controller.sendFriendRequest(unFrom, unTo);
	}
	
	public Vector<String> getAllNotification( String userName ){
		return controller.getAllNotification(userName);
	}
	
	public Vector<String> getAllRequests( String userName ){
		Vector<user> friendRequests = controller.getAllFriendRequest(userName);
		Vector<String> ret = new Vector<String>();
		
		if ( friendRequests != null ) {
			for ( int i = 0; i < friendRequests.size(); ++i ) {
				ret.add( friendRequests.get(i).getUserName() );
			}
		}
		
		return ret;
	}
	
	public boolean AcceptRequest( String unFrom , String unTo ) {
		return controller.AcceptRequest(unFrom, unTo);
	}
	
	public boolean DeleteRequest( String unFrom , String unTo ) {
		return controller.DeleteRequest(unFrom, unTo);
	}
}
