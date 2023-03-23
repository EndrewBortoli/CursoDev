fun main(){
    print("Digite o primeiro número:")
    val n1= readln().toInt()
    println()
    print("Digite o segundo número:")
    val n2= readln().toInt()
    println()
    print("Digite o terceiro número")
    val n3= readln().toInt()

    println()

    val numbers = listOf(n1,n2,n3)
    val sortedNumbers = numbers.sorted()
    println("Números em ordem crescente $sortedNumbers")

    val numeros = listOf(n1,n2,n3)
    val sortedNumeros = numeros.sortedDescending()
    println("Números em ordem descrescente $sortedNumeros")

}