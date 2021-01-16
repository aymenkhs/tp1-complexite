import java.math.BigInteger;

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
        System.out.println(for_loop(5));
        System.out.println(while_loop(5));
        System.out.println(do_loop(5));
        System.out.println(rec_sum(5));
    }
}