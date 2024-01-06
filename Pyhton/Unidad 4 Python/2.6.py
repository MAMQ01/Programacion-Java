numUno = int(input("Ingrese el num Uno"))
numDos = int(input("Ingrese el num Dos"))
numTres = int(input("Ingrese el num Tres"))

if numUno > numDos and numUno > numTres:
    print(numUno)
elif numDos > numUno and numDos > numTres:
    print(numDos)
elif numTres > numUno and numTres > numDos:
    print(numTres)
else:
    print("Los numeros son iguales")