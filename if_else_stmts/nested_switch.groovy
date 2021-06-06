#!groovy

class Example {
  static void main(String[] args) {
    // Initializing 2 vars i and j
    int i = 0;
    int j = 1;

    // First evaluating the value of var i
    switch(i){
      case 0:
        // Next evaluating the value of var j
        switch(j) {
          case 0:
            println("i is 0, j is 0");
            break;
          case 1:
            println("i is 0, j is 1");
            break;

          // The default condition for the inner switch statement
          default:
            println("nested default case!!");
        }
        break;

      // The default condition for the outer switch statement
      default:
        println("No matching case found!");
    }
  }
}
