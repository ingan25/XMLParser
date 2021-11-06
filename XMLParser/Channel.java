package XMLParser;

import org.xml.sax.Attributes;

public class Channel {
	static final String PROTOCOLHANDLER = "protocolHandler";
	static final String PROT = "port";
	static final String NAME = "name";
	
	private String protocolHandler;
	private int port;
	private String name;
	
	public Channel(Attributes attr) {
		this.protocolHandler = Function.getAttribute(attr, PROTOCOLHANDLER);
		this.port = Function.getAttributeInt(attr, PROT, -1);
		this.name = Function.getAttribute(attr, NAME);
	}

	@Override
	public String toString() {
		return "--Channel--\n"
				+ "protocolHandler = [" + protocolHandler + "]\n"
				+ "port = [" + port + "]\n"
				+ "name = [" + name + "]\n";
	}

	public String getProtocolHandler() {
		return protocolHandler;
	}

	public void setProtocolHandler(String protocolHandler) {
		this.protocolHandler = protocolHandler;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
