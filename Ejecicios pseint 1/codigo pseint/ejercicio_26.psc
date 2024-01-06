Algoritmo ejercicio_26
	Escribir 'Ingrese la primera nota del examen'
	Leer nota_examen_1
	Escribir 'Ingrese la segunda nota del examen'
	Leer nota_examen_2
	promedio <- (nota_examen_1 + nota_examen_2)/2
	Si promedio >= 5 Entonces
		Escribir "Su nota media es: ", promedio
	SiNo
		Escribir "Tienes que recuperar"
		Escribir "ingrese su nota de examen extra"
		Leer nota_examen_extra
		Según nota_examen_extra Hacer
			1,2,3,4:
				Escribir "No apto"
			5,6,7,8,9,10:
				Escribir "Apto"
				promedio <- 5 
			De Otro Modo:
				Escribir "Nota incorrecta"
		FinSegún
		Escribir "Su nota de programacion es: ", promedio
	FinSi
FinAlgoritmo
