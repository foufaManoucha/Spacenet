Feature: Page d acceuil
Scenario:Acceder a chaque sous menu de la page dacceuil
 Given utilisateur sur la page dacceuil
 When  utilisateur clique sur le menu "Gaming" et  clique sur le sous menu "Setup Gaming"
 Then utilisateur est derigé vers la page du sous menu "Setup Gaming"
 