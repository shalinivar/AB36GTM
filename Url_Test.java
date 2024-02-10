package find_links;

import java.net.MalformedURLException;
import java.net.URL;

//Program for the predefined class in selenium called URL class//to findout broken links in the website
public class Url_Test {

	public static void main(String[] args) throws MalformedURLException 
	{
		
       URL u1=new URL("https://www.google.com/");
       System.out.println(u1.getHost());
       System.out.println(u1.getPath());
       System.out.println(u1.getPort());
       System.out.println (u1.getProtocol());
	//This is prerequist topic of finding out broken links in the website
		
		
		
	}

}
//result in the console you got
//www.google.com is the host
// path is /
// port is -1
//Protocol is https