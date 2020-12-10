package PharmaAddon;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class AddonLogin {
	
	
	@Test
	  public void LoginAppconnectAdddon() throws SikuliException, FindFailed, InterruptedException {
		 
		 ImagePath.setBundlePath("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
		   ImagePath.add("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
		  long startTime = System.nanoTime();
		   Screen s=new Screen();
		   Thread.sleep(4000);
			s.doubleClick("SAPIcon.png");
			System.out.println("Clicked on the SAP Business one Client Icon.. ");
			Thread.sleep(7000);

			// Enter User Id and Password.... 
			
			String UserId= "manager";
			s.click("UserID.png");
			Thread.sleep(1000);
			s.type("UserID.png", UserId);
			Thread.sleep(1000);
			System.out.println("UserId Entered...==> " + UserId);
			String Password= "1234";
			s.click("Password.png");
			s.type("Password.png", Password);
			System.out.println("Password Entered...==> " + Password);
			Thread.sleep(1000);
			// Click on the Ok Button 
			
			s.click("LoginOk.png"); 
			System.out.println("Clicked on the OK Button... ");
			Thread.sleep(12000);
			
			// ADDING PHARMA MENU... 
			
			// Clicked on the Administration Menu
			s.click("AdministrationMenu.png"); 
			System.out.println("Clicked on the Administration Menu... ");
			Thread.sleep(1000);
		   
			// Clicked on the AddON Sub Menu
			s.click("AddONMenu.png"); 
			System.out.println("Clicked on the AddON Sub Menu ... ");
			Thread.sleep(1000);
			
		
			// Clicked on the Addon Manager
			
			s.click("Addon Manager.png"); 
			System.out.println("Clicked on the ADD- ONS Sub Menu ... ");
			Thread.sleep(1000);
			
			// Select the grid level Select... 
			
			s.click("GridLevelSel.png"); 
			System.out.println("Clicked on Grid Level Row.. ... ");
			Thread.sleep(1000);
			
			// Click on The Start Button... 
			
			s.click("Add-onStart.png"); 
			System.out.println("Clicked on The Start Button.. ... ");
			Thread.sleep(3000);
			
			// Click on the Addon Button.. 
			
			s.click("Add-onOK.png"); 
			System.out.println("Clicked on The Ok Button.. ... ");
			
			
			Thread.sleep(20000);
			
			
			
			
			
			
			
			
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
