package lcr.com.br.streamutils.lcr.com.br;

import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
/**
 * 
 * Simple utility to be used as a receiving Stream for characters
 * 
 * Sample use:
 * 
 * StringWriter out  = new StringWriter();
 * PrintStream ps = new PrintStream(out);
 * 
 * ps.println("teste");
 * 
 * out.toString();  // will return "teste"
 * 
 * @author Leonardocregis
 *
 */
public class OutPutStreamHelper extends OutputStream {
	
	StringWriter sw ;
	
	public OutPutStreamHelper(StringWriter out) {
		sw = out;
	}

	@Override
	public void write(int b) throws IOException {
		sw.write(b);		
	}
}