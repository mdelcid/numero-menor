package tarea;

import java.util.Scanner;

public class Tarea 
{
	static int menor(int num1, int num2)
	{
	     if (num1<num2)
	     {
	     System.out.print("El numero menor es: ");
	     return num1;
	     } else if (num2<num1) 
	     {
	     System.out.print("El numero menor es: ");
	     return num2;
	     }else
	     {
	     System.out.print("Los nuemros son Iguales");
	     return 0;
	     }
	      }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner mi_escaner= new Scanner (System.in);
		  System.out.print("Ingrese primer valor: ");
		  int num1= mi_escaner.nextInt();
		  System.out.print("Ingrese segundo valor: ");
		  int num2= mi_escaner.nextInt();
		  System.out.print(menor(num1,num2));
		
	}

}
