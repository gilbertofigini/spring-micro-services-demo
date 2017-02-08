package it.gf.demo.spring.micro;

public class Main {
	public static void main(String[] args) {
//		String serverName = "NO-VALUE";
		System.out.println("test");
		switch (args.length) {
			default:
				usage();
				return;
		}
	}
	
	protected static void usage() {
		System.out.println("Usage: java -jar ... <server-name> [server-port]");
		System.out.println(
				"     where server-name is 'reg', 'registration', " + "'accounts' or 'web' and server-port > 1024");
	}

}
