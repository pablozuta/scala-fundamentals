import java.io.PrintWriter

object Main extends App {
    val myString = "Por las noches, aquel mundo desbocado se calmaba"

    new PrintWriter("output.txt") {write(myString); close()}
}