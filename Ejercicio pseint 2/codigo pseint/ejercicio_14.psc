Algoritmo ejercicio_14
	Escribir 'Contara de 10 en 10 hacia atras desde 860 al 460'
	numero1 <- 860
	numero2 <- 460
	Mientras numero1>numero2 Hacer
		numero1 <- numero1-10
	FinMientras
	Escribir 'Con el bucle while ', numero1
	numero1 <- 860
	Repetir
		numero1 <- numero1-10
	Hasta Que numero1<=numero2
	Escribir 'Con el bucle repetir Hasta ', numero1
	numero1 <- 860
	Para reduccion<-numero1 Hasta numero2 Con Paso -10 Hacer
		numero1 <- reduccion
	FinPara
	Escribir "Con el bucle FOR ", numero1
FinAlgoritmo
