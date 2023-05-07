public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    public void makeSound() {
        System.out.println("The dog barks");
    }
    
    public void printInfo() {
        super.printInfo();
        System.out.println("Breed: " + this.breed);
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        myDog.printInfo();
        myDog.makeSound();
    }
}
