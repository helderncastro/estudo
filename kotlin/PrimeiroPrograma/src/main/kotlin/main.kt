fun main() {
    exInWhen(1.0)
    exLoopFor()
}

fun exInWhen(saldo:Double) {
    when {
        saldo > 0.0 ->  println(" Positivo")
        saldo == 0.0 -> println(" Neutro")
        saldo < 0.0 -> println(" Negativo!")

    }
    if (saldo > 0.0) {
        println("Conta positiva")
    }

}

fun exLoopFor() {

    for (i in 1..3) {
        println(i)
    }
}