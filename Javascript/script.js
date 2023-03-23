function olaMundo() {
    alert("OLÁ MUNDO")
}

function operadores(){
    let vnumero1 = parseInt(prompt("Digite o primeiro número"));
    let vnumero2 = parseInt(prompt("Digite o segundo número"));
    var janelaPopup = window.open("", "popup", "width=400, height=300");

    janelaPopup.document.write(`<h1>
        Número 1 = ${vnumero1} <br>
        Número 2 = ${vnumero2} <br><br>
        A soma = ${vnumero1 + vnumero2}<br>
        A subtração = ${vnumero1 - vnumero2}<br>
        A multiplicação = ${vnumero1 * vnumero2}<br>
        A divisão = ${vnumero1 / vnumero2}<br>
        O módulo = ${vnumero1 % vnumero2}<br>
      </h1>`);
}
      

function aprovado() {
    var vnumero1 = parseInt(prompt("Digite NOTA 1:"));
    var vnumero2 = parseInt(prompt("Digite NOTA 2:"));
    var vnumero3 = parseInt(prompt("Digite NOTA 3:"));

    const media = (vnumero1 + vnumero2 + vnumero3) / 3;
    var janelaPopup = window.open("", "popup", "width= 700, height=400");

    if (media > 7) {
        janelaPopup.document
            .write(`<h1>Para ser APROVADO, a média deveria ser > 7 <br>
            
            Nota 1 = ${vnumero1}<br>
            Nota 2 = ${vnumero2}<br>
            Nota 3 = ${vnumero3}<br>
            A média é: ${media.toFixed(2)} <br><br>
            APROVADO </h1>`)
            

    } else {
        janelaPopup.document
          .write(`<h1>Para ser APROVADO, a média deveria ser > 7 <br>
            
            Nota 1 = ${vnumero1}<br>
            Nota 2 = ${vnumero2}<br>
            Nota 3 = ${vnumero3}<br>
            A média é: ${media.toFixed(2)} <br><br>
            REPROVADO </h1>`);
    }


}


function comparacao() {
  let numero1 = prompt("Digiteo o número 1:");
  let numero2 = prompt("Digite o número 2:");

  var janelaPopup = window.open("", "popup", "width= 700, height=400");

  if (numero1 > numero2) {
      janelaPopup.document
          .write(`<h1>O maior número é: ${numero1}<br>
            
            Número 1 = ${numero1}<br>
            Número 2 = ${numero2}<br>
             </h1>`);
  } else if (numero2 > numero1) {
      janelaPopup.document
          .write(`<h1>O maior número é: ${numero2}<br>
            
            Número 1 = ${numero1}<br>
            Número 2 = ${numero2}<br>
             </h1>`);
  } else {
      janelaPopup.document
          .write(`<h1>Os dois números são iguais<br>
            
            Número 1 = ${numero1}<br>
            Número 2 = ${numero2}<br>
             </h1>`);
  }
}

    


function parouimpar() {
  let vnum = prompt("Digite um número:");
  
  var janelaPopup = window.open("", "popup", "width= 700, height=400");

  if (vnum % 2 == 0) {
      janelaPopup.document.write(`<h1>${vnum} é par<br> </h1>`);
      
  } else {
    janelaPopup.document.write(`<h1>${vnum} é impar<br>
             </h1>`);
    } 
}


function consoanteavogal() {
    let letra = prompt("Digite uma Letra").toUpperCase();

  var janelaPopup = window.open("", "popup", "width= 700, height=400");

    if (letra == "A" ||
        letra == "E" ||
        letra == "I" ||
        letra == "O" ||
        letra == "U") {
      janelaPopup.document
          .write(`<h1>Essa letra é Vogal<br> </h1>`);
  } else {
      janelaPopup.document
          .write(`<h1>Essa letra é Consoante<br>
             </h1>`);
  }
}

function crescentedecresente() {
    
     let num1 = prompt("Digite o primeiro número:");
     let num2 = prompt("Digite o segundo número:");
     let num3 = prompt("Digite o terceiro número:");
     let nums = [num1, num2, num3];

    var janelaPopup = window.open("", "popup", "width= 400, height= 300")

    // ordena em ordem crescente
    num.sort(function (a, b) {
        return a - b;
    }); 
    janelaPopup.document.write(`<h1>Ordem cresente: ${nums} </h1>`);
    // ordem em ordem decrescente
    num.sort(function (a, b) {
        return b - a;
    });
    janelaPopup.document.write(`<h1>Ordem descrescente: ${nums}</h1>`);

}


function 