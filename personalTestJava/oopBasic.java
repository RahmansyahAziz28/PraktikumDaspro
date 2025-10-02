package personalTestJava;
//basic oop
class Car {
    private String brand;
    private String colour;
    private int year;

    public Car(String brand, String colour, int year){
        this.brand = brand;
        this.colour = colour;
        this.year = year;
    }

    public void info(){
        System.out.println("Brand: " + brand + ", Colour: " + colour + ", Year: " + year);
    }
}

//inheritance oop
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Motorcycle extends Vehicle {
    public void ride() {
        System.out.println("Riding the motorcycle...");
    }
}

//abstraction oop
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound(){
        System.out.println("Woof");
    }
}
    

public class oopBasic {
    public static void main(String[] args) {
        //simply it's the import
        Car get = new Car("toyota", "red", 2023);
        Dog myDog = new Dog();
        Motorcycle myBike = new Motorcycle();


        //simply it's how we call the function
        get.info();

        myBike.start();
        myBike.ride();

        myDog.sound();
    }
}