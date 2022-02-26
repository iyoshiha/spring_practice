package jp.co.feeps.lesson3;

public class LoginForm {
	
	private int userId = 0;
	private String password;
	
	public LoginForm() {
		System.out.println("Form initialized now");
		System.out.println("userId is : " + this.getUserId() );
	}
	
	public int getUserId() {
		System.out.println("in getUserId(): userId is : " + this.userId );
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
