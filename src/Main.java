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

        double n = format_n(unformated_n);
        
        System.out.println(for_loop(n));
        System.out.println(while_loop(n));
        System.out.println(do_loop(n));
        System.out.println(rec_sum(n));
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

        System.out.println(mult);
        System.out.println(integer);
        System.out.println(puiss);

        return mult * (Math.pow(integer, puiss));
    }
}
