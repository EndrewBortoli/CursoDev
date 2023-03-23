fun main() {
    val precoPorKwh = 0.50 // preço por kWh em reais
    var consumoTotal = 0.0 // consumo total em kWh

    // solicita que o usuário insira as informações de cada aparelho elétrico
    print("Quantos aparelhos elétricos você quer inserir? ")
    val numAparelhos = readLine()!!.toInt()

    for (i in 1..numAparelhos) {
        print("Por favor, insira a potência do aparelho $i em Watts: ")
        val potencia = readLine()!!.toDouble()

        print("Por favor, insira a duração do uso diário do aparelho $i em horas: ")
        val tempo = readLine()!!.toDouble()

        // calcula o consumo de energia elétrica para o aparelho atual
        val energia = potencia * tempo / 1000.0 // converte de Watts para kWh

        // adiciona o consumo do aparelho atual ao consumo total
        consumoTotal += energia
    }

    // calcula o custo total em reais
    val custoTotal = consumoTotal * precoPorKwh

    // exibe o consumo total em kWh e o custo total em reais
    println("O consumo total de energia elétrica é de $consumoTotal kWh por dia.")
    println("O custo total é de R$ $custoTotal por dia.")
}