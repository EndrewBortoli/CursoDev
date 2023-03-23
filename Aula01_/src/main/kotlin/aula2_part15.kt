fun main(){
    println("Digite uma letra: ")
    //read line wait for you to write something, in this case, a number
    var x= readLine() ?.uppercase()


    println()

    if( x== "a" || x=="e" || x=="i" || x=="o" || x=="u" )
        print("$x é vogal")
    else
        println("$x é consoante")
}