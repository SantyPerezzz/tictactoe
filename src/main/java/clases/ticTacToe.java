package clases;
import clases.Funciones;
import java.util.Scanner;

public class ticTacToe {

	public static void main(String[] args) {
		
		char[][] gameBoard= {{' ','|',' ','|',' '},
							{'-','+','-','+','-'},
							{' ','|',' ','|',' '},
							{'-','+','-','+','-'},
							{' ','|',' ','|',' '}};
		
		Funciones.mostrarTablero(gameBoard);
		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Ingrese un numero del 1 al 9");
		
		int pos=scn.nextInt();
		
		
		
		
	}
}
