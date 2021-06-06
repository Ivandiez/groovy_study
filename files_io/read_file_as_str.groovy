#!groovy

import java.io.File

class Example {
  static void main(String[] args) {
    File file = new File("example.txt");
    println file.text;
  }
}
