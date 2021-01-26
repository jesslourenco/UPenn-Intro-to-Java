package simplegame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleGameTest {

	@Test
	void testConvertTime() {
		SimpleGame game = new SimpleGame();
		
		assertEquals("23:59:59", game.convertTime(86399));
		assertEquals("0:23:52", game.convertTime(1432));
		assertEquals("-1:-1:-1", game.convertTime(-1));
		assertEquals("0:0:0", game.convertTime(0));
	}

	@Test
	void testDigitsSum() {
		SimpleGame game = new SimpleGame();
		
		assertEquals(18, game.digitsSum(2394));
		assertEquals(16, game.digitsSum(565));
		assertEquals(7, game.digitsSum(7));
		assertEquals(0, game.digitsSum(0));
	}

}
