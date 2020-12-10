package PharmaAddon;

import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

public class APInvoice {

	@Test
	 public void ApiInvoice() throws SikuliException, FindFailed, InterruptedException {
		  
	ImagePath.setBundlePath("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
	ImagePath.add("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
	long startTime = System.nanoTime();
	methodToTime();
	Screen s=new Screen();
	Thread.sleep(4000);
	
	//Click on GRPO Menu
	s.click("GRPOMenu.png");
	System.out.println("Clicked on the GRPO Menu... ");
	Thread.sleep(2000);
	
	//Click on Back
	s.click("BackButton.png");
	System.out.println("Clicked on the Purchase Order Menu... ");
	Thread.sleep(1000);
		
	// Scroll for add Button......
	s.click("VScrollNew.png");
	System.out.println("Single click for Scroll..... ");
	Thread.sleep(1000);
	 
	//Click on Copy To buttton
	s.click("CopyTo.png");
	System.out.println("Clicked on the Copy to button... ");
	Thread.sleep(1000);
	
	//Click on A/P Invoice 
	s.click("Apinvoice.png");
	System.out.println("Clicked on the Apinvoice button... ");
	Thread.sleep(3000);
					
	// Scroll for add Button......
	s.click("VScrollApInvoice.png");
	System.out.println("Single click for Scroll..... ");
	Thread.sleep(1000);
		
	// Click on the Add Button 			
	s.click("AddVendor.png"); 
	System.out.println("Clicked on the Add Button... ");
	Thread.sleep(2000);
	
	//Click on Yes button
	s.click("YesAlertButton.png"); 
	System.out.println("Clicked on the yes Button... ");
	Thread.sleep(2000);
	
	//Click on ok button
		//s.click("OKApInvoice.png"); 
		//System.out.println("Clicked on the ok Button... ");
		//Thread.sleep(2000);
		
	//Click on CloseApInvoice button
	s.click("CloseApInvoice.png"); 
	System.out.println("Clicked on the CloseApInvoice Button... ");
	Thread.sleep(2000);
				
	//Click on ok button
	//s.click("ok.png"); 
	//System.out.println("Clicked on the CloseApInvoice Button... ");
	//Thread.sleep(1000);
	
	long endTime = System.nanoTime();		 
    long durationInNano = (endTime - startTime);  //Total execution time in nano seconds
    //Same duration in millis	     
    long durationInMillis = TimeUnit.NANOSECONDS.toMillis(durationInNano);  //Total execution time in nano seconds	     
    System.out.println("Total Execution time is ::==>"+durationInNano);
    System.out.println("Total Execution time is ::==>"+durationInMillis);
    long seconds = TimeUnit.MILLISECONDS.toSeconds(durationInMillis);
    System.out.format("%d Milliseconds = %d Seconds\n", durationInMillis, seconds );
    System.out.println("Or");
    long minutes = TimeUnit.SECONDS.toMinutes(seconds);
    System.out.format("%d seconds = %d minutes", seconds, minutes );
  
}

public int getRandomIntege2(int aStart, int aEnd) {
	Random aRandom = new  Random();
	if ( aStart > aEnd ) {
		throw new IllegalArgumentException("Start cannot exceed End.");
	}
	//get the range, casting to long to avoid overflow problems
	long range = (long)aEnd - (long)aStart + 1;
	// compute a fraction of the range, 0 <= frac < range
	long fraction = (long)(range * aRandom.nextDouble());
	int randomNumber =  (int)(fraction + aStart);    
	return randomNumber;

}
public String randomString( int len ) 
{
	String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	Random rnd = new Random();
	StringBuilder sb = new StringBuilder( len );
	for( int i = 0; i < len; i++ ) 
		sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
	return sb.toString();
}

public String randomInteger( int len ) 
{
	String AB = "123654789";
	Random rnd = new Random();
	StringBuilder sb = new StringBuilder( len );
	for( int i = 0; i < len; i++ ) 
		sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
	return sb.toString();
}

private static void methodToTime() {
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

}



	

}
