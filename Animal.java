public class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
    
    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}