package Encapsulation;

import java.security.PrivateKey;

public class SchoolDetails {
    private int familyIncome;

    public  void  School()
    {
        System.out.println("Army Public School");
    }

    private void StudentContact()
    {
        System.out.println("Here is Student Contact Details");
    }

    private void StudentBackGround()
    {
        System.out.println("Here is BackGround Details");
    }
    public void GetSchoolDetails()
    {
        StudentContact();
        StudentBackGround();
    }


    public void setFamilyIncome(int salary)
    {
        familyIncome=salary;
    }
    public int getFamilyIncome() {
        return familyIncome;
    }
    public SchoolDetails(String s,int i)
    {
        System.out.println(s + i);
    }


//    public static void main (String[] args)
//    {
//        SchoolDetails sd = new SchoolDetails();
//        sd.GetSchoolDetails();
//
//    }
}

