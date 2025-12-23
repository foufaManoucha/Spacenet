Feature:Ajout produit dans un panier 
Scenario:
Ajout d'un produit en stock dans un panier 
Given  utilisateur est sur la page des produits
When  utilisateur effectue le trie "en stock"
 And   clique sur le produit "Pc De Bureau Gamer Lightgaming Ryzen 3 8Go..."
 And utilisateur clique sur "j'achète"
Then le produit "Pc De Bureau Gamer Lightgaming Ryzen 3 8Go 256Go SSD GT610 2Go" est ajouté dans le panier 