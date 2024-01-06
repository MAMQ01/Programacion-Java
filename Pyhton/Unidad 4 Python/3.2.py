hora = int(input("Ingrese a hora: "))
minuto = int(input("Ingrese los minutos: "))
segundo = int(input("Ingrese los segundos: "))

horaActual = print(f"Hora inicial {hora}:{minuto}:{segundo}")

segundo = segundo + 1
if segundo > 59:
  segundo = 00
  minuto = minuto + 1
  if minuto > 59:
    minuto = 00
    hora = hora + 1
    if hora > 23:
      hora = 00
      
horaActual = print(f"Hora final {hora}:{minuto}:{segundo}")