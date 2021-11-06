package XMLParser;

import java.io.File;

public class Main {

	public static void main(String[] args){ 
		String jndiName = "jdbc/oracle/scott";
		String channelName = "hiraChannel";
		File file = new File("C:\\Temp\\config.xml");
		
		try {
			ConfigParser rp = new ConfigParser(file);
			
			ConfigObject config = rp.getConfigObject();
			System.out.println(rp.getEngine());
			System.out.println(rp.getExecutor());
			System.out.println(rp.getQueueManager());
			System.out.println(rp.getDataSource());
			System.out.println(rp.getDataSource(jndiName));
			System.out.println(rp.getChannel());
			System.out.println(rp.getChannel(channelName));
		} catch(Exception e) {
			e.printStackTrace();
		}
    }
	

}
