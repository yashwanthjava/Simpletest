package resttest.controller.test;

import org.junit.Assert;
import org.junit.Test;

import resttest.controller.Controller;

public class ControllerTest {

	Controller controller = new Controller();

	@Test
	public void indexTest() {
		String actual = controller.index();
		Assert.assertEquals("Controller rest Test failing ", "\"I love travel port and need a job\"", actual);
	}

}
