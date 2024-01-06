año = int(input("Ingrese un alo para saber si es bisiesto"))

if año%4 == 0 and año%100 != 0 or año%400 == 0:
    print("BISIESTO")
else:
    print("NO-BISIESTO")