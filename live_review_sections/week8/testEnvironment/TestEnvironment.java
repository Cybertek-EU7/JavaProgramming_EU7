package week8.testEnvironment;

public class TestEnvironment {

	Browser browser;
	OS os;
	
	
	public String toString() {
		
		return browser.getBrowserType()+" | "+os.getOs();
		
	}
	
}
