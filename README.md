
[![Build Status](https://travis-ci.org/benzait27/Dauphine-Open-Data.svg?branch=develop)](https://travis-ci.org/benzait27/Dauphine-Open-Data)

[![GitHub version](https://badge.fury.io/gh/benzait27%2FDauphine-Open-Data.svg)](https://badge.fury.io/gh/benzait27%2FDauphine-Open-Data)

# Dauphine Open Data

L’université Paris-Dauphine crée et met à jour de nombreuses données publiques, qui sont parfois mises à disposition uniquement via son site web, voire parfois non mises à disposition et simplement conservées dans des bases de données.

Le mouvement open data considère que les données bénéficient d’une exposition maximale, dans des formats facilement lisibles par des machines. Entre autres bénéfices, cette approche facilite la réutilisation et l’innovation.

Ce projet a pour but de créer une plate-forme qui servira à la mise à disposition de certaines données publiques de Paris-Dauphine. Il visera à mettre également à disposition certaines données non publiques après authentification. Par exemple, un enseignant a droit d’accès aux adresses e-mail des étudiants qui suivent son cours, mais ces données ne sont pas publiques.


## Installation dev

TODO ...
```
 pour les commandes ...
```
## Deploiement
cf api https://api.eu-gb.bluemix.net

cf login (puis entrer email et mdp)

cf push 

(récupère la configuration manifest lien : http://dauphine-open-data.eu-gb.mybluemix.net)

## Lancement

Pour lancer le projet suivre les etapes suivantes

1/ lancer http://dauphine-open-data.eu-gb.mybluemix.net/BDDfedd
cette etape peremets d'ilimenter la BDD par l'ensemble de cours et ensignants

2/ lancer http://dauphine-open-data.eu-gb.mybluemix.net
pour lister les diffrentes cours et personnes créer precedement

3/ pour suprimer la BDD ou relancer le tester vous dervrer lancer la servlet
http://dauphine-open-data.eu-gb.mybluemix.net/DeletAll

### Lancer les tests

comment lancer les tests 
```
commande pour test
```

## Contributeurs

[zsouiki] Ziad SOUIKI M2 MIAGE

## Version

Actuellement en version 0.0.1 


## Sources

Concernant la structure du code, nous nous sommes fortement inspiré du projet suivant : 

https://github.com/javaee-samples/javaee8-applications