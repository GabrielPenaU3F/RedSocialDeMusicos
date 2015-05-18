import org.junit.Assert;
import org.junit.Test;

import untref.lp4.redsocialdemusicos.redsocialdemusicos.TesterConexion;


public class TestTesterConexion {

    //Probar con y sin conexion
	@Test
	public void testQueSeConecte() {
		boolean d = TesterConexion.testear("google.com", 80);
		Assert.assertEquals(true, d);
	}

}
