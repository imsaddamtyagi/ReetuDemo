package PharmaAddon;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ItemCreation {
	@Test(dataProvider="getDataForAccount")
	 public void CreateItem(String ItemNo, String ItemDescription, String ForeignName, String ItemGroup, String	PurchaseItem, String SalesItem, String InventoryItem, String ValuationMethod,String InventoryUoM, String ManageItemBy, String ManagementMethod, String IssuePrimarilyBy, String SetGLAccountsBy ,String ItemType, String IssueMethod, String PlanningMethod, String	ProcurementMethod, String GSTRelevant, String MaterialType, String HSN, String TaxCategory, String RefSTPNo,String RetestSchedule, String PackingSize, String ShelfLifeMonths, String MRP, String YieldPerc, String PharmaGroup, String ContainerManaged, String QCCheckBox, String	SampleQuantity, String SampleUoM
) throws SikuliException, FindFailed, InterruptedException {
		  
		  ImagePath.setBundlePath("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
		  ImagePath.add("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
			long startTime = System.nanoTime();
			methodToTime();
			Screen s=new Screen();
			
			Thread.sleep(2000);
			//Click on Inventory Menu
			s.click("InventoryMenu.png");
			System.out.println("Clicked on the Inventory Menu... ");
			Thread.sleep(2000);
			
			//Click on Item Master Menu
			s.click("ItemMasterMenu.png");
			System.out.println("Clicked on the Item Master Data... ");
			Thread.sleep(2000);
			
			//Click on Add Button to add the item			
			s.click("AddIcon.png");
			System.out.println("Clicked on the Add Icon... ");
			Thread.sleep(1000);
			
			//Enter the Item Number 			
			s.click("ItemNumber.png");
			Thread.sleep(1000);
			s.type("ItemNumber.png", ItemNo);
			System.out.println("ItemNumber Entered...==> " + ItemNo);
			Thread.sleep(1000);
			
			//Enter the Item Description 			
			s.click("DescriptionItem.png");
			Thread.sleep(1000);
			s.type("DescriptionItementer.png", ItemDescription);
			System.out.println("DescriptionItem Entered...==> " + ItemDescription);
			Thread.sleep(2000);
			
			//Enter the ForeignName 			
			s.click("ForeignName.png");
			Thread.sleep(2000);
			s.type("ForeignNameEnter.png", ForeignName);
			System.out.println("ForeignName Entered...==> " + ForeignName);
			Thread.sleep(2000);
			
			//Click on the item group dropdown to Choose the Item group
			s.click("ItemGroupDropdown.png");
			System.out.println("Clicked on the Item Group Dropdown... ");
			Thread.sleep(2000);
			
			String ig = ItemGroup.trim().toUpperCase();
			
			//Choose the item group
			if(ig.equalsIgnoreCase("RAW MATERIAL"))
			{
			Thread.sleep(1000);
			s.click("RawMaterial.png");
			System.out.println("Clicked on the Item Group... ");
			Thread.sleep(1000);
			} 
			else if(ig.equalsIgnoreCase("PACKING MATERIAL"))
			{
			
			Thread.sleep(1000);
			s.click("Packing Material.png");
			System.out.println("Clicked on the Item Group... ");
			Thread.sleep(1000);
			}
			
			else if(ig.equalsIgnoreCase("SEMI FINISHED GOOD"))
			{
			Thread.sleep(1000);
			s.click("SemiFinishedGoods.png");
			System.out.println("Clicked on the Item Group... ");
			Thread.sleep(1000);
			}
			
			else if(ig.equalsIgnoreCase("FINISHED GOOD"))
			{
				Thread.sleep(1000);
			s.click("FinishedGoods.png");
			System.out.println("Clicked on the Item Group... ");
			Thread.sleep(1000);
			}
			else
			{
				System.out.println("Please select ItemGroup First.. ");
			}
			
			//Click on yes button to confirm
			s.click("YesAlertButton.png");
			System.out.println("Clicked on the Yes Alert Button... ");
			Thread.sleep(1000);
			
			String PI = PurchaseItem.trim().toUpperCase();
			if(PI.equalsIgnoreCase("N"))
			{
			s.click("PurchaseItem.png");
			System.out.println("Clicked on the PurchaseItem... ");
			Thread.sleep(1000);
			}
			
			String SI = SalesItem.trim().toUpperCase();
			if(SI.equalsIgnoreCase("N"))
			{
			s.click("SalesItem.png");
			System.out.println("Clicked on the SalesItem... ");
			Thread.sleep(1000);
			}
			
			String II = InventoryItem.trim().toUpperCase();
			if(II.equalsIgnoreCase("N"))
			{
			s.click("InventoryItem.png");
			System.out.println("Clicked on the InventoryItem... ");
			Thread.sleep(1000);
			}
			
			//Check the container checkbox
			s.click("ContainerCheckbox.png");
			System.out.println("Clicked on the Container Checkbox... ");
			Thread.sleep(1000);
		
			//Check the QCCheck checkbox
			s.click("QCCheckbox.png");
			System.out.println("Clicked on the QC Checkbox... ");
			Thread.sleep(1000);
			
			 
			//Go to the InventoryData tab
			s.click("InventoryData.png");
			System.out.println("Clicked on the InventoryData tab... ");
			Thread.sleep(1000);
			
			s.click("ValuationMethodEnter.png");
			Thread.sleep(1000);
			
			//Enter the ValuationMethod
			String VM = ValuationMethod.trim().toUpperCase();
			if(VM.equalsIgnoreCase("MOVING AVERAGE"))
			{
			
			
			//Enter the Moving Average
			s.click("Moving Average.png");
			Thread.sleep(1000);
			
			}
			
			else if(VM.equalsIgnoreCase("STANDARD"))
			{
			
			
			//Enter the Standard
			s.click("Standard.png");
			Thread.sleep(1000);
			
			}
			
			else if(VM.equalsIgnoreCase("FIFO"))
			{
			
			
			//Enter the FIFO
			s.click("FIFO.png");
			Thread.sleep(1000);
			
			}
			
			else
			{
				System.out.println("Please select ValuationMethod First.. ");
			}
			//Click on the SetGLAccountsBy
			s.click("SetGLAccountsBy.png");
			System.out.println("Clicked on the SetGLAccountsBy... ");
			Thread.sleep(1000);
			
			//enter the SetGLAccountsBy
			s.click("ItemGroups.png");
			System.out.println("Clicked on ItemGroups.. ");
			Thread.sleep(10000);
			
			//Enter the Inventory UOM
			//s.click("InventoryUOM.png");
			//Thread.sleep(1000);
			//s.click("InventoryUOMEnter.png");
			
			//s.type("InventoryUOMEnter.png",Key.TAB );
			//s.type(Key.TAB, KeyModifier.SHIFT);
			//s.type(Key.TAB);
			//s.type("FindInventoryUOM.png", InventoryUoM);
			//System.out.println("InventoryUOM Entered...==> " + InventoryUoM);
			//Thread.sleep(2000);
			
			//Go to the Planning Data tab
			s.click("PlanningData.png");
			System.out.println("Clicked on the PlanningData tab... ");
			Thread.sleep(1000);
			
			String PlanM = PlanningMethod.trim().toUpperCase();
			if(PlanM.equalsIgnoreCase("NONE"))
			{
			
				//Click on the PlanningMethod 
				s.click("PlanningMethod.png");
				System.out.println("Clicked on the PlanningMethod... ");
				Thread.sleep(1000);
				
			//Enter the PlanningMethod
			s.click("None.png");
			Thread.sleep(1000);
		
			}
			
			String PM = ProcurementMethod.trim().toUpperCase();
			if(PM.equalsIgnoreCase("MAKE"))
			{
			
				//Click on the ProcurementMethod 
				s.click("ProcurementMethod.png");
				System.out.println("Clicked on the ProcurementMethod... ");
				Thread.sleep(1000);
				
			//Enter the ProcurementMethod
			s.click("Make.png");
			Thread.sleep(1000);
		
			}
			
			//Go to GeneralTab
			s.click("GeneralTab.png");
			System.out.println("Clicked on the GeneralTab... ");
			Thread.sleep(1000);
			
			//Click on manage item by dropdown
			s.click("ManageItemByDropdown.png");
			System.out.println("Clicked on the Manage ItemBy Dropdown... ");
			Thread.sleep(1000);
			
			//Choose the manage item by
			s.click("ManageBy.png");
			System.out.println("Clicked on the Batches... ");
			Thread.sleep(1000);
			
			//check the gst checkbox
			s.click("GstCheckbox.png");
			System.out.println("Clicked on the Gst Checkbox... ");
			Thread.sleep(1000);

			String MT = MaterialType.trim().toUpperCase();
			if(MT.equalsIgnoreCase("FINISHED GOODS"))
			{
			
				//Click on the MaterialType 
				s.click("MaterialType.png");
				System.out.println("Clicked on the MaterialType... ");
				Thread.sleep(1000);
				
			//Enter the FinishedGood
			s.click("FinishedGood.png");
			System.out.println("Clicked on the FinishedGood... ");
			Thread.sleep(1000);
		
			}
			
			if(MT.equalsIgnoreCase("CAPITAL GOODS"))
			{
			
				//Click on the MaterialType 
				s.click("MaterialType.png");
				System.out.println("Clicked on the MaterialType... ");
				Thread.sleep(1000);
				
			//Enter the CapitalGoods
			s.click("CapitalGoods.png");
			System.out.println("Clicked on the CapitalGoods... ");
			Thread.sleep(1000);
		
			}
			
			
			//Enter the HSN
			s.click("HSNEnter.png");
			Thread.sleep(1000);
			
			s.click("HSNChoose.png");
			Thread.sleep(1000);
			
			s.click("HSNEnterchoose.png");
			Thread.sleep(1000);
			s.type("HSNEnterchoose.png", HSN);
			System.out.println("HSN Entered...==> " + HSN);
			Thread.sleep(2000);
			
			s.click("Choose.png");
			Thread.sleep(10000);
			
			
			s.click("RefSTPNoClick.png");
			Thread.sleep(1000);
			s.type("RefSTPNoEnter.png", RefSTPNo);
			System.out.println("RefSTPNo Entered...==> " + RefSTPNo);
			Thread.sleep(2000);
			
			s.click("RetestSceduleClick.png");
			Thread.sleep(1000);
			s.type("RetestSceduleEnter.png", RetestSchedule);
			System.out.println("RefSTPNo Entered...==> " + RetestSchedule);
			Thread.sleep(2000);
			
			//for (int i=1;i<5;i++)
			//{
			s.click("VScrollNew.png");
			Thread.sleep(1000);
			//}
			s.click("PackingSizeClick.png");
			Thread.sleep(1000);
			s.type("PackingSizeEnter.png", PackingSize);
			System.out.println("PackingSize Entered...==> " + PackingSize);
			Thread.sleep(2000);
			
			s.click("ShelfLifeMonthsClick.png");
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			s.type("ShelfLifeMonths.png", ShelfLifeMonths);
			System.out.println("ShelfLifeMonths Entered...==> " + ShelfLifeMonths);
			Thread.sleep(2000);
			
			s.click("MRPClick.png");
			Thread.sleep(1000);
			s.type("MRPEnter.png", MRP);
			System.out.println("MRP Entered...==> " + MRP);
			Thread.sleep(2000);
			
			s.click("YieldPercClick.png");
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			s.type("YieldPerc.png", YieldPerc);
			System.out.println("YieldPerc Entered...==> " + YieldPerc);
			Thread.sleep(2000);
			
			s.click("SampleQuantityitemclick.png");
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			s.type("SampleQuantityitemEnter.png", SampleQuantity);
			System.out.println("SampleQuantity Entered...==> " + SampleQuantity);
			Thread.sleep(2000);
			
			//s.click("UOMItemclick.png");
			//Thread.sleep(1000);
			//s.type("UOMEnter.png", SampleUoM);
			//System.out.println("SampleUoM Entered...==> " + SampleUoM);
			//Thread.sleep(2000);
			
			s.click("VScrollNew.png");
			System.out.println("Single click for Scroll..... ");
			Thread.sleep(1000);
			
			// Click on the Add Button 
			s.click("AddItem.png"); 
			System.out.println("Clicked on the Add Button... ");
			Thread.sleep(2000);
			
			//Close the Item screen
			s.click("CloseItem.png"); 
			System.out.println("Clicked on the close Button... ");
			Thread.sleep(2000);
			
			//scroll up to choose vendor creation menu			
			for(int i=0; i<=5;i++)
			{
			System.out.println(i);
			s.click("VendorScroll.png"); 
			System.out.println("Clicked on the scroll Button to get vendor menu... ");
			//Thread.sleep(1000);
			}
			
		
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
		    	Object data[][]=TestUtil.getTestData("ItemCreation");
		    	return data;
		    }

		 

}
