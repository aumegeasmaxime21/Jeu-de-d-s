import java.util.Scanner;

public class JeuDeDesVersion3 {
    public static void main(String[] args) {

        boolean run = true;
        System.out.println("trouver le nombre entre 0 et 12?");
        Scanner entrer = new Scanner(System.in);
        int d = entrer.nextInt();

        while (run) {
            int a = ((int) (Math.random() * 6));
            int b = ((int) (Math.random() * 6));
            int c = (a + b);
            System.out.println(a+b);

            if (c == d) {
                System.out.println("You Win");
                run = false;
            } else {
                System.out.println("You Lose!! try again!!");
                d = entrer.nextInt();
            }

        }






    }
}
