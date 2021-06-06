#!groovy

import java.io.File

class Example {
  static void main(String[] args) {
    def src = new File('/home/ivan/groovy_study/files_io/example.txt');
    def dst = new File('/home/ivan/groovy_study/files_io/example1.txt');
    dst << src.text
    println dst.text
  }
}
