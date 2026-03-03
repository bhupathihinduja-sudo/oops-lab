class Shape {
    void display() {
        System.out.println("This is shape");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing circle");
    }
}

class Square extends Shape {
    void drawSquare() {
        System.out.println("Drawing square");
    }
}

class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.drawCircle();

        Square s = new Square();
        s.display();
        s.drawSquare();
    }
}