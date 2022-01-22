import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author rafae
 *
 */
class RadioTest1 {

	/**
	 * Test method for {@link Radio#getStatus()}.
	 */
	@Test
	void testGetStatus() {
		Radio myRadio = new Radio();
		assertEquals(true, myRadio.getStatus());
	}

	


}
