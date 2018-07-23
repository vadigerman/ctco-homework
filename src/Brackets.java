import java.util.Scanner;

public class Brackets {
    public static void determineStringBalance (String str) {
        String initStr = str;
        String[] brackets = {"()", "[]", "{}"};
        while (str.length() > 1) {
            String oldStr = str;
            for (String bracket:brackets) {
                str = findBrackers(str, bracket);
                System.out.println(str);
            }
            if (str.equals(oldStr)) {
                System.out.println(initStr + " is not balanced");
                str = "1";
            }
        }
        if (str.length() == 0) {
            System.out.println(initStr + " is balanced");
        }
    }

    public static String findBrackers (String str, String subStr) {
        int number = str.indexOf(subStr);
        if (number >= 0) {
            str = str.substring(0, number) + str.substring(number+2);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        determineStringBalance(str);
    }
}
