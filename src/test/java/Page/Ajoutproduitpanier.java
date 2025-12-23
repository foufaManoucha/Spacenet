package Page;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;
import junit.framework.Assert;

public class Ajoutproduitpanier {
@FindBy(xpath="/html/body/main/section/div[4]/div/div[2]/section/section/div[1]/div[3]/div/button")
WebElement boutonTri;

@FindBy(xpath="/html/body/main/section/div[4]/div/div[2]/section/section/div[1]/div[3]/div/div/a[7]")
WebElement enStock ;

@FindBy (xpath="/html/body/main/section/div[4]/div/div[2]/section/section/div[3]/div/div/div[1]/div/div[1]/div/div[2]/h2/a")
WebElement produit;

@FindBy(xpath="/html/body/main/section/div[2]/div[1]/section/div[1]/div[2]/div[4]/div/form/div[2]/div[1]/div[2]/button")
WebElement jachachet;

@FindBy (xpath="/html/body/div[11]/div/div/div[2]/div/div[1]/div/div[1]/h4")
WebElement produitAjouté;


public Ajoutproduitpanier () {
	PageFactory.initElements(Config.driver, this);
}
	

	
	public void trierParStock(String str) {
		WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));

		 boutonTri.click();
		 
		 WebElement boutonEnStock = wait.until(ExpectedConditions.elementToBeClickable(enStock));

		// Vérifier le texte du bouton avant de cliquer
		String texteBouton = boutonEnStock.getText();
		if (texteBouton.equalsIgnoreCase(str)) {  //  
			boutonEnStock.click();
		} else {
		    System.out.println("Le bouton n'a pas le texte attendu : " + texteBouton);
		}
	     //enStock.click();
    }
	
	public void clickonproduit (String nameproduit) {
		
		 WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(15));

		    // Attendre que le produit soit visible et cliquable
		 WebElement lien = wait.until(ExpectedConditions.refreshed(
		            ExpectedConditions.elementToBeClickable(produit)
		    ));
		    // Vérifier le texte réel contre la variable nameproduit
		    if (lien.getText().trim().toLowerCase().contains(nameproduit.trim().toLowerCase())) {
		        lien.click();
		    } else {
		        System.out.println("Le lien n'a pas le texte attendu : " + lien.getText());
		    }
	}
	
	public void clickonAchet (String nameproduit) {
		
		WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(15));

		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(jachachet))).click();
	}
	
	public void verifierPopupAjoutProduit(String str) {
		PageFactory.initElements(Config.driver, this);

	    WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.visibilityOf(produitAjouté));

	    String message = produitAjouté.getText();

	    Assert.assertTrue(message.contains("Produit ajouté avec succès à votre panier"));

	
	}
	}




