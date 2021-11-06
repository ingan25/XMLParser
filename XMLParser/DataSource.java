package XMLParser;

import org.xml.sax.Attributes;

public class DataSource {
	static final String ACQUISITIONTIMEOUT = "acquisitionTimeout";
	static final String MINPOOLSIZE = "minPoolSize";
	static final String MAXPOOLSIZE = "maxPoolSize";
	static final String PASSWORD = "password";
	static final String USER = "user";
	static final String URI = "url";
	static final String DRIVER = "driver";
	static final String TESTQUERY = "testQuery";
	static final String STMTCACHESIZE = "stmtCacheSize";
	static final String MAXIDLETIME = "maxIdleTime";
	static final String JNDINAME = "jndiName";
	static final String ACQUIREINCREMENT = "acquireIncrement";
	
	private int acquisitionTimeout;
	private int minPoolSize;
	private int maxPoolSize;
	private String password;
	private String user;
	private String url;
	private String driver;
	private String testQuery;
	private int stmtCacheSize;
	private int maxIdleTime;
	private String jndiName;
	private int acquireIncrement;
	
	public DataSource(Attributes attr) {
		this.acquisitionTimeout = Function.getAttributeInt(attr, ACQUISITIONTIMEOUT, -1);
		this.minPoolSize = Function.getAttributeInt(attr, MINPOOLSIZE, -1);
		this.maxPoolSize = Function.getAttributeInt(attr, MAXPOOLSIZE, -1);
		this.password = Function.getAttribute(attr, PASSWORD);
		this.user = Function.getAttribute(attr, USER);
		this.url = Function.getAttribute(attr, URI);
		this.driver = Function.getAttribute(attr, DRIVER);
		this.testQuery = Function.getAttribute(attr, TESTQUERY);
		this.stmtCacheSize = Function.getAttributeInt(attr, STMTCACHESIZE, -1);
		this.maxIdleTime = Function.getAttributeInt(attr, STMTCACHESIZE, -1);
		this.jndiName = Function.getAttribute(attr, JNDINAME);
		this.acquireIncrement = Function.getAttributeInt(attr, ACQUIREINCREMENT, -1);
	}

	@Override
	public String toString() {
		return "--DataSource--\n"
				+"acquisitionTimeout = [" + acquisitionTimeout + "]\n"
				+ "minPoolSize = [" + minPoolSize + "]\n"
				+ "maxPoolSize = [" + maxPoolSize + "]\n"
				+ "password = [" + password + "]\n"
				+ "user = [" + user + "]\n"
				+ "url = [" + url + "]\n"
				+ "driver = [" + driver + "]\n"
				+ "testQuery = [" + testQuery + "]\n"
				+ "stmtCacheSize = [" + stmtCacheSize + "]\n"
				+ "maxIdleTime = [" + maxIdleTime + "]\n"
				+ "jndiName = [" + jndiName + "]\n"
				+ "acquireIncrement = [" + acquireIncrement + "]\n";
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

	public String getTestQuery() {
		return testQuery;
	}

	public void setTestQuery(String testQuery) {
		this.testQuery = testQuery;
	}

	public int getStmtCacheSize() {
		return stmtCacheSize;
	}

	public void setStmtCacheSize(int stmtCacheSize) {
		this.stmtCacheSize = stmtCacheSize;
	}

	public int getMaxIdleTime() {
		return maxIdleTime;
	}

	public void setMaxIdleTime(int maxIdleTime) {
		this.maxIdleTime = maxIdleTime;
	}

	public String getJndiName() {
		return jndiName;
	}

	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
	}

	public int getAcquireIncrement() {
		return acquireIncrement;
	}

	public void setAcquireIncrement(int acquireIncrement) {
		this.acquireIncrement = acquireIncrement;
	}
	
}
