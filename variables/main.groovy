#!groovy

class Example {
  static void main(String[] args) {
    // x is defined as a variable
    String x = "Hello";

    // The value of the variable is printed to the console
    println(x);

    // Def a variable in lowercase
    int y = 5;

    // Def a variable in uppercase
    int Y = 6;

    // Def a variable with the underscore in it's name
    def _Name = "Joe";

    println(y);
    println(Y);
    println(_Name);

    println("The value of y is " + y + " The value of Y is " + Y);
  }
}
