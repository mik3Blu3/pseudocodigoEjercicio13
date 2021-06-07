Algoritmo Calculadora
	salir <- 0
	Repetir
		Escribir 'Bienvenido al menu de la calculadora'
		Escribir 'Las opciones con las que contamos son las siguientes: '
		Escribir '1) Sumar dos numeros'
		Escribir '2) Dividir dos numeros'
		Escribir '3) Salir'
		Escribir 'Ingrese el numero de la opcion a escoger: '
		Leer op
		Segun op  Hacer
			1:
				Escribir 'Ingrese los dos numeros a sumar: '
				Escribir 'Ingrese el primer numero: '
				Leer num1
				Escribir 'Ingrese el segundo numero: '
				Leer num2
				sumaNumeros <- (num1+num2)
				Escribir 'La suma de la operacion: ',num1,' + ',num2,' = ',sumaNumeros
				Escribir ''
				salir <- 1
			2:
				Escribir 'Ingrese los dos numeros para realizar su division: (dividendo/divisor) '
				Escribir 'Ingrese el dividendo: '
				Leer dividendo
				Escribir 'Ingrese el divisor: '
				Leer divisor
				Si divisor<>0 Entonces
					totalDivision <- (dividendo/divisor)
					Escribir 'La division de la operacion: ',dividendo,' / ',divisor,' = ',totalDivision
					Escribir ''
				SiNo
					Escribir ''
					Escribir 'NO SE PUEDE DIVIDIR POR CERO!! '
					Escribir ''
				FinSi
				salir <- 2
			3:
				salir <- 3
				Escribir 'Fin procesos eligio la opcion Salir'
			De Otro Modo:
				Escribir ''
				Escribir 'Ingrese una de las 3 opciones que se muestran en el menu '
				Escribir ''
		FinSegun
	Hasta Que salir==3
FinAlgoritmo
