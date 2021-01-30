import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {
        String str1 = "J Learning Java JString";
        String str2 = "Learning JAVA String";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        // You may have need to store values in upper case or lowers
        // immutable - constant

        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1);
        byte[] bytes = str1.getBytes(StandardCharsets.UTF_8);

        System.out.println(str1.charAt(4));
        System.out.println(str1.indexOf("J", 3));
        System.out.println(str1.lastIndexOf("J"));

        System.out.println(Arrays.toString(bytes));

        String st1 = "Hello ";
        String st2 = "Java";

        String st3 = st1.concat(st2);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        String st4 = " as";
        String st5 = "hello.com";

        System.out.println(st4.isEmpty());
        boolean matches = st5.matches("[aA-zZ]+.[a-z]+");
        System.out.println(st5.replace("hello","hola"));
        System.out.println(st5);

        String st6 = "pragra123.123com";
        System.out.println(st6.replaceFirst("[0-9]+",""));
        //System.out.println(st3.endsWith("Jav23"));
        String str = "Prakash Navleen Lakshmi Raj";
        String[] names = str.split(" ");

        System.out.println(Arrays.toString(names));
        System.out.println(st6.subSequence(0,4));
        System.out.println(st6.substring(6));
        System.out.println(st6.substring(6, 6));

        System.out.println(st6.substring(st6.length() - 6));

        String st7 = "           Java Class        ";
        System.out.println(st7);
        System.out.println(st7.trim());
        System.out.println(st7);

        /*
             String str = "Hello World!"
             reserve the string and print it
             !dlroW olleH

             // how many time Alice is occurred,
             //  count all words with length more than 4 chars

         */

        // Dear <10char>, Your account 000000000, is due for $xx.xx, kindly do payment
        /*
            %10s - supports string
            %010d - support whole nuber
            %.2f - support double/floating
         */
        String formattedString = String.format("Dear %s, Your account %010d is due for $%04.2f, kindly do the payment", "Prakash", 1234567, 1200.267);
        System.out.println(formattedString);

        int num = 1237837873;
        String s = String.valueOf(num);
        System.out.println(s);
        String out = "<<>>";
        String word  = "Yah";
        System.out.println(word.substring(word.length()-2));
        // <<Yah>>
        System.out.println(out.substring(0, 2)+word + out.substring(2));

    }
}
