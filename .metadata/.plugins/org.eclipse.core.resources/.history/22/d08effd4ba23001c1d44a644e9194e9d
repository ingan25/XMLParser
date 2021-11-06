package XMLParser;

import org.xml.sax.Attributes;

public class Function {
	public static int getAttributeInt(Attributes attr, String name, int defaultValue){
		try{
			String o = attr.getValue(name);
			return Integer.parseInt(o);
		}catch(Exception e){
			return defaultValue;
		}
	}
	
	public static String getAttribute(Attributes attr, String name){
		String o = attr.getValue(name);
		return o == null ? "" : o;
	}
}
