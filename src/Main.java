import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        PrintOdd(11);


    }
    static int PrintOdd(int input){
        if(input==1) {
            System.out.println(input);
            return 0;
        }

        if(input%2!=0){
            System.out.println(input);
            PrintOdd(input-2);
        }

        if(input%2==0) {
            PrintOdd(input-1);
        }
        return 1;
    }