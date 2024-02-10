package find_links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

   public class Links_all2  {
	   
   
  public static void main(String[] args) throws IOException
 {

	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	List<WebElement>list_link=driver.findElements(By.tagName("a"));
	int count=list_link.size();
	System.out.println(count);
	
	
	for(int i=0;i<count;i++)
	{
		WebElement link=   list_link.get(i);
		String url=   link.getAttribute("href");
		System.out.println(url);
		verify_the_link(url);
		
	}
	
 }
  //Here we have used HTTPURLConnection because it gives you lot of options like get response code.
   static void verify_the_link(String eachurl) throws IOException
   {   try
       {
	   URL u1=new URL(eachurl);
	   //we always upcast openconnection with HTTPURLConnection
	   HttpURLConnection w1  = (HttpURLConnection)  u1.openConnection();
	   w1.connect();//to check if the url is valid or not
	   
	   //Here we have used if & else because we are trying to verify
	   //here we have get response code so that we can know if the URL is valid or not
	   if(w1.getResponseCode()==200)
	   {
		   System.out.println("URL is Valid"+ w1.getResponseCode()+w1.getResponseMessage());
	   }
	   else
	   {
		   System.out.println("URL is InValid"+ w1.getResponseCode()+w1.getResponseMessage());
	   }
       }
       catch(MalformedURLException a1)
       {
    	   System.out.println("I have handled this because some href's have null value");
       }
   }
   
   }
   
   


 
