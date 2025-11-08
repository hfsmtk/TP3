# Activité Pratique N°3 — Spring MVC avec Thymeleaf

<img src="captures/img.png">

# Créer l'entité JPA Product
La classe Product avec les annotations Lambok:
- @Builder pour la construction des objets,
- @Entity pour qu il soit une entite JPA,
- @GeneratedValue pour un auto increment,
- @NotEmpty et @Size des annotations de validation.
<img src="captures/img_1.png">

# Créer l'interface ProductRepository basée sur Spring Data
Pour travailler avec Sping Data il faut que l'interface herite de JpaRepository
<img src="captures/img_2.png">

# Tester la couche DAO
@Bean et commandLineRunner pour nous permettre d'executer des traitemant au demarage
<img src="captures/img_3.png">
on va prendre le mdp afficher pour acceder a h2-console
<img src="captures/img_4.png">
<img src="captures/img_7.png">
<img src="captures/img_5.png">



# Désactiver la protection par défaut de spring security
on ajoute exclude = {SecurityAutoConfiguration.class} pour desactiver spring security alors on va acceder directement a h2-console sans mdp
<img src="captures/img_5.png">

<img src="captures/img_6.png">

<img src="captures/img_8.png">


# Créer le contrôleur spring MVC et les vues thymeleaf pour :
- Afficher la liste des produits :
  <img src="captures/img_12.png">
Affichage:
  <img src="captures/img_9.png">

- Supprimer un produit :
    <img src="captures/img_13.png">
Affichage:
    <img src="captures/img_10.png">

    <img src="captures/img_11.png">


- Page template basée sur Thymeleaf layout et bootstrap :

   <img src="captures/img_14.png">
  

- Saisir et ajouter un produit avec la validation du formulaire :
@Valid automatiquement quand il va spring mvc stocker les donnees saisi dans product il va verifier
est ce que les attributs respectent les contraintes et s'il y a des erreurs les listes d'erreurs vont etre 
stocker dans BindingResult

    <img src="captures/img_15.png">

Affichage:
     <img src="captures/img_16.png">
     <img src="captures/img_17.png">
les produits HPC et Test on ete ajouter 

# Sécuriser l'application avec Spring Security

 <img src="captures/img_18.png">

Affichage :
<img src="captures/img_19.png">
<img src="captures/img_20.png">
<img src="captures/img_21.png">
erreur 403 c a d non autorise,
 il n a pas laisser user1 supprimer un produit car il n est pas autorise selon le code de security



