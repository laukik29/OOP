class honda {
    public void display (String color) {
        System.out.println("Color is " + color);
    }

    public void display(String model, String type) {
        System.out.println("Model is " +model + " Type is " +type);
    }
}
    public class nos {
        public static void main(String[] args) {
            honda city= new honda();
            city.display("Radiant_Red_Metallic");
            city.display("Amaze","Diesel");
        }
    }
