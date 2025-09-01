public class Association {
    public static void main(String[] args) {
        System.out.println("Hello!");

        Engine altoEngine = new Engine("petrol", 4, 200);
        FuelCar alto = new FuelCar(4, 600000, 20, 5, "Suzuki", "Grey", 4, 30, altoEngine);

        Factory altoFactory = new Factory();
//        FuelCar alto =

        alto.monthlyBill(100);
        alto.monthlyBill(100.01f);
        alto.monthlyBill(100, "January");
        alto.monthlyBill("January", 100);

        System.out.println("Alto Description-");
        alto.describe();
    }
}

class Machine {
}

class Vehicle extends Machine {
    int numberOfWheels;
    int cost;
    int mileage;
    int seats;

    public Vehicle(int numberOfWheels, int cost, int mileage, int seats) {
        this.numberOfWheels = numberOfWheels;
        this.cost = cost;
        this.mileage = mileage;
        this.seats = seats;
    }
}

class Engine extends Machine {
    String type;
    int numOfCylinders;
    int hp;

    public Engine(String type, int numOfCylinders, int hp) {
        this.type = type;
        this.numOfCylinders = numOfCylinders;
        this.hp = hp;
    }
}

class Car extends Vehicle {
    String brand;
    String colour;
    int numberOfSeats;

    public Car(int numberOfWheels, int cost, int mileage, int seats, String brand, String colour, int numberOfSeats) {
        super(numberOfWheels, cost, mileage, seats);
        this.brand = brand;
        this.colour = colour;
        this.numberOfSeats = numberOfSeats;
    }
}

class FuelCar extends Car {
    int fuelCapacity;
    Engine engine;

    public FuelCar(int numberOfWheels, int cost, int mileage, int seats, String brand, String colour, int numberOfSeats, int fuelCapacity, Engine engine) {
        super(numberOfWheels, cost, mileage, seats, brand, colour, numberOfSeats);
        this.fuelCapacity = fuelCapacity;
        this.engine = engine;
    }

    public void monthlyBill (float distanceRun) {
        System.out.println("Monthly Bill: " + distanceRun / mileage * 105);
    }
    public void monthlyBill (int distanceRun) {
        System.out.println("Monthly Bill: " + distanceRun / mileage * 105);
    }
    public void monthlyBill (int distanceRun, String month) {
        System.out.println("Monthly Bill for the month of " + month + " is : " + distanceRun / mileage * 105);
    }
    public void monthlyBill (String month, int distanceRun) {
        System.out.println("The bill was " + distanceRun / mileage * 105 + "for the month of " + month);
    }

    public void describe() {
        System.out.println("The car is " + brand + ". It has " + numberOfSeats + " seats and gives a mileage of " + mileage + ".");
    }
}

class ElectricCar extends Car {
    int batteryWattage;

    public ElectricCar(int numberOfWheels, int cost, int mileage, int seats, String brand, String colour, int numberOfSeats, int batteryWattage) {
        super(numberOfWheels, cost, mileage, seats, brand, colour, numberOfSeats);
        this.batteryWattage = batteryWattage;
    }

    int monthlyBill (int distanceRun) {
        return distanceRun / mileage * 6;
    }
}

class Factory {
    Car produceCar (String type, int numberOfWheels, int cost, int mileage, int seats, String brand, String colour, int numberOfSeats, int fuelCapacity, Engine engine, int batteryWattage) {
        if(type == "Fuel") {
            return new FuelCar(numberOfWheels, cost, mileage, seats, brand, colour, numberOfSeats, fuelCapacity, engine);
        } else if(type == "Electric") {
            return new ElectricCar(numberOfWheels, cost, mileage, seats, brand, colour, numberOfSeats, batteryWattage);
        }
        else {
            System.out.println("No such type available");
            return null;
        }
    }

    int productionCost (String type) {
        if(type == "Fuel") {
            return 1000000;
        } else {
            return 2000000;
        }
    }
}

class Metal {
    String element;

    public Metal(String element) {
        this.element = element;
    }
}
