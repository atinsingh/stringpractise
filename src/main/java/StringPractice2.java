public class StringPractice2 {
    // String not mutable
    public static void main(String[] args) {
       String str = "Hello World!";
        System.out.println(new StringBuffer(str).reverse());
    }
}
