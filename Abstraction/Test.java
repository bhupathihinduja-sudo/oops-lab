interface Device {
    void turnOn();
}

class Fan implements Device {
    public void turnOn() {
        System.out.println("Fan is ON");
    }
}

class Light implements Device {
    public void turnOn() {
        System.out.println("Light is ON");
    }
}

public class Test {
    public static void main(String[] args) {
        Device d = new Fan();
        d.turnOn();

        d = new Light();
        d.turnOn();
    }
}