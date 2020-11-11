package fr.mds.langageobjet.niv1.tp4.launcher;

import java.util.Random;

public class Launcher {
    public static void main(String[] args) {
        /**
         * 	- Un étudiant veut faire cuire des côtes d’agneaux
         *	- En fonction de la cuisson bleu indice 1, saignant indice 2, cuit indice 3, à point indice 4 et brûlé indice 5 l’étudiant effectuera différentes actions
         *	- Si le repas n’est pas à point il laissera le repas cuire
         *	- Si le repas est brûlé alors il sera déçu
         *	- Si le repas est à point alors il sera content
         *	- L’étudiant lancera l’algo à chaque fois qui voudra connaitre l’état de son repas
         */

        int choix;
        String cuisson = "";
        Random rand = new Random();
        choix = rand.nextInt(5) +1;

        switch (choix) {
            case 1:
                cuisson = "bleu";
                break;
            case 2:
                cuisson = "saignant";
                break;
            case 3:
                cuisson = "cuit";
                break;
            case 4:
                cuisson = "à point";
                break;
            case 5:
                cuisson = "brûlé";
                break;
        }
        System.out.println("La cuisson est " + cuisson);

        switch (cuisson) {
            case "à point":
                System.out.println("L'étudiant est content");
                break;
            case "brûlé":
                System.out.println("L'étudiant est déçu");
                break;
            default:
                System.out.println("Laisser cuire");
                break;
        }

    }
}
