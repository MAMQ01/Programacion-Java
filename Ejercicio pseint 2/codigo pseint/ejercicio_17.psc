Algoritmo ejercicio_17
	Escribir 'Adivinare el num que piensas'
	num_piensas <- 15
	num_inicial <- 50
	num_posible <- num_inicial
	Escribir 'Tu numero es: ', num_inicial
	Si num_inicial<>num_piensas Entonces
		Repetir
			Escribir 'El numero que piensas es mayor a ', num_posible, '? si es/no es'
			Leer es_mayor
			Si Minusculas(es_mayor)=='si es' Entonces
				num_posible <- num_posible+10
			SiNo
				num_posible <- num_posible-1
			FinSi
			Si num_posible>100 O num_posible<0 Entonces
				Escribir 'Ya di todas la opciones posibles'
				num_posible <- 100
			FinSi
		Hasta Que num_piensas=num_posible
	FinSi
	Escribir num_piensas, ' Es tu numero lo adivine!'
FinAlgoritmo
