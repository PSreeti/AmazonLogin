package ExceptionHandling;

public class ThrowDemo {

        void multiply(int a, int b) throws ArithmeticException
        {
            if(b==0)
            {
               throw new ArithmeticException();
            }
            else
            {
                int c= a*b;
                System.out.println(c);
            }

        }

    public static void main(String[] args) throws ArithmeticException  {
        ThrowDemo td = new ThrowDemo();
        td.multiply(2,0);
    }


}
