class Maruti {
    int number_of_airbags;
    double mileage;

    // Maruti(int number_of_airbags,double mileage) {
    //     number_of_airbags = number_of_airbags;
    //     mileage= mileage;
    //     System.out.println("number of airbags = " +number_of_airbags + " mileage");

    // }

    Maruti(int n,double m) {
        number_of_airbags = n;
        mileage = m;
        System.out.println("number of airbags = " +n + " Mileage = " +m);
    }
    void display() {
        System.out.println("number of airbags = " +number_of_airbags + " mileage = " +mileage);
    }
}

class m4 {
    public static void main(String[] args) {
        // ERR
        // Maruti ciaz= new Maruti();  
        // Maruti baleno = new Maruti();


        // correct
        Maruti ciaz = new Maruti(2,12.5);
        Maruti baleno = new Maruti(1,14);

        // ciaz.display(2,12.5);
        // baleno.display(1,14.5);

        ciaz.display();
        baleno.display();

    }
}