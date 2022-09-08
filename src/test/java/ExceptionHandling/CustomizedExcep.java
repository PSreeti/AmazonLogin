package ExceptionHandling;

public class CustomizedExcep extends Exception {

    CustomizedExcep()
    {
        super("Helloji");
    }

    CustomizedExcep(String message){
          super("Hi There");

    }

    public static void main(String[] args) {


        int age = 12;

      try{
            if (age <27)
                {
                throw new CustomizedExcep("Hey");
            }
            else {
                System.out.println("can vote");
            }
        }

    catch( CustomizedExcep C )
        {
            System.out.println( C );
        }
    }


}
