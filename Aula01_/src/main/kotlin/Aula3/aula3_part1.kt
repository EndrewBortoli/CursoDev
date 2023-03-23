package Aula3

fun main(){
    val text= "Endrew Ryan de Oliveira"

    println(text)

    println(text.plus(" Bortoli"))//adiciona um texto no final de outro texto

    println(text.get(4))//Pega a posição do texto, a contagem começa com 0

    println(text.reversed()) //Escreva de trás para frente

    println(text.substring(15,23)) //Pegar uma parte do texto com o intervalo

    println(text.length) //Tamanho do texto

    println(text.first()) //Primeira letra do texto

    println(text.last()) //Ultima letra do texto

    println(text.toUpperCase()) //Deixa em maiusculo

    println(text.toLowerCase()) //Deixa em minusculo
}