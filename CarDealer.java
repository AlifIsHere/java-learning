public class CarDealer {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2021, 25000.00);
        Car car2 = new Car("Honda", "Accord", 2022, 28000.00);

        System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + ", " + car1.getYear() + ", $" + car1.getPrice());
        System.out.println("Car 2: " + car2.getMake() + " " + car2.getModel() + ", " + car2.getYear() + ", $" + car2.getPrice());
    }
}