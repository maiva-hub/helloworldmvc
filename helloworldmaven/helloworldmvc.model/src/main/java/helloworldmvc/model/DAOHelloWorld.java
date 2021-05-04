package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {
	private static String FileName= "‪C:\\Users\\media\\Documents\\HelloWorld.txt";
	private static DAOHelloWorld instance =null;
	private String helloWorldMessage = null;
	private DAOHelloWorld() {
		
	}
	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}
	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
	private void readFile() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(FileName));
		String line;
		while ((line = in.readLine()) != null)
		{
	      // Afficher le contenu du fichier
			  System.out.println (line);
		}
		in.close();
		
	}
	public static DAOHelloWorld getInstance() {
		return instance;
	}
	public static void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}
	

}
