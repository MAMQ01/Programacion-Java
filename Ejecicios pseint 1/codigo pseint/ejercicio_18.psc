Algoritmo ejercicio_18
	Escribir 'Leeré tres números ingresados y determinaré cuál es mayor o si son iguales'
	Escribir 'Ingrese el número 1'
	Leer numero1
	Escribir 'Ingrese el número 2'
	Leer numero2
	Escribir 'Ingrese el número 3'
	Leer numero3
	Si numero1=numero2 Y numero2=numero3 Entonces
		Escribir 'Los números: ', numero1, ', ', numero3, ' y ', numero2, ' son iguales ', "por lo tanto el: ", numero1, " es el mayor"
	SiNo
		Si numero1>numero2 Entonces
			Si numero1>numero3 Entonces
				Escribir 'Este numero1 es mayor que numero2 y numero3'
				Escribir 'El numero1: ', numero1, ' es el mayor'
			SiNo
				Escribir 'Este numero1 es mayor que numero2 y menor que numero3'
				Escribir 'Este numero3: ', numero3, ' es el mayor'
			FinSi
		SiNo
			Si numero2>numero3 Entonces
				Escribir 'Este numero2 es mayor que numero1 y mayor que numero3'
				Escribir 'El numero2: ', numero2, ' es el mayor'
			SiNo
				Escribir 'Este numero3 es mayor que numero1 y menor que numero2'
				Escribir 'Este numero3: ', numero3, ' es el mayor'
			FinSi
		FinSi
	FinSi
FinAlgoritmo
