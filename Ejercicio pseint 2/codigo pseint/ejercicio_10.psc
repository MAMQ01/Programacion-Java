Algoritmo ejercicio_10
	Definir notas Como Real
	Repetir
		Escribir 'Inserte sus notas'
		Leer notas
		Escribir 'Tiene mas notas si/no'
		Leer tiene_mas_notas
		Si Minusculas(tiene_mas_notas)=='si' Entonces
			Escribir 'Si tiene mas notas'
		SiNo
			Si Minusculas(tiene_mas_notas)<>'no' Entonces
				Escribir 'No ingreso un dato valido si/no'
			FinSi
		FinSi
	Hasta Que Minusculas(tiene_mas_notas)=='no'
	Escribir 'no tiene mas notas'
FinAlgoritmo
