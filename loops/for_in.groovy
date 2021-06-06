#!groovy

class Example {
  static void main(String[] args) {
    int[] array = [0,1,2,3,4];

    for(int i in array) {
      println(i);
    }

    println();

    for(int j in 1..4) {
      println(j);
    }

    println();

    def employee = ["Ken" : 21, "John" : 25, "Sally" : 22];

    for(emp in employee) {
      println(emp);
    }
  }
}
