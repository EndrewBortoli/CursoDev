package Aula3

fun main(){
    print("Digite sua altura (em metros): ")
        val altura= readLine()!!.toFloat()

    print("Digite seu peso (em Kg): ")
        val peso= readLine()!!.toFloat()

    print("Digite seu sexo, Maculino ou Feminino (M ou F): ")
        var s= readLine()!!.uppercase()

        val imc= (peso)/(altura*altura)
        println("IMC: %,.2f".format(imc))

    if (s=="F"){

        if (imc<18.5){
            print("Abaixo do peso ideal")
        }

        if(imc>18.5 && imc<24.9){
            print("Peso normal")
        }

        if (imc>25 && imc<29.99 ){
            print("Sobrepeso")
        }

        if (imc>30 && imc<45 ){
            print("Obeso")
        }
    }
        if (s=="M"){
            if (imc<18.5){
                print("Abaixo do peso ideal")
            }

            if(imc>18.5 && imc<24.9){
                print("Peso normal")
            }

            if (imc>25 && imc<29.99 ){
                print("Sobrepeso")
            }

            if (imc>30 && imc<45 ){
                print("Obeso")
            }
        }

}

