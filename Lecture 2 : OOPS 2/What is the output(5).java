Both classes are in same package.
class Vehicle{
    void print(){
        System.out.print("Vehicle class");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.print("Car class");
    }

    public static void main(String[] args){   
        Car obj1 = new Car();
        obj1.print();
        Vehicle obj2 = new Vehicle();
        obj2.print();  
    }
}

Answer
Car classVehicle class
