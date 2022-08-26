//This is the first assignment for CS-410. A simple yet creative "Hello World".

//imports
import java.util.Scanner;

public class Hello {
    public static void main (String[] args){
        System.out.println("Hello World. Hello Nate.");
        Scanner scan = new Scanner(System.in);
        System.out.println("How was your summer on a scale of good to great or bad to terrible? ");
        String summer = scan.next();

        //strings that the user can enter
        String s1 = new String("Good");
        String s2 = new String("good");
        String s3 = new String("Great");
        String s4 = new String("great");

        String s5 = new String("Bad");
        String s6 = new String("bad");
        String s7 = new String("Terrible");
        String s8 = new String("Terrible");

        //if user does not enter one of the local strings, then 
        if (summer.equals(s1) || summer.equals(s2) || summer.equals(s3) || summer.equals(s4)) {
            System.out.println("I am glad you had a " + summer +"summer!");
        } else if (summer.equals(s5) || summer.equals(s6) || summer.equals(s7) || summer.equals(s8)) {
            System.out.println("Oh no! I am so sorry you had a " + summer +" summer! :,(");
        } else {
                System.out.println("Not going to answer my question? Fine!");
        }
        System.out.println("Have a great day.");
    }

}

