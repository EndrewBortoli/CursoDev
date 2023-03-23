fun main(){
    println("Favor digitar F ou M: ")
    //read line wait for you to write something, in this case, a number
    var S= readLine() ?.uppercase()

    println()

    if (S=="M"){
        println("Masculino")
    }
    else if(S=="F"){
        println("Feminino")
    }
    else{
        println("Sexo inválido")
    }
}