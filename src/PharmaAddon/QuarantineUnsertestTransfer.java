package PharmaAddon;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class QuarantineUnsertestTransfer {
	
	@Test(dataProvider="getDataForAccount")
	 public void UndertestTransfer(String ToWarehouse, String ToBinCode) throws SikuliException, FindFailed, InterruptedException {
		  
		  ImagePath.setBundlePath("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
		  ImagePath.add("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
			long startTime = System.nanoTime();
			methodToTime();
			Screen s=new Screen();
			Thread.sleep(2000);
			
			
			//Click on Under test Transfer
			s.click("UndertestTransfer.png");
			System.out.println("Clicked on the Undertest Transfer... ");
			Thread.sleep(1000);
			
			
			//Click on Yes Alert button
			s.doubleClick("YesAlertButton.png");
			System.out.println("Clicked on yes button... ");
			Thread.sleep(3000);
			
			//enter To Warehouse
			s.click("ToWarehouse.png"); 
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);		
			s.click("ToWarehouseEnter.png");
			//Thread.sleep(6000);
			
			 s.type("ToWarehouseEnterr.png", ToWarehouse);
			System.out.println("ToWarehouse Entered...==> " + ToWarehouse);			
			Thread.sleep(1000);
			s.click("Choose.png");
			Thread.sleep(2000);

			//Click on Yes Alert button
			//Thread.sleep(6000);
			s.click("YesAlertButton.png");
			System.out.println("Clicked on yes button... ");
			Thread.sleep(2000);

			//Click on bin button
			//Thread.sleep(6000);
			s.doubleClick("Binlocation.png");
			System.out.println("Clicked on bin button... ");
			Thread.sleep(2000);
			
			//Enter the bin location
			s.click("ToWarehouseEnter.png");
			System.out.println("Enter the bin location... ");
			Thread.sleep(2000);
			s.click("Choose.png");
			
			//Click on Yes Alert button
			Thread.sleep(1000);
			s.click("YesAlertButton.png");
			System.out.println("Clicked on yes button... ");
			Thread.sleep(2000);
					
			//Click on Container Selection button
			s.click("ContainerSelection.png");
			System.out.println("Clicked on Container Selection button... ");
			Thread.sleep(2000);
			
			 
			 
			//Click on ToBinCode button
			s.click("ToBinLocation.png");
			System.out.println("Clicked on ToBinLocation button... ");
			Thread.sleep(2000);
			
			//Click on ToBinLocationenter button
			s.click("ToBinLocationenter.png");
			System.out.println("Clicked on ToBinLocationenter button... ");
			
			 s.type("ContainerUndertestBin.png", ToBinCode);
			System.out.println("ToWarehouse Entered...==> " + ToBinCode);
			Thread.sleep(1000);
			s.click("Choose.png");
			
			//Click on UpdateSample button
			s.doubleClick("UpdateSample.png");
			System.out.println("Clicked on UpdateSample button... ");
			Thread.sleep(3000);
			
			
			//Click on ok button
			s.doubleClick("Containerok.png");
			System.out.println("Clicked on ok button... ");
			Thread.sleep(2000);
			
			//Click on Add button
			s.doubleClick("AddSample.png");
			System.out.println("Clicked on Add button... ");
			Thread.sleep(2000);
			
			//Click on Yes Alert button
			s.doubleClick("YesAlertButton.png");
			System.out.println("Clicked on yes button... ");
			Thread.sleep(4000);
			
				//Click on ok button
			s.doubleClick("Containerok.png");
			System.out.println("Clicked on ok button... ");
			Thread.sleep(4000);
			
			//Click on ok button
			s.doubleClick("Containerok.png");
			System.out.println("Clicked on ok button... ");
			Thread.sleep(6000);
			
			//Click on Under test Print button
			s.click("UnderTestPrint.png");
			System.out.println("Clicked on UndertestPrint button... ");
			Thread.sleep(20000);
			
			//Open the sample print file
			s.click("SamplePrintfile.png"); 
			Thread.sleep(20000);
			
						
			//Open the Close sample print file
			s.click("SamplePrintFileClose.png"); 
			Thread.sleep(2000);
			
			//Click on ok button
			s.click("Containerok.png");
			System.out.println("Clicked on ok button... ");
			Thread.sleep(2000);
			
			//Click on ok button
			s.click("Containerok.png");
			System.out.println("Clicked on ok button... ");
			Thread.sleep(2000);
			
			s.click("VScrollNew.png");
			System.out.println("Single click for Scroll..... ");
			Thread.sleep(2000);
						
			// Click on the ok Button 			
			s.click("ok.png"); 
			System.out.println("Clicked on the ok... ");
			Thread.sleep(4000);
			
			/*//Click on ok button
			s.click("Containerok.png");
			System.out.println("Clicked on ok button... ");
			Thread.sleep(2000);
			
			//Click on ok button
			s.click("Containerok.png");
			System.out.println("Clicked on ok button... ");
			Thread.sleep(2000);
			
			//Click on ok button
			s.click("Containerok.png");
			System.out.println("Clicked on ok button... ");
			Thread.sleep(2000);
			
			//Click on Close button
			s.click("CloseItem.png");
			System.out.println("Clicked on Close button... ");
			Thread.sleep(1000);*/
			
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
	    	Object data[][]=TestUtil.getTestData("UndertestTransfer");
	    	return data;
	    }

		


}
