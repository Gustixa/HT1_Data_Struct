import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author rafae
 *
 */
public class RadioTest3 {
	/**
	 * Test method for {@link Radio#moveForward()}.
	 */
	@Test
	void testMoveForward() {
		Radio myRadio = new Radio();
		myRadio.moveForward();
		assertEquals(540, myRadio.getActualFreqAM());
	}


}
