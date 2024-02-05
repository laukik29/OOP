class maruti1 {
    int number_of_airbags; 
    double mileage;
}

class class2 {
    public static void main(String args[]) {
        maruti1 baleno = new maruti1();
        maruti1 ciaz = new maruti1();
        ciaz.number_of_airbags = 2;
        ciaz.mileage = 12;
        baleno.number_of_airbags =4;
        baleno.mileage = 16;
        System.out.println("Ciaz No of Airbags = " +ciaz.number_of_airbags+ " Mileage = " +ciaz.mileage );
        System.out.println("Baleno No of Airbags = " +baleno.number_of_airbags+ " Mileage = " +baleno.mileage );
    }
}