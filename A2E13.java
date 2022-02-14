import java.util.Scanner;
public class A2E13
{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args[])
    {
        int salir = 0;
        do
        {
            System.out.println("Bienvenido al menu de la calculadora");
            System.out.println("Las opciones con las que contamos son las siguientes: ");
            System.out.println("1) Sumar dos numeros");
            System.out.println("2) Dividir dos numeros");
            System.out.println("3) Salir");
            System.out.println("Ingrese la opcion a escoger: ");
            int opcion = entrada.nextInt();
            switch(opcion)
            {
                case 1:
                        System.out.println("Ingrese los dos numeros a sumar: ");
                        System.out.println("Ingrese el primer numero: ");
                        double num1 = entrada.nextDouble();
                        System.out.println("Ingrese el segundo numero:");
                        double num2 = entrada.nextDouble();
                        double sumaNumeros = (num1+num2);
                        System.out.println("a suma de la operacion: "+num1+" + "+num2+" = "+sumaNumeros);
                        System.out.println("");              
                break;
                case 2:
                        System.out.println("Ingrese los dos numeros para realizar su division: (dividendo/divisor)");
                        System.out.println("Ingrese el dividendo:");
                        double dividendo = entrada.nextDouble();
                        System.out.println("Ingrese el divisor: ");
                        double divisor = entrada.nextDouble();
                        if(divisor != 0)
                        {
                            double totalDivision = (dividendo/divisor);
                            System.out.println("La division de la operacion: "+dividendo+" / "+divisor+ " = "+totalDivision);
                            System.out.println("");
                        }else{
                            System.out.println("");
                            System.out.println("NO SE PUEDE DIVIDIR POR CERO!! ");
                            System.out.println("");
                        }
                break;
                case 3:
                        System.out.println("Fin de los pricesos eligio la opcion SALIR");
                        salir = 3;  
                break;
                default:
                        System.out.println("Elija una de las 3 opciones!! ");
            }
        }while(salir != 3);
    }
}