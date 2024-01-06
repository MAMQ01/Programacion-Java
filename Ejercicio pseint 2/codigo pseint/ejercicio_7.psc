Algoritmo ejercicio_7
	Definir numero Como Real
	contador <- 0
	contador_negativo <- 0
	Repetir
		Escribir 'Introduce uno de los 10 numeros para saber si hay negativos '
		Leer numero
		negativo <- numero<0
		contador <- contador+1
		Si negativo Entonces
			contador_negativo <- contador_negativo + 1
			Escribir numero, ' es negativo, ', contador_negativo, " es su cantidad total de negativos"
		SiNo
			Escribir numero, ' es postivo'
		FinSi
	Hasta Que contador=10 Y negativo O contador=10
FinAlgoritmo
