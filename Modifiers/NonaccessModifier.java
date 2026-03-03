abstract class NonaccessModifier {

    final int x = 100;
    static int y = 50;

    abstract void display();

    static void showStatic() {
        System.out.println("This is a static method");
    }
}

class Test extends NonaccessModifier {

    void display() {
        System.out.println("Abstract method implemented");
    }

    public static void main(String[] args) {

        Test obj = new Test();

        System.out.println("Final variable: " + obj.x);
        System.out.println("Static variable: " + y);

        obj.display();
        showStatic();
    }
}