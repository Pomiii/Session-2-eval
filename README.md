# Session-2-eval

Projet d’évaluation : Java - JDBC - SQL - MySQL - MCD ou UML

Ressources Utilisées :

- Eclipse 4.9.0
- MySQL Workbench 8.0.12
- MySQL connector JAVA 8.0.13
- GitHub

Enoncer :

1. Connexion et requêtes “Select”

- Créez une base de données sous MySQL nommée bd-apprenants
- Ajoutez les informations dans les tables correspondantes.
- Créez un nouveau projet sous Eclipse ou un autre IDE de votre choix
- Créez les packages nécessaires
- Créez une classe de connection à la base de données
- Créez une classe contenant les méthodes pour exécuter des requêtes suivantes (affichez les résultats dans la console)

- Affichez les noms et prénoms de tous les apprenant(e)s.
- Affichez la liste des apprenants pour chaque région (Ile France, Pays de Loire et Aquitaine).
- Recherchez un apprenant(e) (par son nom) et afficher la liste des activités qu’il ou - qu’elle pratique.
- Recherchez les apprenants qui pratiquent une activité passée en paramètre d’une méthode.
L’application devra fonctionner en console.

2 possibilités :

- Vous créez un menu pour choisir une action et saisir les informations dans la console Eclipse.
- Vous lancez des méthodes dans votre méthode main() en affichant ce que vous faites (toujours en console).

2. Connexion et requêtes CRUD (Create, Read, Update, Delete)

- Create : Ecrire une méthode qui permet d’ajouter un(e) nouvel(le) apprenant(e).
- Create : Ecrire une méthode qui permet d’affecter 2 activités (Caresser le chat et Ecouter de la musique) à l’apprenant(e) que vous venez d’ajouter.
- Read : Ecrire une requête qui permet d’afficher la liste des activités que personne ne fait.
- Update : Ecrire une méthode qui permet la mise à jour du nom d’un(e) apprenant(e).
- Delete : Ecrire une méthode qui permet de détruire un(e) apprenant(e) en fonction de l’objet Apprenant passé en paramètre.

3. Faites-le tester par l’un de vos pairs !

4. Evaluation : Faites une démonstration à l’un de vos formateurs !


LES TABLES BD :

- Les Régions 
1. Ile de France
2. Pays de Loire
3. Aquitaine

- Les Activités 
001 => Programmer en java
002 => Ecouter les mouches
003 => Jouer au bilboquet
004 => Dormir pendant le cours
005 => Chercher un stage à Haiti
006 => Attendre les vacances
007 => Prendre le goûter
008 => Caresser le chat
009 => Ecouter de la musique
010 => Rien faire
011 => Jouer à Angular
012 => Rêver
013 => Travailler jour et nuit

- Les Apprenants
1. ‘Géraldine’, ‘Autrique’,’1970-12-27’,’geraldine.autrique@laposte.fr’ en région Aquitaine => a pour activités : 001, 003, 005
2. ‘Nicolas’, ‘Filine’, ‘1986-08-07’, ‘nicolas.filine@laposte.fr’, en région Ile de France => a pour activités :002, 004, 006
3. ‘Pierre’, ‘Gorce’, ‘1976-01-05’, ‘pierrexgorce@gmail.com’, en région Ile de France => a pour activités :007
4. ‘Samuel’, ‘Joblon’, ‘1973-10-18’, ‘samuel.joblon@gmail.com’, en région Ile de France => a pour activités :008, 010
5. ‘Phoneprasong’, ‘Khamvongsa’, , ‘pomlao@hotmail.com’, en région pays de Loire => a pour activités :002, 004, 006
6. ‘Vincent’, ‘Lebegue’, ‘1986-08-13’, ‘vincent.lebegue@labanquepostale.fr’, en région Ile de France => a pour activités : 001, 003, 005
7. ‘Matthieu’, ‘Londeix’, ‘1981-05-19’, ‘matthieu.londeix@laposte.fr’, en région pays de Loire => a pour activités : 002, 004, 006
8. ‘Thomas’, ‘Longueville’, ‘1972-04-26’, ‘thomas.longueville@laposte.fr’, en région pays de Loire => a pour activités :008, 010 OO9
9. ‘Christine’, ‘Métivier’, ‘1980-04-29’, ‘christine.pereira@laposte.fr’, en région Ile de France => a pour activités :001, 003, 005
10. ‘Laurent’, ‘Picard’, ‘1972-05-23’, ‘laurent2.picard@laposte.fr’, en région Ile de France => a pour activités : 011
11. ‘David’, ‘Pouline’, ‘1982-07-07’, ‘david.pouline@facteo.fr’, en région Aquitaine => a pour activités : 002, 004, 006
12. ‘Julien’, ‘Prod'homme’, ‘1990-08-31’, ‘prodhomme.julien@gmail.com’, en région Ile de France => a pour activités : 001, 003, 005
13. ‘Samuel’, ‘Sabot’, ‘1980-04-10’, ‘samuel.sabot@facteo.fr’, en région Aquitaine => a pour activités : 011
14. ‘Salvatore’, ‘Sancesario’, ‘1975-05-10’, ‘salvatore.sancesario@facteo.fr’, en région Ile de France => a pour activités : 008, 010
15. ‘David’, ‘Sylvestre’, ‘1986-07-06’, ‘david.sylvestre@mfacteur.fr’, en région pays de Loire => a pour activités :001, 003, 005
16. ‘Cédric’, ‘Tressous’, ‘1984-08-08’, ‘cedric.tressous@gmail.com’, en région pays de Loire => a pour activités :008
17. ‘Zébulon’, ‘Zébutruc’, ‘1977-03-13’, ‘zebulonzeb@free.fr’, en région pays de Loire => a pour activités :ne fait aucune activité

- Table Jointure
IdApprennant
IdActivite
