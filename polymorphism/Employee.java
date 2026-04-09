class Worker {
    void salary() {
        System.out.println("Basic salary");
    }
}

class Manager extends Worker {
    void salary() {
        System.out.println("Manager salary with bonus");
    }
}

public class Employee {
    public static void main(String[] args) {
        Worker e = new Manager();
        e.salary();
    }
}