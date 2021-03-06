#!groovy

class Example {
  static void main(String[] args) {
    // Initializing a local variable
    int a = 2

    // Evaluating the expression value
    switch(a) {
      // The case statement defained for 4 cases
      // Each case section has a break condition to exit the loop
      case 1:
        println("The value of a is One");
        break;
      case 2:
        println("The value of a is Two");
        break;
      case 3:
        println("The value of a is Three");
        break;
      case 4:
        println("The value of a is Four");
        break;
      default:
        println("The value is unknown");
        break;
    }
  }
}
