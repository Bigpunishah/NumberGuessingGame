import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random(1776);
        int arr[] = new int[100];
        Boolean isFound = false;



        System.out.println("Welcome to the random number guessing game!");
        System.out.println("Enter a number between 1 - 100!");
        System.out.print("Number:");
        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100);
            if(num == arr[i]){
                isFound = true;
            }
        }

        if(isFound == true){
            System.out.println("YOU WON!");
        }
        else System.out.println("SORRY! TRY AGAIN!");


    }
}