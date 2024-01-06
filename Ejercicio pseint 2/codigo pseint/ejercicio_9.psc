Algoritmo ejercicio_9
	// Asumimos que los numeros naturales empiezan de 1
	Escribir 'Dire la suma y el producto de los 10 primeros numeros naturales'
	contador <- 1
	contador_suma_acumulada <- 0
	contador_mult_acumulado <- 1
	Mientras contador<=10 Hacer
		Escribir contador
		contador_suma_acumulada <- contador_suma_acumulada+contador
		contador_mult_acumulado <- contador_mult_acumulado*contador
		contador <- contador+1
	FinMientras
	Escribir 'La suma es: ', contador_suma_acumulada, ' y el producto es: ', contador_mult_acumulado
FinAlgoritmo
