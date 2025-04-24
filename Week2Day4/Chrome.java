package Week2Day4;

public class Chrome extends Browser{

	public void openIncognito()
	{
		System.out.println("Open the openIncognito()");
	}
	public void  clearCache() 
	{
		System.out.println("Clear the cache");
	}
	public static void main (String[] args)
	{
		Chrome cr=new Chrome();
		cr.browserName="Chrome";
		cr.browserVersion ="11.3";
		cr.openURL();
		cr.closebrowser();
		cr.Navigateback();
		cr.openIncognito();
		cr.clearCache();
	}
	}

