object Hello {
  def main(args: Array[String]): Unit = {
    
    // array de Integers
    val arrayDeIntegers: Array[Int] = Array(21, 43, 51, 87)
    println(arrayDeIntegers) // Output [I@2cce10bc
    println(arrayDeIntegers(1)) // Output 43
    println(arrayDeIntegers.mkString("-")) // Output 21-43-51-87
    println(arrayDeIntegers.mkString(", ")) // Output 21, 43, 51, 87

    // sin especificar data type
    val otroArrayIntegers = Array(32, 542, 1, 3)
    println(otroArrayIntegers(0)) // Output 32
    println(otroArrayIntegers.mkString(", ")) 
    val doublesMap = otroArrayIntegers.map(_ * 2)
    println("map method sobre el array de arriba " + doublesMap.mkString(", ")) 

    val arrayDeStrings = Array("a la hora", "en que me fui a asomar", "el rio", "ya habia", "perdido sus orillas")
    println(arrayDeStrings) // Output [Ljava.lang.String;@68360fb9
    println(arrayDeStrings(2)) //  Output el rio
    println(arrayDeStrings.mkString(" "))
  }
}