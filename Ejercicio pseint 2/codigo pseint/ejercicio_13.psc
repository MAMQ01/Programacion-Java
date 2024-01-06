Algoritmo ejercicio_13
	Definir opcion Como Entero
	Escribir 'Mostrare el menu en pantalla'
	sumar <- 1
	restar <- 2
	multiplicar <- 3
	dividir <- 4
	salir <- 0
	Repetir
		Escribir '1.Sumar'
		Escribir '2 Restar'
		Escribir '3 Multiplicar'
		Escribir '4 Dividir'
		Escribir '0 Salir'
		Escribir 'Introduce la opcion deseada:'
		Leer opcion
		Según opcion Hacer
			1:
				Escribir 'Sumar'
			2:
				Escribir 'Restar'
			3:
				Escribir 'Multiplicar'
			4:
				Escribir 'Dividir'
		FinSegún
	Hasta Que opcion=0
FinAlgoritmo
