Algoritmo ejercicio_16
	Escribir 'Escribiré la media, el num mayo, el num menor'
	Escribir 'Introduzca la cantidad total de numeros'
	Leer num_introducidos
	contador <- 0
	num_menor <- 9999999999999999
	num_mayor <- -9999999999999999
	sumatoria <- 0
	media <- 0
	Repetir
		contador <- contador+1
		Escribir 'Introduzca el siguiente numero'
		Leer num_nuevo
		Si num_nuevo<num_menor Entonces
			num_menor <- num_nuevo
		FinSi
		Si num_nuevo>num_mayor Entonces
			num_mayor <- num_nuevo
		FinSi
		sumatoria <- sumatoria + num_nuevo
	Hasta Que contador=num_introducidos
	media <- sumatoria/contador
	Escribir 'El numero menor es: ', num_menor
	Escribir 'El numero mayor es: ', num_mayor
	Escribir "La media es: ",media
FinAlgoritmo
