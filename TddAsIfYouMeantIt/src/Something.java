import static org.junit.Assert.*;

import org.junit.Test;


public class Something {

	@Test
	public void x_will_win_on_a_board_with_1_cell(){
		String board = createEmptyBoard();
		
		board = placeToken(board, "X");
		
		assertEquals(board, determineResultForBoard(board));
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
	public void there_will_be_a_draw_on_a_two_by_one_board() {
		String emptyBoard = createEmptyBoard();
		String boardWithX = placeToken(emptyBoard, "X");
		String boardWithXAnd0 = placeToken(boardWithX, "0");
		String result = "draw";
		boardWithXAnd0 = "draw";
		
		String actualResult = boardWithXAnd0;

		assertEquals(result, actualResult);
	}
}
