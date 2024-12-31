import java.util.Scanner;

    public class Main {



    public static void main(String[] args) {

        //Reset des cases
        String c1 = " ";
        String c2 = " ";
        String c3 = " ";
        String c4 = " ";
        String c5 = " ";
        String c6 = " ";
        String c7 = " ";
        String c8 = " ";
        String c9 = " ";

        //Création des variables de choix
        int choix = 0;
        int choix2 = 0;

        //Création des variables de tests de fin
        int intc1 = 0;
        int intc2 = 0;
        int intc3 = 0;
        int intc4 = 0;
        int intc5 = 0;
        int intc6 = 0;
        int intc7 = 0;
        int intc8 = 0;
        int intc9 = 0;

        //Création de la variable pour limiter le nombre de tours
        int ntour = 0;

        //Création de la variable pour identifier le gagnant
        int win = 0;


        //Grille de départ
        System.out.println("[1][2][3]");
        System.out.println("[4][5][6]");
        System.out.println("[7][8][9]");

        System.out.println(" ");

//Morpion - Boucle + Test pour le nombre de tours
while (ntour < 10) {

        /*Premier Joueur*/

    System.out.println(" ");
    System.out.println("Premier Joueur :");

    Scanner scanner = new Scanner(System.in);
    choix = scanner.nextInt();

    if (choix == 1) {
        if (c1.equals(" ")) {

            c1 = "X";
            intc1 = 1;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix == 2) {
        if (c2.equals(" ")) {

            c2 = "X";
            intc2 = 1;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix == 3) {
        if (c3.equals(" ")) {

            c3 = "X";
            intc3 = 1;
            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix == 4) {
        if (c4.equals(" ")) {

            c4 = "X";
            intc4 = 1;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix == 5) {
        if (c5.equals(" ")) {

            c5 = "X";
            intc5 = 1;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix == 6) {
        if (c6.equals(" ")) {

            c6 = "X";
            intc6 = 1;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix == 7) {
        if (c7.equals(" ")) {

            c7 = "X";
            intc7 = 1;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix == 8) {
        if (c8.equals(" ")) {

            c8 = "X";
            intc8 = 1;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix == 9) {
        if (c9.equals(" ")) {

            c9 = "X";
            intc9 = 1;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    choix = 0;

        //Conditions de victoire Joueur 1

    //Horizontal
    if (intc1 == 1 && intc2 == 1 && intc3 == 1){
        win = 1;
        break;
    }
    if (intc4 == 1 && intc5 == 1 && intc6 == 1){
        win = 1;
        break;
    }
    if (intc7 == 1 && intc8 == 1 && intc9 == 1){
        win = 1;
        break;
    }

    //Vertical
    if (intc1 == 1 && intc4 == 1 && intc7 == 1){
        win = 1;
        break;
    }
    if (intc2 == 1 && intc5 == 1 && intc8 == 1){
        win = 1;
        break;
    }
    if (intc3 == 1 && intc6 == 1 && intc9 == 1){
        win = 1;
        break;
    }

    //Diagonal
    if (intc1 == 1 && intc5 == 1 && intc9 == 1){
        win = 1;
        break;
    }
    if (intc3 == 1 && intc5 == 1 && intc7 == 1){
        win = 1;
        break;
    }


        /* Deuxième Joueur */

    System.out.println(" ");
    System.out.println("Second Joueur :");

    Scanner scaner = new Scanner(System.in);
    choix2 = scanner.nextInt();

    if (choix2 == 1) {
        if (c1.equals(" ")) {

            c1 = "O";
            intc1 = 2;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix2 == 2) {
        if (c2.equals(" ")) {

            c2 = "O";
            intc2 = 2;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix2 == 3) {
        if (c3.equals(" ")) {

            c3 = "O";
            intc3 = 2;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix2 == 4) {
        if (c4.equals(" ")) {

            c4 = "O";
            intc4 = 2;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix2 == 5) {
        if (c5.equals(" ")) {

            c5 = "O";
            intc5 = 2;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix2 == 6) {
        if (c6.equals(" ")) {

            c6 = "O";
            intc6 = 2;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix2 == 7) {
        if (c7.equals(" ")) {

            c7 = "O";
            intc7 = 2;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix2 == 8) {
        if (c8.equals(" ")) {

            c8 = "O";
            intc8 = 2;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    if (choix2 == 9) {
        if (c9.equals(" ")) {

            c9 = "O";
            intc9 = 2;

            System.out.println(" ");

            System.out.println("[" + c1 + "][" + c2 + "][" + c3 + "]");
            System.out.println("[" + c4 + "][" + c5 + "][" + c6 + "]");
            System.out.println("[" + c7 + "][" + c8 + "][" + c9 + "]");
        }
    }

    choix2 = 0;

    //Ajoute un tour
    ntour++;

        //Conditions de victoire Joueur 2

    //Horizontal
    if (intc1 == 2 && intc2 == 2 && intc3 == 2){
        win = 2;
        break;
    }
    if (intc4 == 2 && intc5 == 2 && intc6 == 2){
        win = 2;
        break;
    }
    if (intc7 == 2 && intc8 == 2 && intc9 == 2){
        win = 2;
        break;
    }

    //Vertical
    if (intc1 == 2 && intc4 == 2 && intc7 == 2){
        win = 2;
        break;
    }
    if (intc2 == 2 && intc5 == 2 && intc8 == 2){
        win = 2;
        break;
    }
    if (intc3 == 2 && intc6 == 2 && intc9 == 2){
        win = 2;
        break;
    }

    //Diagonal
    if (intc1 == 2 && intc5 == 2 && intc9 == 2){
        win = 2;
        break;
    }
    if (intc3 == 2 && intc5 == 2 && intc7 == 2){
        win = 2;
        break;

    }
}

//Message de Fin

        System.out.println(" ");
        System.out.println("---------------------------------------------------------");
        System.out.println(" ");
        System.out.println("                  Partie Terminée !!!");

        if(win==0) {
        System.out.println("                       Egalité !");
        }

        if(win==1) {
        System.out.println("                    Player 1 Win !");
        }

        if(win==2) {
        System.out.println("                    Player 2 Win !");
        }




System.out.println(" ");
System.out.println("---------------------------------------------------------");

    }
}