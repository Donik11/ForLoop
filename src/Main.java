import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n ni kiriting: ");
        int n = scanner.nextInt();
        int summa = 0;
        int multiply = 1;
        int division = 1;
        int juft = 0;
        double residual = 0;
        for (int i = 1; i <=n; i++) {
            summa += i;
            multiply *= i;

            if (i%3 == 0) {
                division *= i;
            }
            if (i%2 == 0) {
                juft += i;
            }
            if (i%3 != 0){
                residual += i;
            }
        }
        System.out.println(n+" gacha bo'lgan sonlar yig'indisi: "+summa);
        System.out.println(n+" gacha bo'lgan sonlar ko'paytmasi: "+multiply);
        System.out.println(n+" gacha bo'lgan sonlarini 3 ga bo'lganda qoldiq 0ga teng bo'lgan sonlar ko'paytmasi: "+division);
        System.out.println(n+" gacha bo'lgan juft sonlar yig'indisi: : "+juft);
        System.out.println(n+" gacha bo'lgan sonlar orasidan 3 ga bo'lganda qoldiq qoladigan sonlar yig'indisi: : "+residual);
    }
}