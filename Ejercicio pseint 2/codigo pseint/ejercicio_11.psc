Algoritmo ejercicio_11
	numero1 <- 100
	numero2 <- 200
	suma_pares <- 0
	suma_impares <- 0
	contador_pares <- 0
	contador_impares <- 0
	Para contador<-numero1 Hasta numero2 Con Paso 1 Hacer
		Si contador MOD 2=0 Entonces
			suma_pares <- suma_pares+contador
			contador_pares <- contador_pares+1
		SiNo
			suma_impares <- suma_impares+contador
			contador_impares <- contador_impares+1
		FinSi
	FinPara
	Escribir 'La suma de los n�meros pares entre 100 y 200 es: ', suma_pares
	Escribir 'La suma de los n�meros impares entre 100 y 200 es: ', suma_impares
	Escribir 'Cantidad de n�meros pares: ', contador_pares
	Escribir 'Cantidad de n�meros impares: ', contador_impares
FinAlgoritmo
