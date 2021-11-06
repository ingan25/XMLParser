package XMLParser;

import org.xml.sax.Attributes;

public class Engine{
	static final String MAGICONELOGGER = "magicOneLogger";
	static final String LOG4JWATCHINTERVAL = "log4jWatchInterval";
	static final String SQLLOGLEVEL = "sqlLogLevel";
	static final String USERFUNCTIONPATH = "userFunctionPath";
	static final String XMLENCODING = "xmlEncoding";
	static final String STANDALONE = "standAlone";
	static final String DEVELOPMODE = "developMode";
	
	private String magicOneLogger;
	private int log4jWatchInterval;
	private String sqlLogLevel;
	private String userFunctionPath;
	private String xmlEncoding;
	private String streamEnabled;
	private String standAlone;
	private String developMode;
	
	Engine(Attributes attr) {
		this.magicOneLogger = Function.getAttribute(attr, MAGICONELOGGER);
		this.log4jWatchInterval = Function.getAttributeInt(attr, LOG4JWATCHINTERVAL, -1);
		this.sqlLogLevel = Function.getAttribute(attr, SQLLOGLEVEL);
		this.userFunctionPath = Function.getAttribute(attr, USERFUNCTIONPATH);
		this.xmlEncoding = Function.getAttribute(attr, XMLENCODING);
		this.standAlone = Function.getAttribute(attr, STANDALONE);
		this.developMode = Function.getAttribute(attr, DEVELOPMODE);
	}
	
	
	public String getMagicOneLogger() {
		return magicOneLogger;
	}
	public void setMagicOneLogger(String magicOneLogger) {
		this.magicOneLogger = magicOneLogger;
	}
	public int getLog4jWatchInterval() {
		return log4jWatchInterval;
	}
	public void setLog4jWatchInterval(int log4jWatchInterval) {
		this.log4jWatchInterval = log4jWatchInterval;
	}
	public String getSqlLogLevel() {
		return sqlLogLevel;
	}
	public void setSqlLogLevel(String sqlLogLevel) {
		this.sqlLogLevel = sqlLogLevel;
	}
	public String getUserFunctionPath() {
		return userFunctionPath;
	}
	public void setUserFunctionPath(String userFunctionPath) {
		this.userFunctionPath = userFunctionPath;
	}
	public String getXmlEncoding() {
		return xmlEncoding;
	}
	public void setXmlEncoding(String xmlEncoding) {
		this.xmlEncoding = xmlEncoding;
	}
	public String getStreamEnabled() {
		return streamEnabled;
	}
	public void setStreamEnabled(String streamEnabled) {
		this.streamEnabled = streamEnabled;
	}
	public String getStandAlone() {
		return standAlone;
	}
	public void setStandAlone(String standAlone) {
		this.standAlone = standAlone;
	}
	public String getDevelopMode() {
		return developMode;
	}
	public void setDevelopMode(String developMode) {
		this.developMode = developMode;
	}

	@Override
	public String toString() {
		return "--Engine--\n"
				+ "magicOneLogger = [" + magicOneLogger + "]\n"
				+ "log4jWatchInterval = ["+ log4jWatchInterval + "]\n"
				+ "sqlLogLevel = [" + sqlLogLevel + "]\n"
				+ "userFunctionPath = [" + userFunctionPath + "]\n"
				+ "xmlEncoding = [" + xmlEncoding + "]\n"
				+ "streamEnabled = [" + streamEnabled + "]\n"
				+ "standAlone = [" + standAlone + "]\n"
				+ "developMode = [" + developMode + "]\n";
	}
	
	

}
