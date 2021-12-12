package mydomain.mymodule;
import java.io.*;
public class Main{
	public static void main(String[] args){
		System.out.println(Main.class);
	}
	public static void greet(String name) throws IOException {
		try(InputStream i = Main.class.getResourceAsStream("greeting.txt")){
			BufferedReader r = new BufferedReader(new InputStreamReader(i));
			String greeting = r.readLine();
			System.out.printf("%s %s!\n", greeting, name);
		}
	}
}
