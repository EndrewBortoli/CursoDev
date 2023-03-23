fun main(){
    println("Digite um número inteiro: ")
    //read line wait for you to write something, in this case, your name
    var n1= readLine()!!.toInt()

    println()

    println("Digite outro número inteiro: ")
    var  n2= readLine()!!.toInt()

    if(n1>n2)
        print("$n1 é maior que $n2")
    else
        println("$n1 é menor que $n2")



}