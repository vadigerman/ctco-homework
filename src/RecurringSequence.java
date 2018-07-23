public class RecurringSequence {
    public static int countRecurringSequence (int[] arr) {
        int number = arr[0];
        int currentNumber;
        int lengthSequence = 1;
        int currentLengthSequence = 1;
        for(int i = 1; i < arr.length; i++) {
            currentNumber = arr[i];
            if (currentNumber == arr[i - 1]) {
                currentLengthSequence++;
                if (currentLengthSequence > lengthSequence) {
                    lengthSequence = currentLengthSequence;
                    number = currentNumber;
                }
            } else {
                currentLengthSequence = 1;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 5, 5, 5, 5, 5, 5, 5};
        System.out.println(countRecurringSequence(arr));
    }
}