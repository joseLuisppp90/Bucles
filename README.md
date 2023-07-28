parte 1: Mientras que los bucles
Abra su IDE y cree una nueva clase Java denominada Table
Copie el código siguiente en la tabla de clases Java y compruebe que funciona
	import java.util.Scanner;

	public class Table
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	                
	        System.out.println("Multiplication Table of " + num);
	        
	       //TODO implement While loop to get print result
	    }
	}
Implemente un bucle while que imprima la tabla de multiplicar del número de entrada dado.
Parte 2: Bucles Do While
Cree una nueva clase Java con un método main (para que pueda ejecutar su código) llamado Fibonacci

Los números de Fibonacci son un problema tradicional de informática: "cada número es la suma de los dos anteriores, comenzando por 0 y 1".

El comienzo de la secuencia es así:

0 1 1 2 3 5 8 13 21 34 55 89 ...

Agregue la siguiente importación para poder capturar la entrada del usuario n

  import java.util.Scanner;
Implementar un bucle Do While que calcule Fibonacci(n)

n	Fibonacci(n)
0	0
1	1
2	1
3	2
4	3
5	5
6	8
7	13
...	...
Parte 3: Para bucles
Utilice el bucle for para crear un programa que pida al usuario que escriba un nombre y, a continuación, imprima cada una de las letras del nombre
Indirecta Puede utilizar las siguientes funciones String:

length() -> devuelve el número total de caracteres de una cadena determinada
chartAt(i) -> devuelve el carácter en la posición dada(i) de una cadena