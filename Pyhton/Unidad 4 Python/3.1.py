nota = float(input("Introduzca la nota "))

if 0<=nota<3:
  print(f"{nota} Muy Deficiente")
elif 3<=nota<5:
  print(f"{nota} Insuficiente")
elif 5<=nota<6:
  print(f"{nota} Bien")
elif 6<=nota<9:
  print(f"{nota} Notable")
elif 9<=nota<10:
  print(f"{nota} Sobresaliente")
else:
  print("ERROR: La nota es incorrecta.")