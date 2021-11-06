package XMLParser;

import java.util.ArrayList;

public class ConfigObject {
	private Engine engine;
	private Executor executor;
	private QueueManager queueManager;
	private ArrayList<DataSource> dataSource = new ArrayList<>();
	private ArrayList<Channel> channel = new ArrayList<>();
	
	public ConfigObject() {	}
	
	public ConfigObject(Engine engine) {
		super();
		this.engine = engine;
	}
	
	public ConfigObject(Executor executor) {
		super();
		this.executor = executor;
	}
	
	public ConfigObject(QueueManager queueManager) {
		super();
		this.queueManager = queueManager;
	}
	
	public ConfigObject(DataSource dataSource) {
		super();
		this.dataSource.add(dataSource);
	}
	
	public ConfigObject(Channel channel) {
		super();
		this.channel.add(channel);
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Executor getExecutor() {
		return executor;
	}

	public void setExecutor(Executor executor) {
		this.executor = executor;
	}

	public QueueManager getQueueManager() {
		return queueManager;
	}

	public void setQueueManager(QueueManager queueManager) {
		this.queueManager = queueManager;
	}

	public ArrayList<DataSource> getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource.add(dataSource);
	}

	public ArrayList<Channel> getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel.add(channel);
	}
	
}
