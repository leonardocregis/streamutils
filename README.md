# streamutils
Some utilities that i found missing from the Java Util lib



For now its just the class: 

OutPutStreamHelper

Simple utility to be used as a receiving Stream for characters
 
Sample use:
 
StringWriter out  = new StringWriter();
PrintStream ps = new PrintStream(out);

ps.println("teste");

out.toString();  // will return "teste"
