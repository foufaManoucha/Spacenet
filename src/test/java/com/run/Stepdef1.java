package com.run;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.Productpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef1 {

	@Given("utilisateur est sur la page Setup gaming")
	public void utilisateur_est_sur_la_page_setup_gaming() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Config.driver=new ChromeDriver();
		   String url ="https://spacenet.tn/1390-setup-gaming";
			Config.maximize();
		   Config.driver.get(url);
	}
	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String product) {
		Productpage Productpage = new Productpage();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		//Productpage page= new Productpage();
		//page.clickonproduct(productname);
		Productpage.clickonproduct(product);
	}
	@Then("utilisateur est sur la page du produit {string}")
	public void utilisateur_est_sur_la_page_du_produit(String verif1) {
	   
		Productpage Productpage = new Productpage();
		
		Productpage.verifprod(verif1);
	}

	
	
	
	
}
