package XMLParser;

import org.xml.sax.Attributes;

public class Executor {
	static final String EXECUTETHREADMAXSIZE = "executeThreadMaxSize";
	static final String EXECUTEQUEUEMAXSIZE = "executeQueueMaxSize";
	
	private int executeThreadMaxSize;
	private int executeQueueMaxSize;
	
	Executor(Attributes attr) {
		this.executeThreadMaxSize = Function.getAttributeInt(attr, EXECUTETHREADMAXSIZE, -1);
		this.executeQueueMaxSize = Function.getAttributeInt(attr, EXECUTEQUEUEMAXSIZE, -1);
	}
	
	
	public int getExecuteThreadMaxSize() {
		return executeThreadMaxSize;
	}
	public void setExecuteThreadMaxSize(int executeThreadMaxSize) {
		this.executeThreadMaxSize = executeThreadMaxSize;
	}
	public int getExecuteQueueMaxSize() {
		return executeQueueMaxSize;
	}
	public void setExecuteQueueMaxSize(int executeQueueMaxSize) {
		this.executeQueueMaxSize = executeQueueMaxSize;
	}
	@Override
	public String toString() {
		return "--Executor--\n"
				+ "executeThreadMaxSize = [" + executeThreadMaxSize + "]\n" 
				+ "\t executeQueueMaxSize = [" + executeQueueMaxSize+ "]\n";
	}
	
	
}
