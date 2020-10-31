Select the correct output of following code
Both classes are in same package.
class Vehicle{
    private Vehicle(){
        System.out.println("constructor of Vehicle");
    }
}

class Car {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
    }
}



Answer
c
Compile time Error
