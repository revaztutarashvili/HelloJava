import java.util.Scanner;

public class Firstcalc {
    public static void main(String[] args) {

        Scanner scannerobject = new Scanner(System.in);
        System.out.print("Hi, write your number to multip:");
        int input = scannerobject.nextInt();
        int result = input * input;
        System.out.println("result is:" + result);
        
    }

}