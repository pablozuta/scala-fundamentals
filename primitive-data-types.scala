
object Program {
    def main(args: Array[String]): Unit = {
        // val se usa para inmutables y var para mutables
        // hay 8 data types primitivos + Strings

        // strings
        val miString: String = "El rio ya habia perdido sus orillas"
        var miStringMutable: String = "Iba subiendo poco a poco por la calle real"
        println(miString)
        println(miStringMutable)
        println(miString.getClass)
        
        // booleans
        val isTrue: Boolean = true 
        val esFalso: Boolean = false
        println(isTrue)

        // NUMERICS
        
        // byte type (-128 to 127)
        val numeroPequeño: Byte = 3
        println(numeroPequeño)

        // Short type (32,768 to 32,767.)
        val numeroCorto: Short = 23133
        println(numeroCorto)

        // Int type (-2,147,483,648 to 2,147,483,647)
        val numeroInteger: Int = 3928414
        println(numeroInteger)

        // Long type (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.)
        val numeroGigante: Long = 4932583259151L
        println(numeroGigante)
        println(numeroGigante.getClass)

        // FLOATINGS
        val numeroFloat: Float = 3.12
        val numeroDouble: Double = 322.5251
        println(numeroFloat)
        println(numeroFloat.getClass)
        println(numeroDouble)
        println(numeroDouble.getClass)

        // CHARS
        val caracter: Char = 'a'
        println(caracter)
        println(caracter.getClass)

    }
}