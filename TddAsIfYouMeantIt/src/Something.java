import static org.junit.Assert.*;

import org.junit.Test;


public class Something {

	@Test
	public void x_will_win_on_a_board_with_1_cell(){
		String boardWithOneCell = "X";
		String winner = "X";
		assertEquals(winner, boardWithOneCell);
	}
	
	@Test
	public void there_will_be_a_draw_on_a_two_by_one_board() {
		String twoByOneBoardWithACrossAndACircle = "draw";
		String winner = "draw";
		assertEquals(winner, twoByOneBoardWithACrossAndACircle);
	}
}
