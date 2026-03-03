public class Constructor3 {
  int modelYear;
  String modelName;

  public Constructor3(int year, String name) {
    this.modelYear = year;
    this.modelName = name;
  }

  public static void main(String[] args) {
    Constructor3 myCar = new Constructor3(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}