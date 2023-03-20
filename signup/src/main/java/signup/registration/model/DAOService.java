package signup.registration.model;

public interface DAOService {

	public void connectDB();

	public void SaveRegister(String uname, String upwd, String uemail, String umobile);

	public boolean verifyLogin(String uemail, String upwd);



}
