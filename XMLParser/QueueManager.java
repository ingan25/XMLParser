package XMLParser;

import org.xml.sax.Attributes;

public class QueueManager {
	static final String RERUNREQUESTONSTART = "rerunRequestOnStart";
	static final String ACQUISITIONTIMEOUT = "acquisitionTimeout";
	static final String MINPOOLSIZE = "minPoolSize";
	static final String MAXPOOLSIZE = "maxPoolSize";
	static final String PASSWORD = "password";
	static final String USER = "user";
	static final String URI = "url";
	static final String DRIVER = "driver";
	static final String MANAGERENABLED = "managerEnabled";
	
	private String rerunRequestOnStart;
	private int acquisitionTimeout;
	private int minPoolSize;
	private int maxPoolSize;
	private String password;
	private String user;
	private String url;
	private String driver;
	private String managerEnabled;
	
	public QueueManager(Attributes attr) {
		this.rerunRequestOnStart = Function.getAttribute(attr, RERUNREQUESTONSTART);
		this.acquisitionTimeout = Function.getAttributeInt(attr, ACQUISITIONTIMEOUT, -1);
		this.minPoolSize = Function.getAttributeInt(attr, MINPOOLSIZE, -1);
		this.maxPoolSize = Function.getAttributeInt(attr, MAXPOOLSIZE, -1);
		this.password = Function.getAttribute(attr, PASSWORD);
		this.user = Function.getAttribute(attr, USER);
		this.url = Function.getAttribute(attr, URI);
		this.driver = Function.getAttribute(attr, DRIVER);
		this.managerEnabled = Function.getAttribute(attr, MANAGERENABLED);
	}

	@Override
	public String toString() {
		return "--QueueManager--\n"
				+ "rerunRequestOnStart = [" + rerunRequestOnStart + "]\n"
				+ "\t acquisitionTimeout = [" + acquisitionTimeout + "]\n"
				+ "\t minPoolSize = [" + minPoolSize + "]\n"
				+ "\t maxPoolSize = [" + maxPoolSize + "]\n"
				+ "\t password = [" + password + "]\n"
				+ "\t user = [" + user + "]\n"
				+ "\t url = [" + url + "]\n"
				+ "\t driver = [" + driver + "]\n"
				+ "\t managerEnabled = [" + managerEnabled + "]\n";
	}

	public String getRerunRequestOnStart() {
		return rerunRequestOnStart;
	}

	public void setRerunRequestOnStart(String rerunRequestOnStart) {
		this.rerunRequestOnStart = rerunRequestOnStart;
	}

	public int getAcquisitionTimeout() {
		return acquisitionTimeout;
	}

	public void setAcquisitionTimeout(int acquisitionTimeout) {
		this.acquisitionTimeout = acquisitionTimeout;
	}

	public int getMinPoolSize() {
		return minPoolSize;
	}

	public void setMinPoolSize(int minPoolSize) {
		this.minPoolSize = minPoolSize;
	}

	public int getMaxPoolSize() {
		return maxPoolSize;
	}

	public void setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getManagerEnabled() {
		return managerEnabled;
	}

	public void setManagerEnabled(String managerEnabled) {
		this.managerEnabled = managerEnabled;
	}

}
