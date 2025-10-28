import java.util.Scanner;

public class JeuDeDesVersion2 {
    public static void main(String[] args) {

        int a = ((int) (Math.random() * 6));
        int b = ((int) (Math.random() * 6));
        int c = (a + b);

        boolean run = true;
        System.out.println("trouver le nombre entre 0 et 12?");
        Scanner entrer = new Scanner(System.in);
        int d = entrer.nextInt();

        while (run) {
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
