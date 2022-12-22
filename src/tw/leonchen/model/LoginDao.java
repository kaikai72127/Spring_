package tw.leonchen.model;

public class LoginDao {

	public boolean checkLogin(String user,String pwd) {
		//有明確資料的要放在左邊 否則有可能user為null 就報錯了
		if("john".equals(user) && "test123".equals(pwd)) {
			return true;
		}
		
		return false;
	}
}
