#!groovy

import java.io.File

class Example {
  static void main(String[] args) {
    def file = new File('/home/ivan/groovy_study/files_io/directory');
    file.delete()
    println "Directory? ${file.isDirectory()}"
  }
}
