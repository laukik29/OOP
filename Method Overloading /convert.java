class honda {
    public void display (String color) {
        System.out.println("Color is " + color);
    }

    // public void display(int a)
    public void display(double a) {
        System.out.println("Mileage is " +a);
    }
}
public class convert {
    public static void main(String[] args) {
        //char a= 'A';
        honda city = new honda();
        city.display("Black");
        // city.display(17);
        city.display(17.5); 
        //so use double function
        //erorr as float passing to int 
        //city.display(True);
        // city.display(a);
    }

}