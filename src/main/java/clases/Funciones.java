package clases;

public class Funciones {
	
	public static void mostrarTablero(char[][] gameBoard) {
		for(int i=0;i<5;i++) {
			System.out.println(gameBoard[i]);
		}
		System.out.println();
	}
	
	public static void jugarX(char[][] gameBoard,int fila, int colum, boolean repetir){
		
		if (gameBoard[fila][colum]!=' ') {
			System.out.println("Este lugar ya esta ocupado");
			repetir=true;
		}
		else {
			gameBoard[fila][colum]='X';
			repetir=false;
		}
		
	}
	
	public static void jugarO(char[][] gameBoard,int fila, int colum, boolean repetir){
			
		if (gameBoard[fila][colum]!=' ') {
			System.out.println("Este lugar ya esta ocupado");
			repetir=true;
		}
		else {
			gameBoard[fila][colum]='O';
			repetir=false;
		}
			
	}
		
	public static void jugar(char[][] gameBoard, int pos, char pj, boolean repetir) {
		
		switch(pos) {
			case 1:
				gameBoard[0][0]=pj;
		}
	}
	
}