fun main(){
    println("Digite uma letra: ")
    //read line wait for you to write something, in this case, a number
    var x= readLine() 


    println()

    if(x in arrayOf("a","e","i","o","u"))
        println("$x é vogal")
    else
        println("$x é consoante")
}