package Aula3

import kotlin.math.truncate

fun main(){
    do {
        println("Informe o valor da gasolina: ")
        val gasolina= readLine()!!.toDouble()

        println("Informe o valor do etanol: ")
        val etanol= readLine()!!.toDouble()

        var divisao= (etanol/gasolina).toDouble()

        divisao= truncate(divisao*100)
        println(divisao)

        if (divisao> 70.00.toDouble()){
            println("Colocar gasolina!")
        }
        if (divisao <70.00.toDouble()){
            println("Colocar etanol")
        }
        if (divisao == 70.00.toDouble()){
            println("Tanto faz abastecer com Gasolina ou Etanol")
        }

        println("Deseja realizar o calcúlo novamente (S/N)? ")
        val repetir=  readLine()!!.uppercase()



    }while (repetir == "S" )

    println("Até logo")




}