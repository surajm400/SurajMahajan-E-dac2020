package DSArraypack;
import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        int sum = 0;
        System.out.println("enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            sum +=arr[i];
        }
        System.out.println(sum);

    }
}


