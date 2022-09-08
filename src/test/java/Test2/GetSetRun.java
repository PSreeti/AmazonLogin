package Test2;

import org.openqa.selenium.devtools.v101.network.model.CrossOriginEmbedderPolicyStatus;

public class GetSetRun {
    public static void main(String[] args) {
        RollNum rm = new RollNum();

        rm.setRoll(1);
        rm.setNames(  "Ram");
        System.out.println(rm.getRoll() +"   "+ rm.getNames());
        rm.setRoll(2);
        rm.setNames(  "Shyam");
        System.out.println(rm.getRoll() +"   "+ rm.getNames());
        rm.setRoll(3);
        rm.setNames(  "Mohan");
        System.out.println(rm.getRoll() +"   "+ rm.getNames());
        rm.setRoll(4);
        rm.setNames(  "Vinay");
        System.out.println(rm.getRoll() +"   "+ rm.getNames());
        rm.setRoll(5);
        rm.setNames(  "Vicky");
        System.out.println(rm.getRoll() +"   "+ rm.getNames());





    }
}


//,"","","",""