Select the correct output of following code
Both classes are in same package.
class Vehicle{
    String color;
    private int id;
}

class Car {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.color = "white";
        v.id = 101;
        System.out.println(v.color + " " + v.id);
    }
}


Answer
b
Compilation Erro
