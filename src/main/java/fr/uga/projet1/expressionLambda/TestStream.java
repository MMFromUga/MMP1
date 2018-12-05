package fr.uga.projet1.expressionLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestStream {
	public static void main(String[] args) {
		
		List<Etudiant> etudiants = new ArrayList<>();
		for (int i=1 ; i<=10; i++) {
			etudiants.add(new Etudiant("etu"+i, "prenom"+i, (double) (i*2)));
			etudiants.add(new Etudiant("etux"+i, "prenom"+i, i*1.5));
		}
		
		
		//etudiants triés par moyenne
		List<Etudiant> lEtuMoy = etudiants.stream()
				.sorted(Comparator.comparingDouble(Etudiant::getMoyenne))
				.collect(Collectors.toList());	
		lEtuMoy.forEach(System.out::println);	
		
//		- retourne tous les étudiants qui ont la moyenne ;
		
		List<Etudiant> lEtuMoy1 = etudiants.stream()
				.filter((e)->e.getMoyenne()>=10) //filtre
				.collect(Collectors.toList()); //collecter le résultat
		lEtuMoy1.forEach(System.out::println);
//		- retourne le nom de tous les étudiants qui ont la moyenne, sous forme
//		d’un ensemble java
		List<String> lNomEtuMoy = etudiants.stream()
				.filter((e)->e.getMoyenne()>=10)
				.map(Etudiant::getNom) //appliquer à chaque élement une fonction particulière
				.collect(Collectors.toList());
		lNomEtuMoy.forEach(System.out::println);
//		- retourne le nom de tous les étudiants qui ont la moyenne, sous forme
//		d’une liste, séparée par des virgules (regardez la classe Collectors)
		String lNomEtuMoyVirg = etudiants.stream()
				.filter((e)->e.getMoyenne()>=10)
				.map(Etudiant::getNom) //appliquer à chaque élement une fonction particulière
				.collect(Collectors.joining(","));
		System.out.println(lNomEtuMoyVirg);
//		- calcule la moyenne générale.
		System.out.println("Moyenne génrale");
		Double moyGenerale = etudiants.stream()
				.collect(Collectors.averagingDouble(Etudiant::getMoyenne));
		System.out.println(moyGenerale);

		//		Personne qui a la meilleure moyenne
		System.out.println("Personne qui a la meilleure moyenne -------");
		String nomMeilleureMoy = etudiants.stream()
				.max(Comparator.comparingDouble(Etudiant::getMoyenne))
				.map(Etudiant::getNom)
				.get();
		System.out.println(nomMeilleureMoy);
		
//		- construire une map avec trois clefs : recalé, passable, bien, très bien
		
		Map<String, List<Etudiant>> myMap =
				etudiants.stream()
				.collect(Collectors.groupingBy(Etudiant::getMention));
		myMap.forEach((cle,valeur)->{
			System.out.print(cle + " = ");
			//valeur.forEach(e->System.out.println(e->););
		});
		for  (String cle : myMap.keySet()) {
			System.out.print(cle + " = ");
			for (Etudiant et : myMap.get(cle)) {
				System.out.print(et.getNom() + ", ");
			}
			System.out.println();
		}
	}

//	Exo Stream :
//	    on donne une collection d’étudiants (nom, prenom, moyenne). En utilisant
//	les streams et les lambda, écrire fonctions qui :




//	- calcule la moyenne générale.

//	- retourner le nom de la personne qui a eu la meilleure moyenne	
		
}
