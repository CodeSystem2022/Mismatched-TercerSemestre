//while
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador ++;
}
console.log("Fin del ciclo while" + contador);

//do while
let conteo = 0;
do{
    console.log(conteo);
    conteo ++;
}while(conteo < 3);
console.log("Fin del ciclo do while" + conteo);

//for
for (let contando = 0; contando < 3 ; contando++ ){
    console.log(contando);
}
console.log("Fin del ciclo for" );

// Palabra reservada break
// Vamos a imprimir los numeros pares
for (let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0 ){
        console.log(contando);//Muestra los pares
        break;    
    }
}
console.log("Termina el ciclo al encontrar el primer numero par");

// Palabra reservada continue
//Etiquetas Labels nos permite ir a una parte del codigo
inicio:
for (let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0 ){ //Comparacion extricta para q se fije tb los tipos
        continue inicio;// va a continuar a la siguiente iteración
    }
    console.log(contando);
}
console.log("Termina el ciclo al encontrar el primer numero par");


