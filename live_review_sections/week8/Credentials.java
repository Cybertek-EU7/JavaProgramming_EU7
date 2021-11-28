package week8;

public class Credentials {
	
	private String userName = "Spartan300";
	private String passWord = "hectorTheTroyan";
	
	// I have a default constructor
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
// implement password logic: more than 8 characters, 
	// at least one Uppercase, lowercase and special
	
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	

}
