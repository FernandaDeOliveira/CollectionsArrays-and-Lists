package classes

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 200.00
    salarios[2] = 5000.00

    salarios.forEach { println(it) }

    print("alterando valor do salario do index a cada loop")
    // consigo alterar o valor do index
    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    print("outra forma de array")
    val salarios2 = doubleArrayOf(3000.0, 500.00,2500.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}