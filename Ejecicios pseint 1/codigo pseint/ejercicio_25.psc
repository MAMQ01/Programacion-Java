Algoritmo ejercicio_25
	Definir dinero Como Entero
	Escribir 'Ingrese el monto en euros en numero multiplos de 5'
	Leer dinero
	billetes_5 <- 0
	billetes_10 <- 0
	billetes_20 <- 0
	billetes_50 <- 0
	billetes_100 <- 0
	billetes_200 <- 0
	billetes_500 <- 0
	Si dinero MOD 5==0 Entonces
		Escribir 'Es multiplo 5'
		billetes_500 <- trunc(dinero/500)
		dinero <- dinero MOD 500
		billetes_200 <- trunc(dinero/200)
		dinero <- dinero MOD 200
		billetes_100 <- trunc(dinero/100)
		dinero <- dinero MOD 100
		billetes_50 <- trunc(dinero/50)
		dinero <- dinero MOD 50
		billetes_20 <- trunc(dinero/20)
		dinero <- dinero MOD 20
		billetes_10 <- trunc(dinero/10)
		dinero <- dinero MOD 10
		billetes_5 <- trunc(dinero/5)
		Si dinero <> 0 Entonces
			Escribir 'Su operacion se completo el retiro!'
			Escribir 'Entregamos: ', billetes_500, ' de 500'
			Escribir 'Entregamos: ', billetes_200, ' de 200'
			Escribir 'Entregamos: ', billetes_100, ' de 100'
			Escribir 'Entregamos: ', billetes_50, ' de 50'
			Escribir 'Entregamos: ', billetes_20, ' de 20'
			Escribir 'Entregamos: ', billetes_10, ' de 10'
			Escribir 'Entregamos: ', billetes_5, ' de 5'
		FinSi
	SiNo
		Escribir 'No es multiplo'
	FinSi
FinAlgoritmo
