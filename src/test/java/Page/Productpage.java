package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class Productpage {

	@FindBy(xpath = "/html/body/main/section/div[4]/div/div[2]/section/section/div[3]/div/div/div[1]/div/div[1]/div/div[2]/h2/a")
	List<WebElement> produit;
	
	@FindBy(xpath = "/html/body/main/section/div[2]/div/section/div[1]/div[2]/h1")
	WebElement verif1;
	
	public Productpage() {
		PageFactory.initElements(Config.driver, this);
	}

	public void clickonproduct(String productname) {
		try {
			for (WebElement product : produit) {

				if (product.getText().contains(productname)) {
					product.click();

				}
			}

		} catch (Exception e) {

		}
	}

	public void verifprod(String actualtext) {

		Assert.assertEquals(verif1.getText().toUpperCase(), actualtext.toUpperCase());
		
	}

}
