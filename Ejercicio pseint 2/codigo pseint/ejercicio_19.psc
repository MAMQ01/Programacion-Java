Algoritmo Divisores
	Definir num, divisor Como Entero
	Escribir 'Ingrese un número entero positivo: '
	Leer num
	Si num>=0 Entonces
		Escribir 'Los divisores de ', num, ' son:'
		Para divisor<-1 Hasta num Hacer
			Si num MOD divisor==0 Entonces
				Escribir divisor
			FinSi
		FinPara
	SiNo
		Escribir 'El número debe ser positivo.'
	FinSi
FinAlgoritmo
