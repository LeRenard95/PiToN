import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double d = Math.PI;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1-5");
        int numberN = input.nextInt();

        switch (numberN) {

            case 1:
                System.out.format("%.1f", d);

                break;

            case 2:
                System.out.format("%.2f", d);

                break;

            case 3:
                System.out.format("%.3f", d);

                break;

            case 4:
                System.out.format("%4f", d);

                break;

            case 5:
                System.out.format("%5f", d);

                break;
        }

        System.out.println();
    }

}