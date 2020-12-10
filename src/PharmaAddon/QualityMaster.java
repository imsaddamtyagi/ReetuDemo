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

public class QualityMaster {
	
	@Test(dataProvider="getDataForAccount")
	 public void QCSetup(String ItemCode, String ItemName, String RefSTPNo, String EffectiveDate, String ParameterCode, String ParameterName, String EffectiveFromEnter, String EffectiveToEnter, String ResultDataType, String	UoM, String Character, String LowerMin, String LowerMax, String NormalInTransit, String	FGRM
) throws SikuliException, FindFailed, InterruptedException {
		  
		  ImagePath.setBundlePath("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
		  ImagePath.add("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
			long startTime = System.nanoTime();
			methodToTime();
			Screen s=new Screen();
			Thread.sleep(2000);
			
			//Click on UserChange button
			s.click("UserChange.png");
			System.out.println("Clicked on User Change button... ");
			Thread.sleep(1000);

			//Click on RoleChange button
			s.click("RoleChange.png");
			System.out.println("Clicked on Role Change button... ");
			Thread.sleep(1000);
			
			//Click on Admin Role
			s.click("AdminRole.png");
			System.out.println("Clicked on Admin Role... ");
			Thread.sleep(2000);
						
			//Click on ok button
			s.click("Containerok.png");
			System.out.println("Clicked on ok button... ");
			Thread.sleep(1000);
			

			//Click on yes button
			s.click("YesAlertButton.png"); 
			Thread.sleep(1000);
			
			//Click on ok button
			s.click("Containerok.png");
			System.out.println("Clicked on ok button... ");
			Thread.sleep(1000);
			
			//Click on Purchasing A/P
			s.click("PurchaseOrderMenu.png");
			System.out.println("Clicked on the Purchase Order Menu... ");
			Thread.sleep(1000);
				
			s.click("MenuBarScroll.png");
			System.out.println("Single click for Scroll..... ");
			Thread.sleep(1000);
			
			//Click on Uneecops add ons menu
			Thread.sleep(1000);
			s.click("Uneecops Add on.png");
			System.out.println("Clicked on Uneecops add ons menu... ");
			Thread.sleep(1000);
			
			//Click on Pharma Menu
			s.click("PharmaMenu.png");
			System.out.println("Clicked on Pharma Menu... ");
			Thread.sleep(1000);
			
			//Click on Master Role
			s.click("MasterMenu.png");
			System.out.println("Clicked on Master Menu... ");
			Thread.sleep(6000);
			
			//Click on QC TestSetup Menu
			s.click("QCTestSetup.png");
			System.out.println("Clicked on QCTestSetup Menu... ");
			Thread.sleep(1000);
			
			
			//Click on ItemCode
			s.click("SearchItemCode.png");
			System.out.println("Clicked on ItemCode... ");
			Thread.sleep(1000);
			
			//Enter the Item Code 			
			//String ItemCode= "Item14oct1";
			s.click("FindItemCode.png");
			s.type("FindItemCode.png", ItemCode);
			System.out.println("ItemCpde Entered...==> " + ItemCode);
			Thread.sleep(1000);
			
			//Click on Choose
			s.click("Choose.png");
			System.out.println("Clicked on Choose... ");
			Thread.sleep(1000);
			
			//Enter the RefSTPNo 			
			//String RefSTPNo= "test12";
			//s.click("RefSTPNo.png");
			//Thread.sleep(3000);
			//s.type("EnterRefSTPNo.png", RefSTPNo);
			//Thread.sleep(3000);
			//System.out.println("RefSTPNo Entered...==> " + RefSTPNo);
			//Thread.sleep(1000);
			
			//Click on ParameterCode
			s.click("ParameterCode.png");
			System.out.println("Clicked on ParameterCode... ");
			Thread.sleep(1000);
			
	
			//Enter the Parameter Code 			
			s.click("ParameterCodeSearch.png");
			Thread.sleep(1000);
			s.type("FindParameterCode.png", ParameterCode);
			//Thread.sleep(3000);
			System.out.println("ParameterCode Entered...==> " + ParameterCode);
			Thread.sleep(1000);
			
			//Click on Choose
			s.click("Choose.png");
			System.out.println("Clicked on Choose... ");
			Thread.sleep(2000);
			
			//Click on Effective From
			s.click("EffectiveFrom.png");
			System.out.println("Clicked on EffectiveFrom... ");
			Thread.sleep(1000);
			
			//Enter the EffectiveFrom 			
			//String EffectiveFromEnter= "14/10/2020";
			s.click("EffectiveFromEnter.png");
			//Thread.sleep(1000);
			s.type("EffectiveFromEnter.png", EffectiveFromEnter);
			//Thread.sleep(3000);
			System.out.println("EffectiveFromEnter Entered...==> " + EffectiveFromEnter);
			Thread.sleep(1000);
					
			//Click on Effective To
			s.click("EffectiveTo.png");
			System.out.println("Clicked on EffectiveTo... ");
			Thread.sleep(1000);
			
			//Enter the EffectiveToEnter 			
			//String EffectiveToEnter= "01/10/2026";//"TESTING";
			s.click("EffectiveToEnter.png");
			//Thread.sleep(1000);
			s.type("EffectiveToEnter.png", EffectiveToEnter);
			//Thread.sleep(3000);
		    System.out.println("EffectiveToEnter Entered...==> " + EffectiveToEnter);
			Thread.sleep(1000);
			
			//Click on ResultDataSet
			s.click("ResultDataSet.png");
			System.out.println("Clicked on ResultDataSet... ");
			Thread.sleep(1000);
			
			String RDT = ResultDataType.trim().toUpperCase();
			
			//Choose the item group
			if(RDT.equalsIgnoreCase("CHARACTER"))
			{
				//Click on Character
				s.click("Character.png");
				System.out.println("Clicked on Character... ");
				Thread.sleep(1000);
			} 
			else
			{
				System.out.println("Please select ResultDataType.. ");
			}
			
			
			
			//Enter the CharacterStatus		
			//String CharacterStatus= "OK";
			s.click("CharacterStatus.png");
			Thread.sleep(1000);
			s.type("CharacterStatus.png", Character);
			//Thread.sleep(3000);
		    System.out.println("CharacterStatus Entered...==> " + Character);
			Thread.sleep(1000);
			
			// Click on the Add Button 			
		    s.click("AddGRPO.png"); 
			System.out.println("Clicked on the Add.. ");
			Thread.sleep(3000);
			
			//Enter the EffectiveDate 			
			//String EffectiveDate= "14/10/2020";
			s.type("EffectiveDate.png", EffectiveDate);
			//Thread.sleep(3000);
			System.out.println("EffectiveDate Entered...==> " + EffectiveDate);
			Thread.sleep(2000);
			
			// Click on the Add Button 			
		    s.click("AddGRPO.png"); 
			System.out.println("Clicked on the Add.. ");
			Thread.sleep(2000);
			
			
			// Click on the ok Button 			
		    s.click("QCTestSetupok.png"); 
			System.out.println("Clicked on ok.. ");
			Thread.sleep(3000);
		
			// Close the testsetup screen 			
		    s.click("CloseTestSetup.png"); 
			System.out.println("Close the testsetup screen.. ");
			Thread.sleep(2000);
			
			// Close the No screen 			
		    s.click("No.png"); 
			System.out.println("Click on No.. ");
			Thread.sleep(1000);
			
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
		    	Object data[][]=TestUtil.getTestData("QualityMaster");
		    	return data;
		    }
	

}
