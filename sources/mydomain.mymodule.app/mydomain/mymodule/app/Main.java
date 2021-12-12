package mydomain.mymodule.app; 
public class Main{
	public static void main(String[] args){
		System.out.println(Main.class);
		try(InputStream i = Main.class.getResourceAsStream("name.txt")){
			BufferedReader r = new BufferedReader(new InputStreamReader(i));
			String name = r.readLine();
			mydomain.mymodule.Main.greet(name);
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}
}
