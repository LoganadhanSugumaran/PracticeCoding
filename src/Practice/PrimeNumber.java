package Practice;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N=sc.nextInt();
        System.out.println("Prime numbers from 1 to "+ N +": ");
        for(int num =2;num<=N ;num++){
            if(isPrime(num)){
                System.out.println(num + " ");
            }
        }

    }
    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }

        if(num<=3){
            return true;
        }
        if(num%2==0 || num% 3 ==0){
            return false;
        }

        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
