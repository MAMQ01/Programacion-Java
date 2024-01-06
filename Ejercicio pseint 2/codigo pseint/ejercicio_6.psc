Algoritmo ejercicio_6
	Definir numero Como Entero
	contador <- 0
	contador_negativo <- 0
	negativo <- numero<0
	Para contador<-1 Hasta 10 Hacer
		Escribir 'Introduce uno de los 10 numeros para saber si hay negativos '
		Leer numero
	FinPara
	Repetir
		contador <- contador+1
		Si numero < 0 Entonces
			Escribir "Es negativo", contador_negativo
		FinSi
	Hasta Que contador=10 Y negativo O contador=10
FinAlgoritmo
