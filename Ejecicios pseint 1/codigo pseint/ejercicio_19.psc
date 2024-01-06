Algoritmo ejercicio_19
	Escribir 'Ingrese su4 calificación entre 0 y 10: '
	Leer calificacion
	Si calificacion>=0 Y calificacion<3 Entonces
		Escribir 'Su calificacion es: Muy Deficiente'
	SiNo
		Si calificacion>=3 Y calificacion<5 Entonces
			Escribir 'Su calificacion es: Insuficiente'
		SiNo
			Si calificacion>=5 Y calificacion<6 Entonces
				Escribir 'Su calificacion es: Bien'
			SiNo
				Si calificacion>=6 Y calificacion<9 Entonces
					Escribir 'Su calificacion es: Notable'
				SiNo
					Si calificacion>=9 Y calificacion<=10 Entonces
						Escribir 'Su calificacion es: Sobresaliente'
					SiNo
						Escribir 'Su calificacion debe ser entre 0 y 10'
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
