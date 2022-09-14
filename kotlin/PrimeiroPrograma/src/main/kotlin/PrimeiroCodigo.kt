fun main(args: Array<String>) {

    val nome = "Helder"             // Valor - estado não pode ser alterado
    var nome1:String = "Helder"     // Variavél - pode ser alterado

    println("Hello $nome olhe o dollar \$!")
    println("Resultado maior ${max(15,13)} ... ")

}

fun max(a:Int, b:Int) : Int {
    return if (a > b) a else b
}
