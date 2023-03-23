fun main(){

    print("Digitar o primeiro número: ")
    var num1 = readLine()!!.toInt()

    println()

    print("Digitar o segundo número: ")
    var num2 = readLine()!!.toInt()

    println()

    print("Digitar o terceiro número: ")
    var num3 = readLine()!!.toInt()

    println()

    var a: Int
    var b: Int
    var c: Int

    if(num1 > num2 && num2 > num3){
        a = num1
        b = num2
        c = num3}
    else
        if(num1 > num3 && num3 > num2){
            a = num1
            b = num3
            c = num2}
        else
            if(num2 > num1 && num1 > num3){
                a = num2
                b = num1
                c = num3}
            else
                if(num2 > num3 && num3 > num1){
                    a = num2
                    b = num3
                    c = num1}
                else
                    if(num3 > num1 && num1 > num2){
                        a = num3
                        b = num1
                        c = num2}
                    else{
                        a = num3
                        b = num2
                        c = num1
                    }

    println("Números na ordem crescente: $c - $b - $a")

    println()

    println("Números na ordem decrescente: $a - $b - $c")
}