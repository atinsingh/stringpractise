import java.nio.charset.Charset;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        // What is string ?
        // String is class
        Scanner scanner = new Scanner(System.in);
        String st1 = "Java";
        String st2 = new String("Java");
        char [] chars  = {'h','e','l','l','o'};
        byte [] bytes = { 100,101, 102,103,104,105};
        String st3 = new String(chars);
        String st4 = new String(bytes, Charset.forName("UTF-8"));
        String st5 = new String(bytes);
        System.out.println(st3);
        System.out.println(st4);
        System.out.println(st5);


        System.out.println("Please Enter Country Code");
       // String input = scanner.nextLine();
        String input = "VA";
        if(input.equals("IN")) {
            System.out.println("India");
        }else
        if(input.equals("US")) {
            System.out.println("United States");
        }
        else
        if(input.equals("CA")) {
            System.out.println("Canada");
        }else {
            System.out.println("NO RECORD FOUND");
        }
    }

}
