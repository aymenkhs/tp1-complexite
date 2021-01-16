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
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter n (the number accepted must be in the form of: int*int^int)");
        String unformated_n = myScan.nextLine();
        System.out.println("your writed :" + unformated_n);

        double n = format_n(unformated_n);
        System.out.println("your number is :" + n);

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

        startTime = System.nanoTime();
        double rec_result = rec_sum(n);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Le resultats obtenue pour la recursivité est : " + rec_result + "\nLe temps necessaire est : " + duration);

    }

    public static double format_n(String unformated_n){
        double mult = 1, puiss = 1, integer;

        String[] arrOfStr = unformated_n.split("\\*");
        if (arrOfStr.length > 1){
            mult = Double.parseDouble(arrOfStr[0]);
            unformated_n = arrOfStr[1];
        } else {
            unformated_n = arrOfStr[0];
        }

        arrOfStr = unformated_n.split("\\^");
        if (arrOfStr.length > 1){
            integer = Double.parseDouble(arrOfStr[0]);
            puiss = Double.parseDouble(arrOfStr[1]);
        } else {
            integer = Double.parseDouble(arrOfStr[0]);
        }

        return mult * (Math.pow(integer, puiss));
    }
}
