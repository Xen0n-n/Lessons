import java.util.Scanner;

public class Main {
    public static void task13(){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number > 0) {
            int m = scan.nextInt();
            System.out.println(number);
            if (m > 0) {
                task13();
            }
        }
    }

    public static String task14(int n){
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return task14(n / 10) + " " + n % 10;
        }
    }

    public static String task15(int n){
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            System.out.print(n % 10 + " ");
            return task15(n / 10);
        }
    }

    public static void main(String[] args){
        //task13();
        //System.out.println(task14(2540));
        System.out.println(task15(2540));
    }
}