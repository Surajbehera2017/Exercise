package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	@FindBy(id="username")
	WebElement txtUsername;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(id="login")
	WebElement btnLogin;
	
	@FindBy(id="username_span")
	WebElement Unameerror;
	
	public Loginpage(){
	//Base.openBrowser();
	PageFactory.initElements(Base.driver,this);
	//Base.navigateToUrl();
	}
	
	public String gettxtUsername(){
	 return txtUsername.getAttribute("value");
		}
	
	public void settxtUsername(String value){
		txtUsername.clear();
		txtUsername.sendKeys(value);
		}
	
	public String gettxtPassword(){
		 return txtPassword.getAttribute("value");
			}
		
	public void settxtPassword(String value){
			txtPassword.clear();
			txtPassword.sendKeys(value);
			}
	
	public void setbtnLogin(){
		btnLogin.click();
		}
	
	public String geterror(){
		 return Unameerror.getText();
			}
	
	
}
