package Interface;

class Location implements Student,Teachers {   //multiple inheritance
    public void marks()
    {
        System.out.println("me");
    }

    public void Strict()
    {
        System.out.println("Strict");
    }
    public static void main(String[] args) {

        Location L= new Location();
        L.marks();
        L.Strict();


    }
}

