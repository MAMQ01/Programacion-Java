Algoritmo ejercicio_15
	Definir tabla_buscada Como Entero
	Escribir 'Introduce el numero de la tabla que quieres conocer'
	Leer num
	Si num>=1 Y num<=9 Entonces
		Repetir
			contador <- contador + 1
			multiplicacion <- num*contador
			Escribir "La tabla del numero:", num, " es: ", num, " * ", contador,  " = ", multiplicacion
		Hasta Que contador = 9
	SiNo
		Escribir 'Indruzca un numero Entero entre 1 y 9'
	FinSi
FinAlgoritmo
