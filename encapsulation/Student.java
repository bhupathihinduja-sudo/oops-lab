class Studentmark {
    private int marks;

    public void setMarks(int m) {
        marks = m;
    }

    public int getMarks() {
        return marks;
    }
}

public class Student {
    public static void main(String[] args) {
        Studentmark s = new Studentmark();
        s.setMarks(90);

        System.out.println(s.getMarks());
    }
}
