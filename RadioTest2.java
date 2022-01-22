import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author rafae
 *
 */
public class RadioTest2 {
	/**
	 * Test method for {@link Radio#changeMode()}.
	 */
	@Test
	void testChangeMode() {
		Radio myRadio = new Radio();
		myRadio.changeMode();
		assertEquals(true, myRadio.getStatus());
		myRadio.changeMode();
		assertEquals(false, myRadio.getStatus());
	}

}
