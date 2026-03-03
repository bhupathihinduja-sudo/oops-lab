public class AccessModifier {

    private int a = 10;       // private variable
    int b = 20;               // default variable
    protected int c = 30;     // protected variable
    public int d = 40;        // public variable

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();

        System.out.println("Private: " + obj.a);
        System.out.println("Default: " + obj.b);
        System.out.println("Protected: " + obj.c);
        System.out.println("Public: " + obj.d);
    }
}