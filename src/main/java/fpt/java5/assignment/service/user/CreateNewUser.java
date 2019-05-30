package fpt.java5.assignment.service.user;

public interface CreateNewUser {
	
	//Chuyển tiếng việt không dấu
	String removeAccent(String name);
	
	String createNewUser(String userName, int id);
	
}
