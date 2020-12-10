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

public class GoodsReceipt {
	
	@Test (dataProvider="getDataForAccount")
	 public void GoodReceipt(String Vendor, String Name,String VendorRefNo, String PostingDate, String DueDate, String DocumentDate, String	DocumentType, String RowNumber, String ItemNo, String ItemServiceDescription, String ReceivedQty, String Quantity, String UnitPrice, String Discount, String Whse,String DistributionRule, String Project, String TaxCode) throws SikuliException, FindFailed, InterruptedException {
		  
		  ImagePath.setBundlePath("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
		  ImagePath.add("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
			long startTime = System.nanoTime();
			methodToTime();
			Screen s=new Screen();
			Thread.sleep(1000);
			
			//Click on Purchasing A/P
			s.click("PurchaseOrderMenu.png");
			System.out.println("Clicked on the Purchase Order Menu... ");
			Thread.sleep(1000);
			/*
		    //Click on Back Button for Goods receipt
			s.click("BackButton.png");
			System.out.println("Clicked on the Back Button... ");
			Thread.sleep(1000);
			
			 // Scroll for Copyto Button......			
			s.click("VScrollNew.png");
			System.out.println("Single click for Scroll..... ");
			Thread.sleep(1000);
			
			//Click on Copy To buttton
			s.click("CopyTo.png");
			System.out.println("Clicked on the Copy to button... ");
			Thread.sleep(1000);
							
			//Click on GRPO Button
			s.click("GRPOButton.png");
			System.out.println("Clicked on the GRPO Button... ");
			Thread.sleep(1000);*/

			//Click on GRPO Menu
			s.click("GRPOMenu.png");
			System.out.println("Clicked on the GRPO Menu... ");
			Thread.sleep(1000);

			//Enter the Vendor 
			s.click("POVendor.png");
			Thread.sleep(1000);
			s.type("POVendor.png", Vendor);
			Thread.sleep(1000);
			s.click("Enter.png");
			System.out.println("POVendor Entered...==> " + Vendor);
			Thread.sleep(2000);
			
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
						
			//Enter Due Date
			s.click("DueDate.png");
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			s.type("PostingDateEnter.png", DueDate);
			System.out.println("DeliveryDate Entered...==> " + DueDate);
			Thread.sleep(3000);
			
			//Enter Document Date
			s.click("DocumentDateGRPO.png");
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			s.type("PostingDateEnter.png", DocumentDate);
			System.out.println("DocumentDate Entered...==> " + DocumentDate);
			Thread.sleep(3000);
			
			// Scroll for CopyFrom Button......			
			s.click("VScrollNew.png");
			System.out.println("Single click for Scroll..... ");
			Thread.sleep(1000);
			
			//Click on CopyFrom butoon
			s.click("CopyFrom.png");
			System.out.println("click on CopyFrom..... ");
			Thread.sleep(1000);
			
			//Click on PurchaseOrders 
			s.click("PurchaseOrders.png");
			System.out.println("click on PurchaseOrders..... ");
			Thread.sleep(1000);
			
			//Choose  PurchaseOrder 
			s.click("SeaachPO.png");
			Thread.sleep(1000);
			s.click("ChoosePO.png");
			Thread.sleep(1000);
			s.click("FinishPO.png");
			Thread.sleep(1000);
			s.click("Nopo.png");
			
			Thread.sleep(1000);
			
			s.click("ContentGRPO.png");
			Thread.sleep(1000);
			
			/*
			//Enter the Item
			s.click("ItemPO.png");
			s.type("ItemPO.png", ItemNo);
			System.out.println("ItemPO Entered...==> " + ItemNo);
			Thread.sleep(2000);
			*/
			//Enter the ReceivedQty
			s.click("RecievedQty.png");
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			s.type("RecievedQtyEnter.png", ReceivedQty);
			//Thread.sleep(3000);
			System.out.println("RecievedQty Entered...==> " + ReceivedQty);
			
		
			 // Scroll for Add Button......	
			Thread.sleep(1000);
			s.click("VScrollGRPO.png");
			System.out.println("Single click for Scroll..... ");
			Thread.sleep(1000);
			
			Thread.sleep(1000);
			s.click("VScrollGRPO2.png");
			System.out.println("Single click for Scroll..... ");
			Thread.sleep(1000);
			
						
			// Click on the Add Button 			
			s.click("AddGRPO.png"); 
			System.out.println("Clicked on the Add Button... ");
			Thread.sleep(1000);
						
			//Click on Yes button
			s.click("YesAlertButton.png"); 
			System.out.println("Clicked on the yes Button... ");
			Thread.sleep(2000);
			
			//Click on Maximize Batch button
			//s.click("MaximizeBatch.png"); 
			//System.out.println("Clicked on Maximize Batch button... ");
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
	    	Object data[][]=TestUtil.getTestData("GoodsReceipt");
	    	return data;
	    }



}
