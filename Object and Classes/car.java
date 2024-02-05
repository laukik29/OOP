class Maruti {
    int no_of_airbags;
    double mileage;
}
class car {
    public static void main(String args[]) {
        Maruti ciaz = new Maruti();
        ciaz.no_of_airbags = 2;
        ciaz.mileage = 12;
        System.out.println("No of Airbags = " +ciaz.no_of_airbags+ " Mileage = " +ciaz.mileage );
    }
}

//name the file with the main method name 
// number of .class files = no. of classes in the file 
// objects offer modularity : cource code can be maintained independently, can be passed around in the system once created 
// info hiding, details of info of class/object hidden 
// code reuse easy, easy debugging, just need to replace or debug the object and not the code 

