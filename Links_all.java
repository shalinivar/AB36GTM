package find_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_all {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement>list_link=driver.findElements(By.tagName("a"));
		int count=list_link.size();
		System.out.println(count);
		
		//printing all url
	  /*	for(int i=0;i<count;i++)
		{
			WebElement link=   list_link.get(i);
			String url=   link.getText();
			System.out.println(url);
		}*/
       // print url links text
		for(int i=0;i<count;i++)
		{
			WebElement link=   list_link.get(i);
			String url=   link.getAttribute("href");
			System.out.println(url);
		}
	//to get atrribute value based on it's attribute name : method name is getattribute
	}

}
