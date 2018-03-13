package myfristJavaProjectPackage1;

public class StringDemoclass {

	public static void main(String[] args) {
		
		String url = "http://www.FB.com";
		
		String url2 = "http://www.google.com";
		
		System.out.println("String first is " +url+ " String second is "+url2);
		
		//int length = url.length()+url2.length();
		int le =url.length();
		String lc = url.toLowerCase();
		System.out.println(lc);
		
		
		boolean logo = url.contains("//");
		System.out.println(logo);
		
		char i = url.charAt(5);
		
		//System.out.println(length);
		
	}

}
