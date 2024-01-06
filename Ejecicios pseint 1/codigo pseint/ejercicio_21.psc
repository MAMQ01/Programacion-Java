Algoritmo ejercicio_21
	Escribir 'Ingrese las horas trabajadas:'
	Leer horas_trabajadas
	Escribir 'Ingrese el precio por hora de trabajo:'
	Leer precio_horas_trabajadas
	Escribir 'Introduzca su nombre'
	Leer nombre
	salario_bruto <- 0
	salario_neto <- 0
	Si horas_trabajadas>35 Entonces
		horas_normales <- 35
		horas_extra <- horas_trabajadas-horas_normales
		salario_bruto <- (horas_normales*precio_horas_trabajadas)+(horas_extra*precio_horas_trabajadas*1.5)
	SiNo
		salario_bruto <- horas_trabajadas*precio_horas_trabajadas
	FinSi
	Si salario_bruto<=500 Entonces
		salario_neto <- salario_bruto
	SiNo
		Si salario_bruto<=900 Entonces
			impuestos <- ((salario_bruto-500)*0.25)
			salario_neto <- salario_bruto-impuestos
		SiNo
			impuestos <- (400*0.25)+((salario_bruto-900)*0.45)
			salario_neto <- salario_bruto-impuestos
		FinSi
	FinSi
	Escribir 'El salario bruto es: ', salario_bruto
	Escribir 'Total pagado en impuestos: ', impuestos
	Escribir 'El salario neto de ', nombre, ' es: ', salario_neto
FinAlgoritmo
