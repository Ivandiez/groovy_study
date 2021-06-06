#!groovy

class Example {
  static void sum(int a, int b = 5) {
    int c = a+b;
    println(c);
  }

  static void main(String[] args) {
    println("The value of sum with default parameter is: ");
    sum(6);    
    println("The value of sum with override parameter is: ");
    sum(6,3);
  }
}
