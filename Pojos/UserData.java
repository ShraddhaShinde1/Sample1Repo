package Pojos;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class UserData {

	
	public String email;
	public String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String createUserPayLoad(Map<String,String> testdata)
	{
	
	UserData d= new UserData();
	/*d.setId(Integer.parseInt(testdata.get("id")));
	d.setName(testdata.get(name));
	d.setColor(testdata.get(color));
	d.setPantone_value(testdata.get(pantone_value));
	d.setYear(Integer.parseInt(testdata.get("year")));
	*/
	d.setEmail(testdata.get("email"));
	d.setPassword(testdata.get("password"));
	
	Gson gson = new Gson();
	return gson.toJson(d);
	
	}
	
}
