package Practice;
import java.util.Scanner;


public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number= sc.nextInt();
        if(isPalindrome(number)){
            System.out.println(number + " is a palindrome number");
        }else{
            System.out.println(number + " Is not a palindrome number");
        }
    }

    public static boolean isPalindrome(int number){
        int OriginalNumber = number;
        int ReversedNumber = 0;
        while(number>0){
            int LastDigit = number %10;
            ReversedNumber= ReversedNumber*10 + LastDigit;
            number /=10;
        }
        return OriginalNumber== ReversedNumber;
    }
}
