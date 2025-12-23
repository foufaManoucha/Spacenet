package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class Homepage {

	@FindBy(xpath="/html/body/main/header/div[3]/div/div[2]/div/div/div[1]/div/div")
 	WebElement toMenus;

	//@FindBy(xpath="/html/body/main/header/div[3]/div/div[2]/div/div/div[1]/div/nav/div[2]/ul/li/a")
	@FindBy(xpath="/html/body/main/header/div[3]/div/div[2]/div/div/div[1]/div/nav/div[2]/ul/li/a")
	List<WebElement> Menus;
	
	//@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/nav/ul/li[1]/div/ul/li[1]/div/div/div[1]/ul/li/a/span")
	  @FindBy(xpath="/html/body/main/header/div[3]/div/div[2]/div/div/div[1]/div/nav/div[2]/ul/li[2]/div/ul/li[1]/div/ul/li/a")

	List<WebElement> submenus;
 
	@FindBy (xpath="/html/body/main/section/div[4]/div/div[2]/section/h1")
	WebElement verif;
	 
	public Homepage() {
		PageFactory.initElements(Config.driver, this);
	}
	public void selectMenu(String menutitle,String Submenutitle) {
		Actions actions =new Actions(Config.driver);
		  actions.moveToElement(toMenus).perform();
		try {
			for(WebElement Menu:Menus) {
				
				if(Menu.getText().contains(menutitle)) {
					actions.moveToElement(Menu).perform();
					for(WebElement Submenu:submenus) {
						if(Submenu.getText().contains(Submenutitle)) {
							Submenu.click();
						}
						
					}
				}
			}
		}catch(Exception e) {
				
			}
			}
	public void verifpage (String submenutitle) {
		
		Assert.assertEquals(verif.getText().toLowerCase(),submenutitle.toLowerCase());
	}

}
