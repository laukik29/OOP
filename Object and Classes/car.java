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