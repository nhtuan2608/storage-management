package spring.model;

public class User {
	private int userNo;
	private String userName;
	private String userRole;
	
	public User() {
		userNo = 0;
		userName = "";
		userRole = "";
	}
	
	public User(int userNo, String userName, String userRole) {
		this.userNo = userNo;
		this.userName = userName;
		this.userRole = userRole;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", userName=" + userName + ", userRole=" + userRole + "]";
	}
	
	
}
