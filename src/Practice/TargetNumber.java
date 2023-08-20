package Practice;
import java.util.Scanner;
public class TargetNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = { 2, 5, 8, 12, 16, 23, 38, 45, 72, 91 };
        int target = 16;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break; // No need to continue searching if target is found
            }
        }

        if (found) {
            System.out.println("Target " + target + " found in the array.");
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}


