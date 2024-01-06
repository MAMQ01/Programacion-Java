Algoritmo ejercicio_8
	contador_negativo <- 0
	contador_positivo <- 0
	Repetir
		Escribir 'Introduzca un numero, solo hay un numero que le da acceso'
		Leer numero
		negativo <- numero<0
		Si negativo Entonces
			contador_negativo <- contador_negativo+1
			Escribir numero, ' es negativo!'
		SiNo
			Si numero = 0 Entonces
				Escribir numero, " es el acceso hasta aca voy"
			SiNo
				contador_positivo <- contador_positivo+1
				Escribir numero, ' es postivo!"
			FinSi
		FinSi
		Escribir "tiene en total: ",contador_negativo, " numeros negativos Y ", contador_positivo, " numeros positivos"
	Hasta Que numero==0
FinAlgoritmo
