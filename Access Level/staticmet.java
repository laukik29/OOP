class honda {
    static int x = 2;
    // int x = 2;

    public static void display(String color) {
 //static method
 
    // static int y =2; //wrong, cant declare static variable outside class!, cant be declared in the method
    System.out.println("color is " +color);
    //System.out.println(" X is : " +x);
    display("Amaze", "Sedan");

    }

    public static void display(String model, String type)  //non static method
        //public void display(String model, String type)
    {
        // static int x = 3;
        //int x =4;
        System.out.println("Model is " +model+" Type is " +type);
        System.out.println("X is : "+ ++x);
        //display("Red");
    }
 }

 class staticmet {
    public static void main(String[] args ) {
        honda.display("Black");
        honda.display("VCVT","Sedan");

    }
 }