class mymaruti {
    private int number_of_airbags;
    double mileage;

    public void setInfo(int n, double m) {
        this.number_of_airbags = n;
        this.mileage = mileage;
    }

    public int getInfo() {
        return number_of_airbags;
    }
}

class m4 {
    public static void main(String args[]) {
        
        mymaruti ciaz = new mymaruti();
        mymaruti baleno = new mymaruti();
        ciaz.setInfo(4, 12);
        System.out.println(ciaz.getInfo());
        baleno.setInfo(1, 14);
        System.out.println(baleno.getInfo());

    }
}