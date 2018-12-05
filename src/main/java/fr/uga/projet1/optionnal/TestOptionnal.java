package fr.uga.projet1.optionnal;

import java.util.Optional;

public class TestOptionnal {
    public static void main(String[] args) {
        /*
         * Il existe 2 types :
         * - types primitifs : byte, short,int, long, float, double, boolean, char 
         * - types objets : Object, String, Wrappers
         */
        int x = 5;
        //Wrapper (type enveloppe) = type objet équivalent à un type simple existant
        /*
         * int =========> Integer
         * char ========> Character
         * double=======> Double
         * ...
         */
        Integer y = x;
        
        boolean estPresent = false;
        Boolean estPres = null;
        
        Integer v1 = null;
        Integer v2 = 10;
        
        //Optional.ofNullable : 
        Optional<Integer> optV1 = Optional.ofNullable(v1);
        Optional<Integer> optV2 = Optional.of(v2); //v2 ne peut pas être null
        
        //optV1.isPresent() //test la présence d'une valeur
        //optV1.orElse(0) : retourne la valeur présente sinon 0
        Optional<Double> optV3  = Optional.ofNullable(null);
        //double res = prixTTC(1000, null);
        //System.out.println(res);
    }
}

//visibilité mots-clé typeRetour nomMethode(paramètres)

//public static double prixTTC(double montantHT, Optional<Double> tva) {
//        //return montantHT* tva.orElse(AppConstants.TVA_RATE);
//        
//}
