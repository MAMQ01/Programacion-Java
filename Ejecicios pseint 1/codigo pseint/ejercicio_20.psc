Algoritmo ejercicio_20
	Escribir 'Ingrese una hora para incrementar 1 segundo'
	Escribir 'Ingrese las horas entre 0 - 23'
	Leer horas_ingresadas
	Escribir 'Ingrese los minutos entre 0 - 59'
	Leer minutos_ingresados
	Escribir 'Ingrese los segundos entre 0 - 59'
	Leer segundos_ingresados
	Escribir 'Hora inicial ', horas_ingresadas, ' minutos ', minutos_ingresados, ' segundos ', segundos_ingresados
	Si horas_ingresadas>=0 Y horas_ingresadas<=23 Entonces
		Si minutos_ingresados>=0 Y minutos_ingresados<=59 Entonces
			Si segundos_ingresados>=0 Y segundos_ingresados<=59 Entonces
				segundos_ingresados <- segundos_ingresados+1
				Si segundos_ingresados>59 Entonces
					segundos_ingresados <- 0
					minutos_ingresados <- minutos_ingresados+1
					Si minutos_ingresados>59 Entonces
						minutos_ingresados <- 0
						horas_ingresadas <- horas_ingresadas+1
						Si horas_ingresadas>23 Entonces
							horas_ingresadas <- 0
						FinSi
					FinSi
				FinSi
				Escribir 'Hora, final ', horas_ingresadas, ' horas ', minutos_ingresados, ' minutos ', segundos_ingresados, ' segundos '
			SiNo
				Escribir 'fuera de rango segundos 0 - 59'
			FinSi
		SiNo
			Escribir 'fuera de rango minutos 0 - 59'
		FinSi
	SiNo
		Escribir 'fuera de rango horas 0 - 23'
	FinSi
FinAlgoritmo
