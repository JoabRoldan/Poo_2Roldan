class Comparador {

    var numero1: Int = 0
    var numero2: Int = 0

    fun comparar(): String {
        return when {
            numero1 > numero2 -> "El número mayor es $numero1"
            numero2 > numero1 -> "El número mayor es $numero2"
            else -> "Son iguales"
        }
    }
}
fun main() {
    val comp = Comparador()
    comp.numero1 = 10
    comp.numero2 = 10
    println(comp.comparar()) // Son iguales
}