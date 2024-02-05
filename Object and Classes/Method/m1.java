class maruti3 {
    int number_of_airbags;

    // private int number_of_airbags; scpe is limited to class, cannot access thru obkects also, can access mileage as no access specifier mentioned 
    double mileage;


void display() {
    System.out.println("No. of airbags = "+number_of_airbags+ " Mileage = " +mileage );
    }
}

class m1 {
    public static void main(String args[]) {
        maruti3 ciaz = new maruti3();
        maruti3 baleno = new maruti3();
        ciaz.number_of_airbags = 2;
        ciaz.mileage = 12.5;
        baleno.number_of_airbags = 1;
        baleno.mileage = 14;
        
        //
        ciaz.display();
        baleno.display();
    }
}
