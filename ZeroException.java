public class ZeroException {
    public static void main(String[] args) {
        try {
            int a = 5, b = 0;
            System.out.println(a / b);
        } catch (ArithmaticException e) {
            System.out.println("number is divevd by zero");
        }
    }
}
