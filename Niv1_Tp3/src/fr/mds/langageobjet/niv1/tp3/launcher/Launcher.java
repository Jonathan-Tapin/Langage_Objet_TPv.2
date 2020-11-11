package fr.mds.langageobjet.niv1.tp3.launcher;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        /*
         *         - Vous devez créer un programme de calcul qui demande à un utilisateur de saisir 2 chiffres entiers
         *         - Si les 2 chiffres sont identiques le programme retourne la somme des 2 chiffres
         *         - Si le premier nombre saisi est négatif et le deuxième est positif on retourne le produit des 2 chiffres
         *         - Si les 2 chiffres sont positif ou négatif et qu’un des chiffres est supérieur à 10 ou inférieur à -10 on retourne la division des 2 chiffres
         *         - Attention à bien indiquer à l'utilisateur se qu'il doit faire
         */

        Scanner sc = new Scanner(System.in);
            int nb1 = 0;
            int nb2 = 0;

        System.out.println("Veuillez entrer un premier nombre");
        nb1 = sc.nextInt();
        System.out.println("Veuillez entrer un deuxième nombre");
        nb2 = sc.nextInt();

        if (nb1 == nb2) {
            System.out.println("La somme est de " + (nb1 + nb2));
        }

        if( nb1 < 0 && nb2 > 0) {
            System.out.println("Le produit est de " + (nb1 * nb2));
        }
        if ( ((nb1 >= 0 && nb2 >= 0) || (nb1 < 0 && nb2 < 0)) && ((nb1 > 10 || nb1 < -10) || (nb2 > 10 || nb2 < -10)) ) {
            if (nb2 == 0) {
                System.out.println("Division par 0 impossible");
            }
            System.out.println("La division est de " + (nb1/nb2));
        }

        sc.close();
    }
}
