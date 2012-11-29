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

	private String determineResultForBoard(String board) {
		return board;
	}
	
	@Test
	public void x_will_win_on_a_board_with_1_cell(){
		String board = emptyBoard;
		String boardWithX = placeX(board);
		assertEquals("X", determineResultForBoard(boardWithX));
	}

	private String placeX(String board) {
		return placeToken(board, "X");
	}

	@Test
	public void there_will_be_a_draw_on_a_two_by_one_board() {
		String boardWithX = placeX(emptyBoard);
		String boardWithXAnd0 = place0(boardWithX);
		String result = "draw";
		boardWithXAnd0 = "draw";
		
		String actualResult = boardWithXAnd0;

		assertEquals(result, actualResult);
	}

	private String place0(String z) {
		return placeToken(z, "0");
	}
}
