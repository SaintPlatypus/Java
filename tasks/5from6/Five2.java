import java.lang.Math;
public class Five2 {
    public static void main(String[] args) {
        System.out.println(canMove("Rook", "A8", "H8"));
    }
  public static boolean canMove(String piece, String current, String target) {//Фигуры с последующими возможными ходами
		int[] relMove = getRelMove(current, target);
		switch(piece) {
			case "Pawn":
				return canPawnMove(current, relMove);
			case "Rook":
				return canRookMove(relMove);
			case "Knight":
				return canKnightMove(relMove);
			case "Bishop": 
				return canBishopMove(relMove);
			case "Queen":
				return canQueenMove(relMove);
			case "King":
				return canKingMove(relMove);
			default:
				return false;
		}
	}
	public static int[] getRelMove(String current, String target) {
		char[] curChars = current.toCharArray();
		char[] targChars = target.toCharArray();
		int[] output = new int[2];
		output[0] = (int)(targChars[0]) - (int)(curChars[0]);
		output[1] = (int)(targChars[1]) - (int)(curChars[1]);
		return output;
	}
	
	public static boolean canPawnMove(String current, int[] relMove) {//Возможный ход Пешки
		if (relMove[0] == 0) {
			if(relMove[1] == 1) return true;
			if (current.contains("2") && relMove[1] == 2) return true;
		}
		return false;
	}
	
	public static boolean canRookMove(int[] relMove) {//Возможный ход Ладьи
		return (relMove[0] == 0 || relMove[1] == 0);
	}
	
	public static boolean canKnightMove(int[] relMove) {//Возможный ход Коня
		if (Math.abs(relMove[0]) == 1 && Math.abs(relMove[1]) == 2) return true;
		if (Math.abs(relMove[0]) == 2 && Math.abs(relMove[1]) == 1) return true;
		return false;
	}
	
	public static boolean canBishopMove(int[] relMove) {//Возможный ход Слона
		return (Math.abs(relMove[0]) == Math.abs(relMove[1]));
	}
	
	public static boolean canQueenMove(int[] relMove) {//Возможный ход Королевы
		return canRookMove(relMove) || canBishopMove(relMove);
	}
	
	public static boolean canKingMove(int[] relMove) {//Возможный ход Короля
		return (Math.abs(relMove[0]) <= 1 && Math.abs(relMove[1]) <= 1);
	}
}