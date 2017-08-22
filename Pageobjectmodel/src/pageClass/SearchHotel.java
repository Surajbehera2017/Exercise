package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {
	Loginpage login;

	public SearchHotel() {
		//Base.openBrowser();
		PageFactory.initElements(Base.driver, this);
		//Base.navigateToUrl();
	}

	@FindBy(id = "location")
	WebElement selectlocation;

	@FindBy(id = "Submit")
	WebElement btnSubmit;

	@FindBy(id = "username_show")
	WebElement UsernameShow;

	public String gettxtUsernameShow() {
		return UsernameShow.getAttribute("value");
	}

	public void setselectlocation(String value) {
		new Select(selectlocation).selectByVisibleText(value);
	}
	
	public void setbtnSubmit(){
		btnSubmit.click();
	}

}
