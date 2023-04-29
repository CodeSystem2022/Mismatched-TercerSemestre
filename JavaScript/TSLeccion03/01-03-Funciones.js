miFuncion(8, 2);//Esto se lo conoce como hosting

function miFuncion(a, b){
    //console.log("Sumamos: "+(a + b) );
    return a + b
}

//Llamamos a la funcion
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado);

//Declaramos una funcion de tipo expresión o anonima
let x = function(a, b){ return a + b};
resultado = x(5, 6); //Al llamar se pone la variable y parentesis
console.log(resultado);

//Funciones de tipo self e invoking, tambien es una funcion anonima
//se esta llamando asi misma, no se puede reutilizar
//Puede ser util cuando se mande a llamar una funcion así misma
(function(a, b){
    console.log('Ejecutando la funcion: '+ (a + b));
})(9, 6);

console.log(typeof miFuncion);
function miFuncionDos(a, b){
    console.log(arguments);
    console.log(arguments.length);
}

miFuncionDos(5, 7, 3, 6);

//toString
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);

//Funciones flecha
//al utilizar const ya no va a cambiar la referencia o el valor trabajado
//se puede omitir la palabra function por ser funcion flecha
const sumarFuncionFlecha = (a, b) => a + b;//=> esto se hace para hacer el cuerpo de la funcion
resultado = sumarFuncionFlecha(3, 7);//Asignamos el valor a una variable
console.log(resultado);

//Las variables q van a recibir una funcion se los llama parametros
//Los valores q se utilizan para llamar una funcion

//La propiedad de argument es un array, es para poder acceder a los dif valores de los parametros 
//FUNCION TIPO EXPRESION
let sumar = function(a = 4, b = 8){
    console.log(arguments[0]); //muestra el parametro de a:
    console.log(arguments[1]);//muestra el parametro de b:
    console.log(arguments[2]);// muestra el parametro de 
    return a + b + arguments[2];
};
//EN JAVASCRIPT NO ES REQUERIDO QUE COINCIDA LA CANTIDAD DE ARGUMENTOS CON LA CANTIDAD DE PARAMETROS
resultado = sumar(3, 2, 9);//Argumentos
console.log(resultado);

//Podemos llamar a la funcion y despues definirla, haciendo hoisting
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i]; //Arguments es para arreglos
    }
    return suma;
}

//Paso por valor, cuando usamos tipos q no son objetos, como tipos numericos o booleanos
//Tipos PRIMITIVOS
let k = 10;
function cambiarValor(a){ //PASO POR VALOR, la variable k no sufre ningun cambio, la variable solo paso una copia
    a = 20;
}
cambiarValor(k);
console.log(k);

//Paso por referencia,vamos a crear un objeto por q a un objeto se le puede asociar propiedades y metodos
const persona = {
    nombre:'Juan',
    apellido: 'Lepez'
}
console.log(persona);
//La variable persona almacena una referencia hacia un objeto
function cambiarValorObjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}

cambiarValorObjeto(persona);//Paso por referencia
console.log(persona);