import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a base's length: ");
        int baseLength = sc.nextInt();
        if (baseLength <= 0) {
            System.out.println("length must be a positive number");
            System.exit(0);
        }

        int vertexTriangle = (baseLength % 2 == 0) ? 2 : 1;
        for (int i = vertexTriangle; i <= baseLength; i = i + 2) {
            for (int j = 0; j < (baseLength - i) / 2; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
