import psycopg2 #Esto es para poder conectarnos a Postgre
# para instalar el psycopg2 desde terminal pip install psycopg2
# para instalar mysql pip install mysql-connector
conexion = psycopg2.connect(
    user='postgres',
    password='root',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:#este recurso with tambien cierra el cursor
            sentencia = 'INSERT INTO persona (nombre, apellido, email) VALUES (%s, %s, %s)'
            valores = (
                ('Carlos', 'Lara', 'clara@mail.com'),
                ('Marcos', 'Canto', 'mcanto@mail.com'),
                ('Marcelo', 'Cuenca', 'mcuenca@mail.com')
            )#Es una tupla de tuplas
            cursor.executemany(sentencia, valores)
            # conexion.commit() #esto se usa para guardar datos en la base, pero no lo vamos a utilizar ya que el with ya lo tiene incorporado
            registros_insertados = cursor.rowcount # Para saber cuantos registros se agregaron
            print(f'La cantidad de registros agregados es de: {registros_insertados}')

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()