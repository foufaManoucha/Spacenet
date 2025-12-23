package com.run;


import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {

	@Given("utilisateur sur la page dacceuil")
	public void utilisateur_sur_la_page_dacceuil() {
	 Config.driver=new ChromeDriver();
	   String url ="https://spacenet.tn/";
		Config.maximize();
	   Config.driver.get(url);
	   
	}
	@When("utilisateur clique sur le menu {string} et clique sur le sous menu {string}")
	public void utilisateur_clique_sur_le_menu_et_clique_sur_le_sous_menu(String menutitle, String Submenutitle) {
		Homepage page= new Homepage();
			page.selectMenu(menutitle, Submenutitle);
		
	}
	@Then("utilisateur est derigé vers la page du sous menu {string}")
	public void utilisateur_est_derigé_vers_la_page_du_sous_menu(String verif) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    
	    Homepage page= new Homepage();
		page.verifpage(verif);
	    	}

}

