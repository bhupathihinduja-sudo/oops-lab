class Area {
    int calculate(int side) {
        return side * side; // square
    }

    int calculate(int length, int breadth) {
        return length * breadth; // rectangle
    }
}

public class Test {
    public static void main(String[] args) {
        Area a = new Area();

        System.out.println(a.calculate(5));
        System.out.println(a.calculate(4, 6));
    }
}