import java.util.Scanner;

public class Firstcalc {
    public static void main(String[] args) {    //this code make multiple inputed numbers
//      კლასი  + ახალი სახელი = შექმენი ძველი კლასის შაბლონიდან ახალი კლასი რომელიც მონაცემებს შემოიტანს
        Scanner scannerobject = new Scanner(System.in); // (System.in) როდესაც შემოგვაქვს რაიმე კლასი ან ვაიმპორტებთ ბიბლიოთეკიდან კლასს, საჭიროა ბოლოს მივუთითოთ ამ კლასს მონაცემები შემოაქვს თუ გამოაქვს, ანუ ინფათს აკეთებს თუ აუთფათს აბრუნებს.
        System.out.print("Hi, write your number to multip:");
        int input = scannerobject.nextInt(); //  ამ კოდში .nextInt() ნიშნავს მეთოდს, რომელიც არ გადადის შემდეგ ლაინზე სანამ არ შეიყვან მონაცემს
        int result = input * input;
        System.out.println("result is:" + result);
        
    }

}