package ExceptionHandling;

public class NestedCatchBlock {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e);
            try {
                int c = a/b;
                System.out.println(c);
            } catch (Exception f) {
                System.out.println(f);
            }
        }
    }
}