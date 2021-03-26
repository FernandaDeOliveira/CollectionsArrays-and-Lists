package classes

fun main() {
    val nomes = Array(3){""}

    nomes[0] = "MAria"
    nomes[1] = "Joao"
    nomes[2] = "Pedro"

    println("print for")
    for(nome in nomes){
        println(nome)
    }

    println("print foreach com ordenação")
    nomes.sort()
    nomes.forEach { println(it) }

    print("outra forma de array")
    val nomes2 = arrayOf("maria", "joao", "pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }

}