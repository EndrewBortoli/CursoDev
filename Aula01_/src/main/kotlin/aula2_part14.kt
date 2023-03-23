fun main(){
    println("Digite um número inteiro: ")
    //read line wait for you to write something, in this case, your name
    var x= readLine()!!.toInt()

    println()

    if(x % 2==0)
        print("$x é par")
    else
        println("$x é impar")
}