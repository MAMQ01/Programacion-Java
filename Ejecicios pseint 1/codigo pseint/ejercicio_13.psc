Algoritmo ejercicio_13
	Escribir 'Leere dos numeros ingresados, y hare + - * /'
	Escribir 'Ingrese el numero 1'
	Leer numero1
	Escribir 'Ingrese el numero 2'
	Leer numero2
	Si numero2 <- 0 Entonces
		Escribir "No se puede dividir por 0"
	SiNo
		suma <- numero1+numero2
		resta <- numero1-numero2
		division <- numero1/numero2
		multiplicacion <- numero1*numero2
		Escribir "La suma es: ", suma, " la resta es: ",resta, " la division es: ", division, " la multiplicacion es: ",multiplicacion
	FinSi
FinAlgoritmo
