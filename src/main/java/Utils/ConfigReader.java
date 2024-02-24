package Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	Properties pro;
	
	public String propRead() {
		
		try {
		FileInputStream file=new FileInputStream("./src/main/java/Utils/browserconfig.properties");
		pro=new Properties();
		pro.load(file);
		
		}catch(Exception e) {
			System.out.println(e);
		}
		//System.out.println("property---"+pro.getProperty("browsername"));
		return pro.getProperty("browsername");
		
		
	}
	
	

}
