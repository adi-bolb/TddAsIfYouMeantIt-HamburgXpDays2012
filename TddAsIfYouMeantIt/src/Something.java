import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Something {

	private String emptyBoard;

	@Before
	public void setUp() {
		emptyBoard = createEmptyBoard();
	}
	
	private String placeToken(String board, String token) {
		board += token;
		return board;
	}

	private String createEmptyBoard() {
		return "";
	}

	
	@Test
	public void x_will_win_on_a_board_with_1_cell(){
		String board = emptyBoard;

		String boardWithX = placeX(board);
		
		assertEquals(winnerXResult(), determineResultForBoardWhenWinner(boardWithX));
	}


	@Test
	public void there_will_be_a_draw_on_a_two_by_one_board() {
		String boardWithX = placeX(emptyBoard);
		String boardWithXAnd0 = place0(boardWithX);
		
		String actualResult = getResultForBoardWhenDraw(boardWithXAnd0);

		assertEquals(drawResult(), actualResult);
	}

	private String placeX(String board) {
		return placeToken(board, "X");
	}
	
	private String getResultForBoardWhenDraw(String board) {
		return drawResult();
	}

	private String drawResult() {
		return "draw";
	}

	private String determineResultForBoardWhenWinner(String board) {
		return winnerXResult();
	}

	private String winnerXResult() {
		return "X";
	}

	private String place0(String board) {
		return placeToken(board, "0");
	}
	
	// This method is not created by TDD as if you meant it.
	// It just shows that the test resulted from TDD as if you meant it is pure functional.
	public void play(){
		determineResultForBoardWhenWinner(place0(placeX(place0(createEmptyBoard()))));
	}
}
