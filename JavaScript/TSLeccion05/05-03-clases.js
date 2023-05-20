// let persona3 = new Persona('Carla', 'Ponce') //Esto no se puede hacer

class Persona{ // Clase padre
    constructor(nombre, apellido){
        this._nombre = nombre
        this._apellido = apellido
    }

    get nombre(){
        return this._nombre
    }
    set nombre(nombre){
        this._nombre = nombre
    }

    get apellido(){
        return this._apellido
    }
    set apellido(apellido){
        this._apellido = apellido
    }

}

class Empleado extends Persona{ //clase hija

    constructor(nombre, apellido, departamento){
        super(nombre, apellido)
        this._departamento = departamento
    }
    get departamento(){
        return this._departamento
    }
    set departamento(departamento){
        this._departamento = departamento
    }
}

let persona1 = new Persona('Martín', 'Perez')
console.log(persona1.nombre)
persona1.nombre = 'Juan Carlos'
console.log(persona1.nombre)

let persona2 = new Persona('Carlos', 'Lara')
console.log(persona2.nombre)
persona2.nombre = 'María Laura'
console.log(persona2.nombre)

let empleado1 = new Empleado('María', 'Gimenez', 'Sistemas')
console.log(empleado1)
console.log(empleado1.nombre)


