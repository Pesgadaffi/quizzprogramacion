01 Generador de Patrones Numéricos
Instrucción:
Escribe un programa que solicite al usuario un número entero positivo n y genere un patrón numérico en forma de triángulo. El patrón debe seguir una secuencia donde cada línea comienza con el número de línea y aumenta hasta n, y luego disminuye hasta el número de línea nuevamente.
Ejemplo de salida para n = 5:
        5 4 3 2 1
      4 5 4 3 2
    3 4 5 4 3
  2 3 4 5 4
1 2 3 4 5

//Variables:
1. numEnt - i - genP

//Metodo
1. Lo primero que se haria, seria agregando un new scanner
2. Despues se imprimiria el mensaje donde le pide al usuario que ingrese el numero entero positivo
3. Se definiria la variable numEnt como scanner para que reciba el numero
4. Se espicificaria de que si el numero es <= 0, este mostraria un mensaje diciendo que ese no es un numero positivo cerrando el scanner
5. En la sgte linea se volveria a abrir el public static donde llegaria el dato si si era positivo
6. Despues se definiria la variable i que se definiria como 1, con esta variable y numEnt se comensaria a sumar para hacer para hacer la parte ascendente del triangulo
9. y yaper