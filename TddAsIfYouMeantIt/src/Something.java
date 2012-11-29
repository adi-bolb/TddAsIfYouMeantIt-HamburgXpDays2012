import static org.junit.Assert.*;

import org.junit.Test;


public class Something {

	@Test
	public void x_will_win_on_a_board_with_1_cell(){
		String board = createBoard("");
		
		board = placeToken(board, "X");
		
		assertEquals(board, determineResultForBoard(board));
	}

	private String placeToken(String board, String token) {
		board += token;
		return board;
	}

	private String createBoard(String boardContent) {
		return boardContent;
	}

	private String determineResultForBoard(String board) {
		return board;
	}
	
	@Test
	public void there_will_be_a_draw_on_a_two_by_one_board() {
		String board = "draw";
		assertEquals(board, determineResultForBoard(board));
	}
}
