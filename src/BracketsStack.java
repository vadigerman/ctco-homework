import java.util.Scanner;

public class BracketsStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        String strStack = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
                strStack += str.charAt(i);
            } else if (str.charAt(i) == '}' && strStack.charAt(strStack.length() - 1) == '{' ||
                    str.charAt(i) == ')' && strStack.charAt(strStack.length() - 1) == '(' ||
                    str.charAt(i) == ']' && strStack.charAt(strStack.length() - 1) == '[') {
                strStack = strStack.substring(0, strStack.length() - 1);
            } else {
                i = str.length() - 1;
            }
        }
        if (strStack.length() == 0) {
            System.out.println(str + " is balanced");
        } else {
            System.out.println(str + " is not balanced");
        }
    }
}
