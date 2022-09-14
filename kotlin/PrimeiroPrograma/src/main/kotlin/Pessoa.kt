class Pessoa (
    val nome : String,
    val idade : Int
)

fun main() {
    val pessoa1: Pessoa = Pessoa("Helder",40)
    println("Pessoa 1: ${pessoa1.nome}")

}