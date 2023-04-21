from NumerosIgualesException import NumerosIgualesException

resultado = None

try:
    a = int(input('Digite el primer numero: '))
    b = int(input('Digite el segundo numero: '))
    if a == b:
        raise NumerosIgualesException('Son iguales')
    resultado = a / b
except Exception as err:
    print(f'Ocurrio un error: {err}')
else:
    print('No se arrojo nunguna excepcion')
# finally: #Siempre se ejecuta
#     print('Ejecucion de bloque finally')
print(f'El resultado es: {resultado}')
