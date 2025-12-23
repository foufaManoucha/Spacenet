package com.run;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.Ajoutproduitpanier;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefpanier {
	@When("utilisateur est sur la page des produits")

	public void utilisateur_est_sur_la_page_des_produits() {

		Config.driver=new ChromeDriver();
		String url ="https://spacenet.tn/1390-setup-gaming";
		Config.maximize();
		Config.driver.get(url);
	}
	@Given("utilisateur effectue le trie {string}")
	public void utilisateur_effectue_le_trie(String trie) {
		Ajoutproduitpanier page =new  Ajoutproduitpanier();
		page.trierParStock(trie);
	}

	@Given("clique sur le produit {string}")
	public void clique_sur_le_produit(String text) {
		Ajoutproduitpanier page =new  Ajoutproduitpanier();
		page.clickonproduit(text);
	}

	@Given("utilisateur clique sur {string}")
	public void utilisateur_clique_sur(String text) {
		Ajoutproduitpanier page =new  Ajoutproduitpanier();
		page.clickonAchet(text);	
	}
	
	@Then("le produit {string} est ajouté dans le panier")
	public void le_produit_est_ajouté_dans_le_panier(String text) {
		Ajoutproduitpanier page =new  Ajoutproduitpanier();
		page.verifierPopupAjoutProduit(text);
	}
}	

