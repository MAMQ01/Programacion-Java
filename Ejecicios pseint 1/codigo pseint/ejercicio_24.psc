Algoritmo ejercicio_24
	Definir numero Como Entero
	Escribir "Ingrese un numero para saber si es par y/o divisible entre 7"
	Leer numero
	Si numero%2 == 0 Y numero%7 == 0 Entonces
		Escribir "numero par y divisible entre 7"
	SiNo
		Si numero%2 == 0 Entonces
			Escribir "numero par"
		SiNo
			Escribir "numero impar"
		FinSi
	FinSi
FinAlgoritmo
