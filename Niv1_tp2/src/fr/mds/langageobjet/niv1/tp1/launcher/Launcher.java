package fr.mds.langageobjet.niv1.tp1.launcher;

public class Launcher {
    public static void main(String[] args) {
        /*
         *   - Un carré est définit par quatre côté égaux
         *   - Choisir la taille d'un côté
         *   - Rendre tout les autres côté  égaux
         *   - Calculer le périmètre du carré
         *   - Calculer et afficher l'aire du carré
         *   - Transformer votre carré en rectangle
         *   - Calculer le périmètre du rectangle
         *   - Calculer et afficher l'aire du rectangle
         */

        int c1, c2 ,c3, c4;
        c1 = c2 = c3 = c4 = 4;

        perimetreCarre(c1);
        aireCarre(c1);

        c1 = c3 = 8;
        perimetreRectangle(c1, c2);
        aireRectangle(c1,c2);

    }

    public static void perimetreCarre(int cote){
        System.out.println("Le perimètre du carré est de "+ cote * 4);
    }

    public static void aireCarre(int cote){
        System.out.println("L'aire du carré est de "+ cote * cote);
    }

    public static void perimetreRectangle(int longueur, int largeur){
        System.out.println("Le perimètre du rectangle est de "+ (longueur + largeur) *2);
    }
    public static void aireRectangle(int longueur, int largeur){
        System.out.println("L'aire' du rectangle est de "+ (longueur * largeur));
    }
}
