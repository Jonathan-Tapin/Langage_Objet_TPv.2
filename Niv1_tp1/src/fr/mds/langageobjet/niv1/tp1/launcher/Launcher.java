package fr.mds.langageobjet.niv1.tp1.launcher;

public class Launcher {
    public static void main(String[] args) {

        /*
         *  - Jasmine et Aladin possèdent tout les deux un panier de pomme
         *  - Jasmine a 7 pommes dans son panier et Aladin 5
         *  - Il regroupe leurs pommes dans un nouveau panier
         *  - Afficher le nombre de pomme de Jasmine et Aladin
         */

        int aladin = 5;
        int jasmine = 7;

        int panierCommun = aladin + jasmine;

        System.out.println("Jasmine a " + jasmine + " pommes" + "\n" +
        "Aladin a " + aladin + " pommes" + "\n" +
        "Leur pannier commun a " + panierCommun + " pommes");

    }
}
