package classes

fun main() {
    val values = IntArray(5)
    //ta inicializando cada valor de um array de tam 5
    values[0] = 1
    values[1] = 9
    values[2] = 5
    values[3] = 2
    values[4] = 7

    // valor é cada variavel na iteraçao(loop do for) dentro do array
    for(valor in values){
        //enquanto existir
        println(valor)
    }

    //outra forma de for
    values.forEach{
        println(it) // it faz o papel da variavel valor
    }

    println("imprime pela posicao")
    for (index in values.indices){
        //loop pelo indice do array
            // recupera o valor da posição especifica
        println(values[index]) // imprime o valor
    }

    println("imprime colocando do > para o <")
    values.sort()
    for(valor in values){
        //enquanto existir
        println(valor)
    }
}