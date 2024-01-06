Algoritmo ejercicio_22
	Escribir 'Ingrese un año para decir si es bisiesto'
	Leer ano
	Si (ano MOD 4 == 0) Y (( No ano MOD 100 == 0) O (ano % 400 == 0)) Entonces
		Escribir "Es bisiesto"
	SiNo
		Escribir "No es bisiesto"
	FinSi
FinAlgoritmo
