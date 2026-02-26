class Propina {

    var consumo: Double = 0.0

    fun calcularPropina(): Double {
        return when {
            consumo < 500 -> consumo * 0.05
            consumo in 500.0..999.99 -> consumo * 0.10
            else -> consumo * 0.15
        }
    }

    fun totalConPropina(): Double {
        return consumo + calcularPropina()
    }
}
fun main() {
    val cuenta = Propina()
    cuenta.consumo = 800.0
    println(cuenta.calcularPropina())
    println(cuenta.totalConPropina())
}