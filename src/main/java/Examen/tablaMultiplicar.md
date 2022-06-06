# Examen 1 traducido a JAVA
## ¿Qué se evalúa?
Se evaluará cada uno de los CE del RA1 y RA3 (Los criterios de evaluación están al comiendo de la unidad 1 y 2)
> **RA1**: *Conoce la estructura de un programa informático, identificando y relacionando los elementos propios del lenguaje de programación utilizado.*

> **RA3**: *Escribe y depura código, analizando y utilizando las estructuras de control del lenguaje.*

Los contenidos que abordaremos durante el ejercicio:
- Creación de un proyecto, haciendo uso del IDE.
- Usar distintos tipos de variables, constantes y literales
- Hacer uso de expresiones y operadores según los tipos del lenguaje, haciendo uso de las conversiones.
- Comentar el código.
- Uso de estructuras de repetición y selección
- Uso de control de excepciones
- Depurar y comentar código.
---
## Descripción del examen: Tabla de multiplicar
El *CEIP Profesor Juan Carlos Aragón* está probando un nuevo método para enseñar las tablas de multiplicar al alumnado. Ha solicitado ayuda al *IES Rafael Alberti* para que desarrolle una aplicación que cumpla con los siguientes requisitos:

El método se basa en la técnica divide y vencerás, y consiste en dividir el esfuerzo, poniendo el foco, durante un intervalo de tiempo, en un conjunto de tablas.
La división del esfuerzo se realiza de la siguiente forma:

| Por edades  |  ¿Que tablas estudian el alumnado? |  Tablas de los meses pares | Tablas de los meses impares
|---|---|---|---|
|  Mayores de 10 años hasta 12 incluido | Tablas del 11 hasta el 13  | 11,12,13 | 11,12,13 | 
|  Mayores de 8 años hasta los 10 incluidos | Tablas del 6 hasta el 10  | 6,8,10 | 7,9 |
|  Mayores o iguales a 6 hasta los 8 incluidos | Tablas del 1 hasta el 5  | 2, 4 | 1, 3, 5 |

Por tanto, para la entrada `8, 12`, el programa mostrará la siguiente salida:
~~~
*********************************************************************************
PROGRAMA DE GENERACIÓN DE TABLAS: <NOMBRE DEL ALUMNO>
̣̣̣_________________________________________________________________________________
Edad: 8. El alumno está dentro del rango [6-8]
Mes: 12. El mes es par, corresponden las tablas siguientes: {2,4}
̣̣̣_________________________________________________________________________________

TABLA DEL 2
***********
2 x 1 = 2
2 x 2 = 4
...
2 x 10 = 20

TABLA DEL 4
***********
4 x 1 = 4
4 x 2 = 8
...
2 x 10 = 40
*********************************************************************************

~~~
No olvides sustituir `<NOMBRE DEL ALUMNO>` por tu nombre.

Por otro lado, si el rango de edad no se contempla o no es correcto el mes, el programa terminará mostrando los siguientes mensajes, por ejemplo:

para la entrada `15, 3`, la salida será:
~~~
*********************************************************************************
PROGRAMA DE GENERACIÓN DE TABLAS: <NOMBRE DEL ALUMNO>
̣̣̣_________________________________________________________________________________
Edad: 15. No se cotempla esta edad.
̣̣̣_________________________________________________________________________________
*********************************************************************************
~~~
para la entrada `8, 13`, la salida será:
~~~
*********************************************************************************
PROGRAMA DE GENERACIÓN DE TABLAS: <NOMBRE DEL ALUMNO>
̣̣̣_________________________________________________________________________________
Mes: 12. El mes es erroneo.
̣̣̣_________________________________________________________________________________
*********************************************************************************
~~~