/*
 * Driver for  the crossword class
 */
public class CrosswordDriver extends GameDriver {
	static char[][] solutionBoard = null;
	static Tile[][] visibleBoard = null;
	public static void main (String[] args) {
		solutionBoard = crosswordScan(0);
		visibleBoard = new Tile[solutionBoard.length][solutionBoard[0].length];
		for(int i = 0; i < solutionBoard.length; i++) {
			for(int j = 0; j < solutionBoard[0].length; j++) {
				if(solutionBoard[i][j] == 'x') {
					
				}
			}
		}
	}
	
	
	
}
