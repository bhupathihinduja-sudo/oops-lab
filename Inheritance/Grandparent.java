class Grandparent {
    void property() {
        System.out.println("Grandparent property");
    }
}

class Parent extends Grandparent {
    void house() {
        System.out.println("Parent house");
    }
}

class Child extends Parent {
    void car() {
        System.out.println("Child car");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.property();
        obj.house();
        obj.car();
    }
}