fun main(){

    converterAnos(40)
}
fun converterAnos(anos: Int){
    println("$anos anos equivalem a:")
    println()
    println("${anos*12} meses")
    println("${anos*365} dias")
    println("${anos*365*24} horas")
    println("${anos*365*24*60} minutos")
    println("${anos*365*24*60*60} segundos")
}