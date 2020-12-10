package PharmaAddon;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Batches {
	 
	@Test (dataProvider="getDataForAccount")
	 public void BatchCreation(String BatchAttribute1, String	Qty, String	Batch, String ExpirationDate, String MfrDate) throws SikuliException, FindFailed, InterruptedException {
		  
		  ImagePath.setBundlePath("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
		  ImagePath.add("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
			long startTime = System.nanoTime();
			methodToTime();
			Screen s=new Screen();
			Thread.sleep(3000);
			
			//Enter the Batch Name
			s.click("Batch.png");
			s.type("Batch.png", Batch);
			//Thread.sleep(3000);
			System.out.println("Batch Entered...==> " + Batch);
			Thread.sleep(1000);
			
			//Enter the BatchAttribute1
			s.click("BatchAttribute1.png");
			s.type("BatchAttribute1Enter.png", BatchAttribute1);
			//Thread.sleep(3000);
			System.out.println("BatchAttribute1 Entered...==> " + BatchAttribute1);
			Thread.sleep(1000);
			
			
			
			s.type(Key.TAB, KeyModifier.SHIFT);
			s.type(Key.TAB, KeyModifier.SHIFT);
			Thread.sleep(1000);
			s.type(Key.TAB, KeyModifier.SHIFT);
			Thread.sleep(1000);
			s.type(Key.TAB, KeyModifier.SHIFT);
			Thread.sleep(1000);
			
			//Enter the Expiry Date
			//String ExpiryDate= "010124";
			//s.click("ExpiryDate.png");
		    //Thread.sleep(1000);
			s.type("ExpiryDate.png", ExpirationDate);
			//Thread.sleep(1000);
			s.type(Key.TAB, KeyModifier.SHIFT);
			System.out.println("ExpiryDate Entered...==> " + ExpirationDate);
			Thread.sleep(2000);
			
			//Enter the Mfr Date
			//String MfrDate= "141020";
			s.type(Key.TAB, KeyModifier.SHIFT);
		    //Thread.sleep(1000);
			s.type("MfrDate.png", MfrDate);
			//Thread.sleep(1000);
			s.type(Key.TAB, KeyModifier.SHIFT);
			System.out.println("MfrDate Entered...==> " + MfrDate);
			Thread.sleep(2000);
			
			
			
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
		
		@DataProvider
	    public Object[][] getDataForAccount()          // Will get data from TestUtil class method.
	    {
	    	Object data[][]=TestUtil.getTestData("Batches");
	    	return data;
	    }

}
