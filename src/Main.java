import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String c1 = " ";
        String c2 = " ";
        String c3 = " ";
        String c4 = " ";
        String c5 = " ";
        String c6 = " ";
        String c7 = " ";
        String c8 = " ";
        String c9 = " ";



        System.out.println("[ ][ ][ ]");
        System.out.println("[ ][ ][ ]");
        System.out.println("[ ][ ][ ]");

        System.out.println(" ");


        System.out.println("Premier Joueur :");

        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();

        if (choix == 1) {
            if (c1 == (" ")) {
                System.out.println(" ");
                System.out.println("[X][ ][ ]");
                System.out.println("[ ][ ][ ]");
                System.out.println("[ ][ ][ ]");

                c1 = "X";
            }
        }

        if (choix == 2) {
            if (c2 ==(" ")) {
                System.out.println(" ");
                System.out.println("[ ][X][ ]");
                System.out.println("[ ][ ][ ]");
                System.out.println("[ ][ ][ ]");

                c2 = "X";
         }
        }

        if (choix == 3) {
            if (c3 ==(" ")) {
                System.out.println(" ");
                System.out.println("[ ][ ][X]");
                System.out.println("[ ][ ][ ]");
                System.out.println("[ ][ ][ ]");

                c3 = "X";
            }
        }

        if (choix == 4) {
            if (c4 ==(" ")) {
                System.out.println(" ");
                System.out.println("[ ][ ][ ]");
                System.out.println("[X][ ][ ]");
                System.out.println("[ ][ ][ ]");

                c4 = "X";
            }
        }

        if (choix == 5) {
            if (c5 ==(" ")) {
                System.out.println(" ");
                System.out.println("[ ][ ][ ]");
                System.out.println("[ ][X][ ]");
                System.out.println("[ ][ ][ ]");

                c5 = "X";
            }
        }

        if (choix == 6) {
            if (c6 ==(" ")) {
                System.out.println(" ");
                System.out.println("[ ][ ][ ]");
                System.out.println("[ ][ ][X]");
                System.out.println("[ ][ ][ ]");

                c6 = "X";
            }
        }

        if (choix == 7) {
            if (c7 ==(" ")) {
                System.out.println(" ");
                System.out.println("[ ][ ][ ]");
                System.out.println("[ ][ ][ ]");
                System.out.println("[X][ ][ ]");

                c7 = "X";
            }
        }

        if (choix == 8) {
            if (c8 ==(" ")) {
                System.out.println(" ");
                System.out.println("[ ][ ][ ]");
                System.out.println("[ ][ ][ ]");
                System.out.println("[ ][X][ ]");

                c8 = "X";
            }
        }

        if (choix == 9) {
            if (c9 ==(" ")) {
                System.out.println(" ");
                System.out.println("[ ][ ][ ]");
                System.out.println("[ ][ ][ ]");
                System.out.println("[ ][ ][X]");

                c9 = "X";
            }
        }

    choix = 0;
        System.out.println(test);


    }
}