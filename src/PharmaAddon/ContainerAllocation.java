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

public class ContainerAllocation {

	@Test (dataProvider="getDataForAccount")
	 public void ContainerAlloc(String ItemCode, String	BatchNo, String	BatchQuantity, String NoofContainer, String	ContainerFrom, String ContainerTo, String ContainerPrefix, String Weight, String UOM, String FromWarehouse, String ReceivingBin
) throws SikuliException, FindFailed, InterruptedException {
		  
		  ImagePath.setBundlePath("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
		  ImagePath.add("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
			long startTime = System.nanoTime();
			methodToTime();
			Screen s=new Screen();
			Thread.sleep(3000);
			
			//Click on Location
			s.click("Location.png"); 
			System.out.println("Clicked on Location for mfr date correction... ");
			Thread.sleep(2000);
			
			//Click on 1 for container allocation
			s.rightClick("ContainerAllocation.png"); 
			System.out.println("Clicked on the 1 for ... ");
			Thread.sleep(1000);
			
			//Click on 1 for container allocation
			s.click("ContainerAllocationSubMenu.png"); 
			System.out.println("Clicked on the ContainerAllocationSubMenu... ");
			Thread.sleep(1000);
			

			
			s.type((Key.BACKSPACE));
			Thread.sleep(1000);
			//Enter the no of container
			//String NoofContainer= "10";
			s.click("No of Containerv.png"); 
			//Thread.sleep(2000);
			s.type("No of Containerv.png", NoofContainer);
			//Thread.sleep(2000);
			System.out.println("NoofContainer Entered...==> " + NoofContainer);
			Thread.sleep(1000);
			
			//Enter the container Prefix
			s.click("Containerprefixbefore.png"); 
			//Thread.sleep(2000);
			//String ContainerPrefix= "Con_";
			//Thread.sleep(2000);
			s.type("ContainerPrefix.png", ContainerPrefix);
			//Thread.sleep(1000);
			System.out.println("ContainerPrefix Entered...==> " + ContainerPrefix);
			Thread.sleep(1000);
			

			//Enter the container From
			//s.type(Key.TAB, KeyModifier.SHIFT);
			//String ContainerFrom= "1";
			s.click("ContainerFrom.png"); 
			//Thread.sleep(2000);
			s.type("ContainerFrom.png", ContainerFrom);
			//Thread.sleep(2000);
			System.out.println("ContainerFrom Entered...==> " + ContainerFrom);
			Thread.sleep(1000);


			//Enter the container To
			s.type(Key.TAB, KeyModifier.SHIFT);
			//String ContainerTo= "10";
			//Thread.sleep(2000);
			s.type("ContainerTo.png", ContainerTo);
			//Thread.sleep(2000);
			System.out.println("ContainerTo Entered...==> " + ContainerTo);
			Thread.sleep(1000);
			
			//Enter the weight
			
			s.click("Weight.png"); 
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			//String Weight= "10";
			//Thread.sleep(2000);
			s.type("Weightenter.png", Weight);
			//Thread.sleep(2000);
			System.out.println("Weight Entered...==> " + Weight);
			Thread.sleep(1000);
			//s.type(Key.TAB, KeyModifier.SHIFT);
			
			//enter the receiving bin
			s.click("ReceivingBin.png"); 
			//Thread.sleep(1000);
			String ReceivinggBin= "*";
			//Thread.sleep(2000);
			s.type("Receivedqtyenter.png", ReceivinggBin);
			Thread.sleep(1000);
			s.type(Key.ENTER, KeyModifier.SHIFT);
			
						
			//Click on Add button
			s.click("AddContainer.png"); 
			System.out.println("Clicked on the AddContainer Button... ");
			Thread.sleep(1000);
			
			//Click on one
			s.click("ContainerAllocation.png"); 
			Thread.sleep(1000);
			
			/*//Click on one
			s.click("BatchAttribute.png"); 
			Thread.sleep(1000);
			
			//Click on one
			s.click("BatchAttributesearch.png"); 
			Thread.sleep(1000);*/
			
			//Click on ClickBatchAttribute
			s.click("ClickBatchAttribute.png"); 
			System.out.println("Clicked on the ClickBatchAttribute... ");
			Thread.sleep(2000);
			
			//Click on Update button
			s.click("Update.png"); 
			System.out.println("Clicked on the Update Button... ");
			Thread.sleep(2000);
			
			//Click on ok button
			s.click("Containerok.png"); 
			System.out.println("Clicked on the Update Button... ");
			Thread.sleep(2000);
			
			//Click on the Accounting tab 
			s.click("Acconting.png"); 
			System.out.println("Clicked on the Acconting tab... ");
			Thread.sleep(1000);
			
			//Click on the BPProject Button 		
			s.click("BPProject.png"); 
			System.out.println("Clicked on the BPProject... ");
			Thread.sleep(1000);
			
			//Click on the BPProjectAdd Button 		
			s.click("BPProjectadd.png"); 
			System.out.println("Clicked on the BPProjectadd... ");
			Thread.sleep(1000);
			
			//Click on the BPProjectChoose Button 		
			s.click("BPProjectChoose.png"); 
			System.out.println("Clicked on the Choose... ");
			Thread.sleep(1000);
			
			//Click on the Content Tab 		
			s.click("Content.png"); 
			System.out.println("Clicked on the Content... ");
			Thread.sleep(1000);
			
			/*
			// Click on the Content 			
			s.click("Content.png"); 
			System.out.println("Clicked on the Content... ");
			Thread.sleep(1000);
			
			// Click on the ItemArrow 			
			s.click("ItemArrow.png"); 
			System.out.println("Clicked on the ItemArrow... ");
			Thread.sleep(3000);
			
			// Click on the Inventory Button 			
			s.click("Inventory.png"); 
			System.out.println("Clicked on the Inventory Tab... ");
			Thread.sleep(1000);
			
			// Click on the ChosseItemgrp Button 			
			s.click("ChosseItemgrp.png"); 
			System.out.println("Clicked on the ChosseItemgrp... ");
			Thread.sleep(1000);
			
			// Click on the ItemGrpList Button 			
			s.click("ItemGrouplist.png"); 
			System.out.println("Clicked on the ItemGroup list... ");
			Thread.sleep(1000);
			
			 // Scroll for Add Button......			
			s.click("VScrollNew.png");
			System.out.println("Single click for Scroll..... ");
			Thread.sleep(1000);
			
			// Click on the Update Button 			
		    s.click("ok.png"); 
			System.out.println("Clicked on the Update... ");
			Thread.sleep(1000);
			
			// Click on the ok Button 			
		    s.click("okitem.png"); 
			System.out.println("Clicked on the Update... ");
			Thread.sleep(2000);
			*/
			 // Scroll for Add Button......			
			s.click("VScrollNew.png");
			System.out.println("Single click for Scroll..... ");
			Thread.sleep(2000);
			
			// Click on the Add Button 			
		    s.click("AddGRPO.png"); 
			System.out.println("Clicked on the Acconting Tab... ");
			Thread.sleep(2000);
			//Click on Yes button
			
			s.click("YesAlertButton.png"); 
			System.out.println("Clicked on the yes Button... ");
			Thread.sleep(2000);
		
						
			s.click("CloseGRPO.png"); 
			System.out.println("Clicked on Close Button to enable the Copy to button... ");
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
	    	Object data[][]=TestUtil.getTestData("ContainerAllocation");
	    	return data;
	    }

}
			

