let x = 10;
console.log(x.length);

let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    idioma: 'ES',
    nombreCompleto: function(){//método o función en JavaScript
        return this.nombre+' '+this.apellido;//this apunta al objeto que se esta trabajando en este momento
        
    },
    get lang(){
        return this.idioma.toUpperCase(); // Convierte minusculas a mayusculas
    },
    set lang(Lang){
        this.idioma = Lang.toUpperCase();
    },
    get nombreEdad(){
        return 'El nombre es: ' + this.nombre + ', Edad: ' + this.edad;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());//recordar q con los parentesis obtenemos el espacio de memoria q es un metodo

let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '54926182821';
console.log(persona2.nombre);
console.log(persona2.direccion);
console.log(persona2.telefono);//console.log(persona2.teléfono);no funcionaria xq es case sensitive
console.log('Creamos un nuevo objeto');
console.log(persona['apellido']); //Accedemos al objeto como si fuera un arreglo

console.log('Usamos el ciclo for in')
//for in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('Cambiamos y corregimos un error');
//Trabajamos con el objeto persona
//persona.apellido = 'Betancud';//cambiamos dinamicamente un valor del objeto
persona.apellida = 'Betancud';
delete persona.apellida; // Eliminamos el error o el atributo del objeto
console.log(persona);

console.log('Distinta forma de imprimir un objeto: forma 1')

//Distinta formas de imprimir un objeto
//Num 1: la más sencilla, concatenar cada valor de cada propiedad
console.log(persona.nombre+', '+persona.apellido);

console.log('Distinta forma de imprimir un objeto: forma 2')
//Num 2: A través del ciclo for in
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}
console.log('Distinta forma de imprimir un objeto: forma 3')
//Num 3: La funcion Object.values() este método regresa nuestro objeto como un arreglo
let personaArray = Object.values(persona);
console.log(personaArray);

console.log('Distinta forma de imprimir un objeto: forma 4')
//Num 4: Utilizaremos el método JSON.stringify
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log('Comenzamos a utilizar el metodo get')
console.log(persona.nombreEdad);

console.log('Comenzamos con el metodo get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, email){ // Constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre + ' ' + this.apellido;
    }
}

let padre = new Persona3('Leo', 'Lopez', 'lopezl@gmail.com');
padre.nombre = 'Luis' // Modificamos el nombre
padre.telefono = '5492604672681'; // Una propiedad exclusiva del objeto padre
console.log(padre)
console.log(padre.nombreCompleto()); // Utilizamos la funcion

let madre = new Persona3('Laura', 'Contrera', 'contreral@gmail.com');
console.log(madre);
console.log(madre.telefono); // La propiedad no esta definida
console.log(madre.nombreCompleto());

// Diferentes formas de crear objetos

// caso numero 1
let miObjeto = new Object(); // Esta opcion es formal
// caso numero 2
let miObjeto2 = {}; // Esta opcion es breve y recomendada

// caso String 1
let miCadena1= new String('Hola');
// caso String 2
let miCadena2 = 'Hola'; // Esta es la sintaxis simplificada y recomendada

// caso con numeros 1
let miNumero = new Numer(1); // Es formal pero no recomendable
// caso con numeros 2
let miNumero2 = 1; // Sintaxis recomendada

// caso boolean 1
let miBoolean1 = new Boolean(false); // Formal
// caso boolean 2
let miBoolean2 = false; // Sintaxis recomendada

// caso Arreglos 1
let miArreglo1 = new Array();
// caso Arreglos 2
let miArreglo2 = [];

// caso function 1
let miFuncion1 = new function(){};
// caso function 2
let miFuncion2 = function(){}; // Notacion simplificada y recomendada

// Uso de prototype
Persona3.prototype.telefono = '5492604677160';
console.log(padre);
console.log(madre.telefono);
madre.telefono = '5492604512555';
console.log(madre.telefono);

// Uso de call
let persona4 ={
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo + ' ' + this.nombre + ' ' + this.apellido + ' ' + telefono;
        //return this.nombre + ' ' + this.apellido;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.', '542604672681'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '5492604672681'));


// Metodo Apply
let arreglo = ['Ing.', '545214050231'];
console.log(persona4.nombreCompleto2.apply(persona5,arreglo));