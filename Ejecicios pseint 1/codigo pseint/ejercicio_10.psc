Algoritmo ejercicio_10
	Escribir "Calcularemos cuanto es su salario en base al total de horas trabajadas"
	Escribir "Introduzca el precio de una hora de trabajo"
	Leer precio_hora
	Escribir "De cuantas horas es su jornada laboral?"
	Leer horas_trabajo
	Escribir "Cuantas horas extra trabajo?"
	Leer horas_trabajo_extra
	precio_horas_extra <- precio_hora * 2
	salario_horas_trabajo <- horas_trabajo * precio_hora
	salario_horas_trabajo_extra <- horas_trabajo_extra * precio_horas_extra
	salario_total <- salario_horas_trabajo + salario_horas_trabajo_extra
	Escribir "Su salario por horas trabajadas es de: ", salario_horas_trabajo
	Escribir "Su salario por horas extra trabajadas es de: ", salario_horas_trabajo_extra
	Escribir "Su salario por todas sus horas trabajadas es de: ", salario_total
FinAlgoritmo
