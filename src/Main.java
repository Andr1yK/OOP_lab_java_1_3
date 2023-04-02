import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, xp, xk, dx, A, B, y;

        Scanner input = new Scanner(System.in);

        System.out.print("xp = ");
        xp = input.nextDouble();

        System.out.print("xk = ");
        xk = input.nextDouble();

        System.out.print("dx = ");
        dx = input.nextDouble();

        System.out.println("----------------------");
        System.out.println("|      x       |      y       |");
        System.out.println("----------------------");

        x = xp;

        while (x <= xk) {
            A = (2 + x) / Math.pow(x, 2) + 1;

            if (x < 0)
                B = Math.pow(x, 3) - 2 * Math.pow(x, 4);
            else if (x > 2)
                B = 4 * Math.cos(Math.pow(x, 2) - 2);
            else
                B = Math.pow(Math.abs(x) + Math.exp(x), 3);

            y = A + B;

            System.out.printf("|%12.2f |%12.3f |\n", x, y);

            x += dx;
        }

        System.out.println("----------------------");
    }
}
