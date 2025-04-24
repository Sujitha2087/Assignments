package Week2Day4;

public class Safari extends Browser{

	public void readerMode()
	{
		System.out.println("Reader mode print");
	}
	public void fullScreenMode() 
	{
		System.out.println("fullScreenMode");
	}
	public static void main (String[] args)
	{
		Safari sf=new Safari();
		sf.browserName="Safari";
		sf.browserVersion ="13.3.100";
		sf.openURL();
		sf.closebrowser();
		sf.Navigateback();
		sf.readerMode();
		sf.fullScreenMode();
	}
}
