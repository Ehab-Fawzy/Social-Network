import java.util.List;

public class message_controller {
	boolean createMessage( String ConversationName , List<user> memberList) {return true;}
	boolean isValidConversation(String ConversationName ) {return true;}
	boolean deleteConversation(String ConversationName) {return true;}
	boolean editConversation(String ConversationName ) {return true;}
	boolean AddMember (String conversationName , String userName){return true;}
	boolean deleteMember (String conversationName , String userName){return true;}
	boolean addMessage (String conversationName , String message){return true;}
	boolean deleteMessage(String conversationName , String message){return true;}
}
