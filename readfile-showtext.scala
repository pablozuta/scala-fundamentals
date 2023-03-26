import scala.io.Source

object Main extends App {
  // leer el contenido del archivo y guardarlo en una variable
  val fileContent = Source.fromFile("output.txt").mkString

  // mostrar el contenido por la consola
  println(fileContent)
}