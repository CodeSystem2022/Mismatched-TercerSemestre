let x = 10;
console.log(x.length);

let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    nombreCompleto: function(){//método o función en JavaScript
        return this.nombre+' '+this.apellido;//this apunta al objeto que se esta trabajando en este momento
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