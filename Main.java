class Main {
  public static void main(String[] args) {
    double x = Math.PI;
      printCircleArea(3, x);
      printCirclePerimeter(3, x);
  }
  public static double calculateCircleArea(float rad, double x) {
  return x * rad*rad;
  } 
  public static void printCircleArea(float radFromUser, double xFromUser) {
  double area = calculateCircleArea(radFromUser, xFromUser);
  System.out.println("A kör területe " + area + " négyzetcentiméter.");
  }
  public static double calculateCirclePerimeter(float rad, double x) {
  return 2*rad * x;
  }
  public static void printCirclePerimeter(float radFromUser, double xFromUser) {
  double perimeter = calculateCirclePerimeter(radFromUser, xFromUser);
  System.out.println("A kör kerülete " + perimeter + " négyzetcentiméter.");
  }
}