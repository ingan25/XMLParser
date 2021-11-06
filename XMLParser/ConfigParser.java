package XMLParser;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class ConfigParser extends DefaultHandler{
	static final String CONFIG = "config";
	static final String[] NODE = {"engine", "executor", "queueManager", "dataSource", "channel"};
	static final String ENGINE = "engine";
	static final String EXECUTOR = "executor";
	static final String QUEUEMANAGER = "queueManager";
	static final String DATASOURCE = "datasource";
	static final String CHANNEL = "channel";
	
	private final Map<String, ConfigObject> maps = Collections.synchronizedMap(new LinkedHashMap<String, ConfigObject>());
	
	private SAXParserFactory spf;
	private SAXParser saxp;
	private ConfigObject ro = new ConfigObject();
	
	public ConfigParser(File configFile) throws Exception  {
		super();
		parse(configFile);
	}

	public void parse(File configFile) throws Exception {
		synchronized(maps){
			if(maps.size() > 0){
				maps.clear();
			}
			spf = SAXParserFactory.newInstance();
			saxp = spf.newSAXParser();
			saxp.parse(configFile, this);
		}
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attr) throws SAXException {
		if(ENGINE.equals(qName)){
			try{
				Engine engine = new Engine(attr);
				
				ro.setEngine(engine);
				
				maps.put(ENGINE, ro);
			} catch(Exception e){
				System.out.println("Engine 변수값 오류:" + e.toString());
			}
		} else if(EXECUTOR.equals(qName)) {
			try{
				Executor executor = new Executor(attr);
				
				ro.setExecutor(executor);
				
				maps.put(EXECUTOR, ro);
			} catch(Exception e){
				System.out.println("Executor 변수값 오류:" + e.toString());
			}
		} else if(QUEUEMANAGER.equals(qName)) {
			try{
				QueueManager queueManager = new QueueManager(attr);
				
				ro.setQueueManager(queueManager);
				
				maps.put(QUEUEMANAGER, ro);
			} catch(Exception e){
				System.out.println("QueueManager 변수값 오류:" + e.toString());
			}
		} else if(DATASOURCE.equals(qName)) {
			try{
				DataSource dataSource = new DataSource(attr);
				
				ro.setDataSource(dataSource);
				
				maps.put(DATASOURCE, ro);
			} catch(Exception e){
				System.out.println("DataSource 변수값 오류:" + e.toString());
				e.printStackTrace();
			}
		} else if(CHANNEL.equals(qName)) {
			try{
				Channel channel = new Channel(attr);
				
				ro.setChannel(channel);

				maps.put(CHANNEL, ro);
			} catch(Exception e){
				System.out.println("Channel 변수값 오류:" + e.toString());
			}
		}
	}
	
	public Engine getEngine() {
		return ro.getEngine();
	}
	
	public Executor getExecutor() {
		return ro.getExecutor();
	}
	
	public QueueManager getQueueManager() {
		return ro.getQueueManager();
	}
	
	public ArrayList<DataSource> getDataSource() {
		return ro.getDataSource();
	}
	
	public DataSource getDataSource(String name) {
		int size = ro.getDataSource().size();
		for(int i=0; i<size; i++) {
			if(ro.getDataSource().get(i).getJndiName().equals(name)) {
				return ro.getDataSource().get(i);
			}
		}
		return null;
	}

	public ArrayList<Channel> getChannel() {
		return ro.getChannel();
	}
	
	public Channel getChannel(String name) {
		int size = ro.getChannel().size();
		for(int i=0; i<size; i++) {
			if(ro.getChannel().get(i).getName().equals(name)) {
				return ro.getChannel().get(i);
			}
		}
		return null;
	}
	
	public ConfigObject getConfigObject() {
		return ro;
	}
}
