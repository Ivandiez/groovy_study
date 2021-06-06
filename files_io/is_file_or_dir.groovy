#!groovy

import java.io.File

class Example {
  static void main(String[] args) {
    def file = new File('/home/ivan');
    println "File? ${file.isFile()}"
    println "Directory? ${file.isDirectory()}"
  }
}
