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

public class PurchaseOrder {

	@Test (dataProvider="getDataForAccount")
	 public void ContainerAlloc(String Vendor, String Name, String VendorRefNo, String PostingDate,String DeliveryDate, String DocumentDate, String	DocumentType, String RowNumber, String ItemNo, String ItemServiceDescription, String Quantity, String UnitPrice, String Discount, String Whse, String DistributionRule, String Project, String TaxCode, String UOMName) throws SikuliException, FindFailed, InterruptedException {
		  
		  ImagePath.setBundlePath("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
		  ImagePath.add("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
			long startTime = System.nanoTime();
			methodToTime();
			Screen s=new Screen();
			Thread.sleep(3000);
		
			//Click on Purchasing A/P
			s.click("PurchaseOrderMenu.png");
			System.out.println("Clicked on the Purchase Order Menu... ");
			Thread.sleep(1000);
			
			//Click on Purchasing Order menu
			s.click("PurchaseOrderSubMenu.png");
			System.out.println("Clicked on the PurchaseOrder SubMenu... ");
			Thread.sleep(1000);
			
			//s.click("MaximizePO.png");
			//System.out.println("Maximize the PO... ");
			//Thread.sleep(7000);
			
			//Enter the Vendor 
			s.click("POVendor.png");
			Thread.sleep(1000);
			s.type("POVendor.png", Vendor);
			System.out.println("POVendor Entered...==> " + Vendor);
			Thread.sleep(2000);
			
			//Enter the Name 
			//s.click("POVendorNamepo.png");
			//Thread.sleep(1000);
			//s.type(Key.BACKSPACE);
			//Thread.sleep(1000);
			//s.type("POVendorNamepoenter.png", Name);
			//System.out.println("POVendorName Entered...==> " + Name);
			//Thread.sleep(2000);
			
			//Enter the Vendor Ref No.
			s.click("VendorRefNo.png");
			s.type("VendorRefNo.png", VendorRefNo);
			System.out.println("VendorRefNo Entered...==> " + VendorRefNo);
			Thread.sleep(2000);
			
			//Enter Posting Date
			s.click("PostingDate.png");
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			s.type("PostingDateEnter.png", PostingDate);
			System.out.println("PostingDate Entered...==> " + PostingDate);
			Thread.sleep(3000);
						
			//Enter Delivery Date
			s.click("DeliveryDate.png");
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			s.type("PostingDateEnter.png", DeliveryDate);
			System.out.println("DeliveryDate Entered...==> " + DeliveryDate);
			Thread.sleep(3000);
			
			//Enter Document Date
			s.click("DocumentDate.png");
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			s.type("PostingDateEnter.png", DocumentDate);
			System.out.println("DocumentDate Entered...==> " + DocumentDate);
			Thread.sleep(3000);
			
			//Enter the ItemType dropdown
			s.click("ItemType.png");
			String DT = DocumentType.trim().toUpperCase();
			
			//Choose the item group
			if(DT.equalsIgnoreCase("ITEM"))
			{
			Thread.sleep(1000);
			s.click("Item.png");
			System.out.println("Clicked on the Item... ");
			Thread.sleep(1000);
			} 
			else if(DT.equalsIgnoreCase("SERVICE"))
			{
			
			Thread.sleep(1000);
			s.click("Service.png");
			System.out.println("Clicked on the Service... ");
			Thread.sleep(1000);
			}
			else
			{
				System.out.println("Please select DocumentType First.. ");
			}
			
          
        	  //Enter the Item
			s.click("ItemPO.png");
			s.type("ItemPO.png", ItemNo);
			System.out.println("ItemPO Entered...==> " + ItemNo);
			Thread.sleep(2000);
			
			//Enter the Quantity
			s.click("Quantity.png");
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			s.type("QuantityEnter.png", Quantity);
			System.out.println("Quantity Entered...==> " + Quantity);
			Thread.sleep(3000);
			
			//Enter the Unit Price
			s.click("UnitPrice.png");
			s.type("UnitPrice.png", UnitPrice);
			System.out.println("UnitPrice Entered...==> " + UnitPrice);
			Thread.sleep(3000);
			
			//Enter the Discount
			s.click("Discount.png");
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			s.type("DiscountEnter.png", Discount);
			System.out.println("Discount Entered...==> " + Discount);
			Thread.sleep(3000);
			
			//Enter the Tax Code
			s.click("TaxCode.png");
			s.click("TaxCodeButton.png");
			Thread.sleep(1000);
			s.type("TaxCodeFind.png", TaxCode);
			System.out.println("TaxCode Entered...==> " + TaxCode);
			Thread.sleep(1000);
			s.click("Choose.png");
			
			
			//enter the warehouse
			s.click("Warehouse.png");
			s.click("WarehouseEnter.png");
			Thread.sleep(1000);
			s.click("FindWarehouse.png");
			s.type("FindWarehouse.png", Whse);
			System.out.println("Warehouse Entered...==> " + Whse);
			
			//Click on choose 
			s.click("Choose.png");
			System.out.println("Clicked on choose button...==> ");
			Thread.sleep(1000);
			
			//Enter the DistributionRule
			s.click("Dimension1.png");
			s.click("SearchDimention1.png");
			s.type("FindDimention1.png", DistributionRule);
			System.out.println("DistributionRule Entered...==> " + DistributionRule);
			s.click("Choose.png");
			Thread.sleep(3000);
						
			//Enter the Project
			s.click("Project.png");
			Thread.sleep(1000);
			s.click("SearchProject.png");
			Thread.sleep(1000);
			s.type("FindDimention1.png", Project);
			System.out.println("Project Entered...==> " + Project);
			s.click("Choose.png");
			Thread.sleep(3000);
			
			//Enter HSN
			s.click("HSN.png");
			System.out.println("Clicked on HSN button...==> ");
			s.click("HSNButton.png");
			s.click("Choose.png");
			System.out.println("Clicked on choose button...==> ");
			Thread.sleep(2000);
			
			//Enter UOMName
			s.click("UOMName.png");
			System.out.println("Clicked on UOMName button...==> ");
			s.type("UOMNameEnter.png", UOMName);
			System.out.println("UOMName Entered...==> " + UOMName);
			Thread.sleep(2000);
          
			 // Scroll for add Button......			
			s.click("VScrollNew.png");
			System.out.println("Single click for Scroll..... ");
			Thread.sleep(1000);
		
			
			// Click on the Add Button 			
			s.click("AddVendor.png"); 
			System.out.println("Clicked on the Add Button... ");
			Thread.sleep(3000);
			
			// Click on the close Button 			
			s.click("ClosePO.png"); 
			System.out.println("Close PO... ");
			Thread.sleep(2000);
			
			//Click on Purchasing A/P
			s.click("PurchaseOrderMenu.png");
			System.out.println("Clicked on the Purchase Order Menu... ");
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
	    	Object data[][]=TestUtil.getTestData("PurchaseOrder");
	    	return data;
	    }

}
