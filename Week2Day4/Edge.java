package Week2Day4;

public class Edge extends Browser{

	public void takesnap()
	{
		System.out.println("take the snap");
	}
	public void  clearcookies()
	{
		System.out.println("Clear the Cookies");
	}
	public static void main (String[] args)
	{
		Edge er=new Edge();
		er.browserName="Edge";
		er.browserVersion ="13.3.34.100";
		er.openURL();
		er.closebrowser();
		er.Navigateback();
		er.takesnap();
		er.clearcookies();
	}
}
