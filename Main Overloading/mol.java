public class mol {
    //normal main() method 
    public static void main(String[] args) {

        System.out.println("Hi");
        main("Welcome");
        System.out.println(args.length);
        for(int i =0; i<args.length;i++) {
            //System.out.println(i);
            System.out.println(args[i]);
        }
    }

    //overloaded main methods 
    public static void main(String arg1) {
        System.out.println("there, " +arg1);
        main("to","OOP");
        //main("abc","def,"ghi);

    }

    //overloaded main method 
    public static void main(String arg1, String arg2) {
        System.out.println("all "+arg1 +" "+arg2);
    }
}