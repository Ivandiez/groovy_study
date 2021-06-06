#!groovy

import java.io.File

class Example {
  static void main(String[] args) {
    new File("/home/ivan/groovy_study/").eachFileRecurse() {
      file -> println file.getAbsolutePath()
    }
  }
}
