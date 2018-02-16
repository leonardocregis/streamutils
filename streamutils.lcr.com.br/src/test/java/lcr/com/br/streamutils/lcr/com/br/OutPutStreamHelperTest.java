package lcr.com.br.streamutils.lcr.com.br;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.Assert;
import org.junit.Test;

import lcr.com.br.streamutils.lcr.com.br.OutPutStreamHelper;


/**
 * Unit test for simple App.
 */
public class OutPutStreamHelperTest {

	@Test
	public void printSomethingTest() {
		StringWriter sw = new StringWriter();
		OutPutStreamHelper outPutStreamHelper = new OutPutStreamHelper(sw);
		PrintWriter pw =  new PrintWriter(outPutStreamHelper);
		
		pw.print("Test");
		pw.close();
		
		Assert.assertEquals("Test",sw.toString());

	}
}
