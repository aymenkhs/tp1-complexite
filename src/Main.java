import java.util.Scanner;
import java.lang.Math;

public class Main
{

    public static double for_loop(double n){
        double somme = 0;
        for (int i=1; i<=n; i++){
            somme+=i;
        }
        return somme;
    }

    public static double while_loop(double n){
        double somme = 0;
        int i=1;
        while (i<=n){
            somme+=i;
            i++;
        }
        return somme;
    }

    public static double do_loop(double n){
        double somme = 0;
        int i=0;
        do{
            somme+=i;
            i++;
        }while (i<=n);
        return somme;
    }

    public static double rec_sum(double n){
        if(n < 1){
            return 0;
        }else {
            return rec_sum(n-1) + n;
        }
    }


    public static void main(String[] args) {


        double multiplicateur = 1;
        double integer = 10;
        double puissance = 1;

        while (puissance < 13){
            double n = multiplicateur * (Math.pow(integer, puissance));
            System.out.println("the actual number is : " + multiplicateur + "*" + integer + "^" + puissance +"\nor : " + n);

            long startTime = System.nanoTime();
            double for_result = for_loop(n);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Le resultats obtenue pour la boucle for est : " + for_result + "\nLe temps necessaire est : " + duration);

            startTime = System.nanoTime();
            double while_result = while_loop(n);
            endTime = System.nanoTime();
            duration = (endTime - startTime);
            System.out.println("Le resultats obtenue pour la boucle while est : " + while_result + "\nLe temps necessaire est : " + duration);

            startTime = System.nanoTime();
            double do_result = do_loop(n);
            endTime = System.nanoTime();
            duration = (endTime - startTime);
            System.out.println("Le resultats obtenue pour la boucle do est : " + do_result + "\nLe temps necessaire est : " + duration);


            try {
                startTime = System.nanoTime();
                double rec_result = rec_sum(n);
                endTime = System.nanoTime();
                duration = (endTime - startTime);
                System.out.println("Le resultats obtenue pour la recursivité est : " + rec_result + "\nLe temps necessaire est : " + duration);
            }
            catch(java.lang.StackOverflowError e) {
                System.out.println("Le resultats n'a pas pu etre obtenue pour la recursivité a cause du depth recursion limite Le temps necessaire est indeterminer");
            }


            if (multiplicateur == 1){
                multiplicateur = 2;
            } else {
                multiplicateur = 1;
                puissance += 1;
            }

            System.out.println("\n\n\n");
        }
    }

}
