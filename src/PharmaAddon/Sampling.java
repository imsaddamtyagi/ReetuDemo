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

public class Sampling {
	
	@Test(dataProvider="getDataForAccount")
	 public void ItemSampling(String IngredientType, String	SampleQuantity, String SampleUoM, String SampleDate, String	SampleBy, String ContainerNo, String ContainerFrom, String ContainerTo, String Noofcontainer, String ARNo, String Quantity, String Quantity2
			 ) throws SikuliException, FindFailed, InterruptedException {
		  
		  ImagePath.setBundlePath("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
		  ImagePath.add("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
			long startTime = System.nanoTime();
			methodToTime();
			Screen s=new Screen();
			Thread.sleep(3000);
	
		
			//Click on GRPO Menu A/P
			s.click("GRPOMenu.png");
			System.out.println("Clicked on the GRPO Menu... ");
			Thread.sleep(1000);
			
			//Click on Back Button for Goods receipt
			s.click("BackButton.png");
			System.out.println("Clicked on the Back Button... ");
			Thread.sleep(1000);
			
		    //Click on 1 for sampling menu
			s.doubleClick("Samplingonebutton.png");
			System.out.println("Clicked on the 1 for sampling Menu... ");
			Thread.sleep(1000);
			
			//Right Click to choose sampling menu
			s.rightClick("RightClickSampling.png");
			System.out.println("Clicked on the RightClickSampling Menu... ");
			Thread.sleep(1000);
			
			//Click on Sampling menu
			s.click("Sampling.png");
			System.out.println("Clicked on the IngredientType Menu... ");
			Thread.sleep(1000);
			
			//Click on Ingredient Type
			s.click("IngredientType.png");
			System.out.println("Clicked on the IngredientType Menu... ");
			Thread.sleep(2000);
			
            String IT = IngredientType.trim().toUpperCase();
			
			
			if(IT.equalsIgnoreCase("ACTIVE"))
			{
				//Click on Active
				s.click("Active.png");
				System.out.println("Clicked on the Active subMenu... ");
				Thread.sleep(3000);
			} 
			else if(IT.equalsIgnoreCase("EXCIPIENT"))
			{
			
				//Click on Excipient
				s.click("Excipient.png");
				System.out.println("Clicked on the Excipient subMenu... ");
				Thread.sleep(3000);
			}
			
			else if(IT.equalsIgnoreCase("OTHER"))
			{
				//Click on other
				s.click("Other.png");
				System.out.println("Clicked on the other subMenu... ");
				Thread.sleep(3000);
			}
			else
			{
				System.out.println("Please select ItemGroup First.. ");
			}
			
			
			//enter the SampleBy
			s.click("SampledBy.png"); 
			Thread.sleep(1000);
			s.type("SamplebyEnter.png", SampleBy);
			System.out.println("SampleBy Entered...==> " + SampleBy);
			Thread.sleep(1000);
			
			//enter the SampleDate
			s.click("SampleDate.png"); 
			Thread.sleep(3000);
			System.out.println("SampleDate Entered...==> " + SampleDate);
			s.type("SampleDateEnter.png", SampleDate);
			Thread.sleep(1000);
			
			//enter the containerNo
			s.click("ContainerNo.png"); 
			s.type("ContainerNoEnter.png", ContainerNo);
			System.out.println("ContainerNo Entered...==> " + ContainerNo);
			Thread.sleep(1000);

			//enter the no of container
			s.click("Noofcont.png"); 
			s.type("Noofcont.png", Noofcontainer);
			System.out.println("Noofcontainer Entered...==> " + Noofcontainer);
			Thread.sleep(1000);
			
			//Add Sampling
			s.click("AddSample.png"); 
			Thread.sleep(3000);
			
			//Click on ok button
			s.click("okcontainer.png"); 
			Thread.sleep(3000);
			
			//Click on Container button
			s.click("ContainerSample.png"); 
			Thread.sleep(1000);
			
			
			
			//Click on Update button
			s.click("UpdateSample.png"); 
			Thread.sleep(3000);
			
			//Click on Update button
			s.click("UpdateSample.png");
			Thread.sleep(2000);
			
			//Click on Sample Issue button
			s.click("SampleIssue.png"); 
			Thread.sleep(2000);
			
			//Click on Container selection button
			s.click("ContainerSelection.png"); 
			Thread.sleep(4000);
			
			//Click on add button
			s.click("AddContainer.png"); 
			Thread.sleep(4000);
			
			//Click on add button
			s.click("AddContainer.png"); 
			Thread.sleep(2000);
			
			//Click on add button
			s.click("AddContainer.png"); 
			Thread.sleep(2000);
			
			//Click on add button
			s.click("YesAlertButton.png"); 
			Thread.sleep(4000);
			
			//Click on Ok
			s.click("ok.png"); 
			Thread.sleep(7000);
			
			//Click on Ok
			s.click("ok.png"); 
			Thread.sleep(7000);
			
			//Sample Print
			s.click("SamplePrint.png"); 
			Thread.sleep(30000);
			
			//Open the sample print file
			s.click("SamplePrintfile.png"); 
			Thread.sleep(2000);
			
						
			//Open the Close sample print file
			s.click("SamplePrintFileClose.png"); 
			Thread.sleep(20000);
			
			
			//Open the sample print file
			s.click("SamplePrintfile.png"); 
			Thread.sleep(2000);
			
			//Open the sample print file
			s.rightClick("SamplePrintfile.png"); 
			Thread.sleep(2000);
			
			//close the sample print file
			s.click("CloseWindow.png"); 
			Thread.sleep(2000);
			
			//Click on Ok
			//s.click("OKSamplebutton.png"); 
			//Thread.sleep(2000);
			
		
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
		    	Object data[][]=TestUtil.getTestData("Sampling");
		    	return data;
		    }


}
