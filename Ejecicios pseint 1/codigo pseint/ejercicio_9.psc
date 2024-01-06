Algoritmo ejercicio_8
	Escribir 'Ingrese la altura en cm de la persona'
	Leer altura_cm
	residuo_cm <- altura_cm MOD 100
	metros <- (altura_cm - residuo_cm)/100
	Escribir 'la altura es ', metros, ' metro(s) y ', residuo_cm, ' centimetros'
FinAlgoritmo
