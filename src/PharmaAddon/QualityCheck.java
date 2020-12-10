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

public class QualityCheck {

	@Test(dataProvider="getDataForAccount")
	 public void QC(String Character, String Lower, String Status, String ApprovedBy,String ApprovedWhs, String RejectWhs, String RejectedBy, String RejectedQty, String OnHoldWhs, String	OnHoldedBy, String	OnHoldedQty, String ApprovedQty,String ToBinCode
) throws SikuliException, FindFailed, InterruptedException {
		  
		  ImagePath.setBundlePath("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
		  ImagePath.add("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
			long startTime = System.nanoTime();
			methodToTime();
			Screen s=new Screen();
			Thread.sleep(2000);
			
			//Scroll up to choose Purchase order menu
			for(int i=0; i<=20;i++)
			{
			System.out.println(i);
			s.click("POScroll.png");
			System.out.println("Single click for Scroll..... ");
			}
			
			//Click on Purchasing A/P
			s.click("PurchaseOrderMenu.png");
			System.out.println("Clicked on the Purchase Order Menu... ");
			Thread.sleep(1000);
			
			//Click on GRPO Menu
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
			Thread.sleep(2000);
			
			//Double Click for QC Check Screen
			s.doubleClick("RightClickSampling.png");
			System.out.println("Clicked on the RightClickSampling Menu... ");
			Thread.sleep(2000);
			
			//Enter the CharacterStatus		
			//String CharacterStatus= "OK";
			s.click("CharacterStatus.png");
			Thread.sleep(1000);
			s.type("CharacterStatus.png", Character);
			//Thread.sleep(3000);
		    System.out.println("CharacterStatus Entered...==> " + Character);
			Thread.sleep(1000);
			
			
			//Enter the AnalystName		
			s.click("AnalystName.png");
			//Thread.sleep(2000);
			s.click("SearchAnalyst.png");
			//Thread.sleep(2000);
			
			//Click on Choose
			Thread.sleep(1000);
			s.click("Choose.png");
			System.out.println("Clicked on Choose... ");
			Thread.sleep(1000);
			
			//Enter the AssayPotency		
			String AssayPotency= "98";
			s.click("AssayPotency.png");
			Thread.sleep(3000);
			s.type(Key.BACKSPACE);
			Thread.sleep(3000);
			s.type("AssayPotencyEnter.png", AssayPotency);
			Thread.sleep(3000);
		    System.out.println("AssayPotency Entered...==> " + AssayPotency);
			Thread.sleep(2000);
			
			//Enter the LOD		
			String LOD= "0.02";
			s.click("LOD.png");
			Thread.sleep(3000);
			s.type(Key.BACKSPACE);
			Thread.sleep(3000);
			s.type("AssayPotencyEnter.png", LOD);
			Thread.sleep(1000);
		    System.out.println("LOD Entered...==> " + LOD);
			Thread.sleep(2000);
			
			//Click on AssayPotencyUnit
			s.click("AssayPotencyUnit.png");
			System.out.println("Clicked on AssayPotencyUnit... ");
			Thread.sleep(1000);
			
			//Click on Unit
			s.click("Miligram.png");
			System.out.println("Clicked on Miligram... ");
			Thread.sleep(1000);
			
			//Click on LODUnit
			s.click("LODUnit.png");
			System.out.println("Clicked on LODUnit... ");
			Thread.sleep(1000);
			
			//Click on Unit
			s.click("Miligram.png");
			System.out.println("Clicked on Miligram... ");
			Thread.sleep(1000);
			
			//Click on UOM
			s.click("UOM.png");
			System.out.println("Clicked on UOM.. ");
			Thread.sleep(1000);
			
			//Click on UOMUnit
			s.click("UOMUnit.png");
			System.out.println("Clicked on UOMUnit... ");
			Thread.sleep(1000);
		

			//Click on PACK
			//s.click("PACK.png");
			//System.out.println("Clicked on PACK.. ");
			//Thread.sleep(1000);
			
			//Click on PackUnit
			//s.click("PACKUnit.png");
			//System.out.println("Clicked on PackUnit... ");
			//Thread.sleep(1000);
			
			//Click on SampleUOM
			//s.click("SampleUOM.png");
			//System.out.println("Clicked on SampleUOM.. ");
			//Thread.sleep(1000);
			
			//Click on SampleUOMUnit
			//s.click("SampleUOMUnit.png");
			//System.out.println("Clicked on SampleUOMUnit... ");
			//Thread.sleep(1000);
			
			//Click on Add
			s.click("AddContainer.png");
			System.out.println("Clicked on Add... ");
			Thread.sleep(1000);
			
			// Click on the ok Button 			
		    s.click("QCTestSetupok.png"); 
			System.out.println("Clicked on ok.. ");
			Thread.sleep(5000);
			
			//Click on UserChange button
			s.click("UserChange.png");
			System.out.println("Clicked on User Change button... ");
			Thread.sleep(1000);

			//Click on RoleChange button
			s.click("RoleChange.png");
			System.out.println("Clicked on Role Change button... ");
			Thread.sleep(1000);
			
			//Click on QA Role
			s.click("QA.png");
			System.out.println("Clicked on QA Role... ");
			Thread.sleep(1000);
						
			//Click on Update button
			s.click("UpdateRole.png");
			System.out.println("Clicked on UpdateRole... ");
			Thread.sleep(2000);
			

			//Click on YES button
			s.click("YesAlertButton.png"); 
			Thread.sleep(4000);
			
			//Click on ok button
			s.click("Containerok.png");
			System.out.println("Clicked on ok button... ");
			Thread.sleep(5000);
			

		
			// Click on the Container Button 			
		    s.click("Container.png"); 
			System.out.println("Clicked on Container.. ");
			Thread.sleep(5000);
		

			// Click on the SelectStatus Button 			
		    s.click("SelectStatus.png"); 
			System.out.println("Select the Status.. ");
			Thread.sleep(2000);
			
			String ST = Status.trim().toUpperCase();
			
			//Choose the item group
			if(ST.equalsIgnoreCase("APPROVED"))
			{
				// Click on the Approved 			
			    s.click("Approved.png"); 
				System.out.println("Click on Approved.. ");
				Thread.sleep(1000);
				
			} 
			else if(ST.equalsIgnoreCase("REJECTED"))
			{
			
				// Click on the Rejected 			
			    s.click("RejectedStatus.png"); 
				System.out.println("Click on Rejected.. ");
				Thread.sleep(1000);
				
			}
			
			else if(ST.equalsIgnoreCase("ONHOLD"))
			{
				// Click on the OnHold 			
			    s.click("OnHoldStatus.png"); 
				System.out.println("Click on OnHold.. ");
				Thread.sleep(1000);
				
			}
			
			
			else
			{
				System.out.println("Please select Status First.. ");
			}
			
			
			/*// Click on the ChangeStatus 			
		    s.click("ChangeStatus.png"); 
			System.out.println("Click on ChangeStatus.. ");
			Thread.sleep(2000);
			
			// Click on the Rejected 			
		    s.click("Rejected.png"); 
			System.out.println("Click on Rejected.. ");
			Thread.sleep(1000);
			
			
			// Click on the ChangeStatus 			
		    s.click("ChangeStatus.png"); 
			System.out.println("Click on ChangeStatus.. ");
			Thread.sleep(2000);
			
			// Click on the OnHold 			
		    s.click("OnHold.png"); 
			System.out.println("Click on OnHold.. ");
			Thread.sleep(1000);*/
			
			//Click on Add
			s.click("Add.png");
			System.out.println("Clicked on Add... ");
			Thread.sleep(2000);
			
			String STA = Status.trim().toUpperCase();
			
			//Choose the item group
			if(STA.equalsIgnoreCase("APPROVED"))
			{
				
				
				//Click on ApprovedBy
				s.click("ApprovedBy.png");
				System.out.println("Clicked on ApprovedBy... ");
				Thread.sleep(2000);
				
				//Click on SearchApprovedBy
				s.click("SearchApprovedBy.png");
				Thread.sleep(1000);
				s.type("FindApprovedBy.png", ApprovedBy);
				System.out.println("Clicked on SearchApprovedBy... ");
				Thread.sleep(2000);
				
				//Click on Choose
				s.click("Choose.png");
				System.out.println("Clicked on Choose... ");
				Thread.sleep(1000);
				
				//Click on Warehouse
				s.click("Wareho.png");
				System.out.println("Clicked on Warehouse... ");
				Thread.sleep(2000);
				
				//Click on SearchApproveByWarehouse
				s.click("SearchApprovedBy.png");
				s.type("ApprovedByWarehouse.png", ApprovedWhs);
				System.out.println("Clicked on SearchApprovedBy warehouse... ");
				Thread.sleep(3000);
				
				//Click on Choose
				s.click("Choose.png");
				System.out.println("Clicked on Choose... ");
				Thread.sleep(2000);
				
				//Click on PrintReport
				s.click("PrintReport.png");
				System.out.println("Clicked on PrintReport... ");
				Thread.sleep(2000);

				//Click on ApprovedPrint
				s.click("ApprovedPrint.png");
				System.out.println("Clicked on ApprovedPrint... ");
				Thread.sleep(1000);
				
				//Click on ApprovedLevelPrint
				s.click("ApprovedLevelPrint.png");
				System.out.println("Clicked on ApprovedLevelPrint... ");
				Thread.sleep(12000);
				
				//Open the Approved print file
				s.click("SamplePrintfile.png"); 
				Thread.sleep(3000);
				
							
				//Close Approved print file
				s.click("SamplePrintFileClose.png"); 
				Thread.sleep(2000);
				
				//Click on UpdateQCCheck
			s.click("UpdateQCCheck.png");
			System.out.println("Clicked on UpdateQCCheck... ");
			Thread.sleep(6000);
			
			// Click on the ok Button 			
		    //s.click("QCTestSetupok.png"); 
			//System.out.println("Clicked on ok.. ");
			//Thread.sleep(7000);
			 
				//Click on InventoryTransfer
			s.click("InventoryTransfer.png");
			System.out.println("Clicked on InventoryTransfer... ");
			Thread.sleep(2000);
			
			
			//Click on ContainerSelection
			s.click("ContainerSelection.png");
			System.out.println("Clicked on ContainerSelection... ");
			Thread.sleep(4000);
			
			//Click on Bin
			s.click("BinNew.png");
			System.out.println("Clicked on Bin... ");
			Thread.sleep(3000);
			
			//Search on Bin
			s.click("SearchBin.png");
			s.type("ApproveTransferBin.png", ToBinCode);
			System.out.println("Search on Bin... ");
			Thread.sleep(3000);
			
			
			
			//Click on Choose
			s.click("Choose.png");
			System.out.println("Clicked on Choose... ");
			Thread.sleep(2000);
			
			//Click on Add
			s.click("Add.png");
			System.out.println("Clicked on Add... ");
			Thread.sleep(3000);
			
			//Click on Add
			s.click("Add.png");
			System.out.println("Clicked on Add... ");
			Thread.sleep(3000);
			
			//Click on Add
			s.click("Add.png");
			System.out.println("Clicked on Add... ");
			Thread.sleep(3000);
			
			//Click on yes
			s.click("YesAlertButton.png");
			System.out.println("Clicked on yes... ");
			Thread.sleep(3000);
			
			// Click on the ok Button 			
		    s.click("OKQC.png"); 
			System.out.println("Clicked on ok.. ");
			Thread.sleep(4000);
			
			// Click on the Close Button 			
		    s.click("ClosedApprovedQC.png"); 
			System.out.println("Clicked on Close.. ");
			Thread.sleep(4000);
			
			// Click on the ok Button 			
		    s.click("OKQC.png"); 
			System.out.println("Clicked on ok.. ");
			Thread.sleep(4000);
			
				
			}
			
			else if(STA.equalsIgnoreCase("REJECTED"))
			
			{
				//Click on RejectedBy
				s.click("RejectedBy.png");
				System.out.println("Clicked on RejectedBy... ");
				Thread.sleep(2000);
				
				//Click on SearchRejectedBy
				s.click("SearchApprovedBy.png");
				s.type("FindApprovedBy.png", RejectedBy);
				System.out.println("Clicked on SearchRejectedBy... ");
				Thread.sleep(1000);
				
				//Click on Choose
				s.click("Choose.png");
				System.out.println("Clicked on Choose... ");
				Thread.sleep(2000);
				
				//Click on Warehouse
				s.click("Wareho.png");
				System.out.println("Clicked on Warehouse... ");
				Thread.sleep(2000);
				
				//Click on SearRejectedBy
				s.click("SearchApprovedBy.png");
				s.type("ApprovedByWarehouse.png", RejectWhs);
				System.out.println("Clicked on SearchRejectedBy... ");
				Thread.sleep(2000);
				
				//Click on Choose
				s.click("Choose.png");
				System.out.println("Clicked on Choose... ");
				Thread.sleep(2000);
				
				//Enter the TestRejectedStatus		
				String TestRejectedStatus= "Test failed";
				s.click("TestRejectedStatus.png");
				Thread.sleep(3000);
				s.type(Key.BACKSPACE);
				Thread.sleep(3000);
				s.type("ChangeRejectedStatus.png", TestRejectedStatus);
				Thread.sleep(1000);
			    System.out.println("CharacterStatus Entered...==> " + TestRejectedStatus);
				Thread.sleep(1000);
				
				//Click on PrintReport
				s.click("PrintReport.png");
				System.out.println("Clicked on PrintReport... ");
				Thread.sleep(2000);

				//Click on RejectedPrint
				s.click("RejectedPrint.png");
				System.out.println("Clicked on RejectedPrint... ");
				Thread.sleep(3000);
				
				//Click on RejectedLevelPrint
				s.click("RejectedLevelPrint.png");
				System.out.println("Clicked on RejectedLevelPrint... ");
				Thread.sleep(10000);
				
				//Open the Rejected print file
				s.click("SamplePrintfile.png"); 
				Thread.sleep(3000);
				
							
				//Close Rejected print file
				s.click("SamplePrintFileClose.png"); 
				Thread.sleep(2000);
				
				//Click on UpdateQCCheck
			s.click("UpdateQCCheck.png");
			System.out.println("Clicked on UpdateQCCheck... ");
			Thread.sleep(6000);
			
			// Click on the ok Button 			
		    //s.click("QCTestSetupok.png"); 
			//System.out.println("Clicked on ok.. ");
			//Thread.sleep(7000);
			 
			//Click on InventoryTransfer
			s.click("InventoryTransfer.png");
			System.out.println("Clicked on InventoryTransfer... ");
			Thread.sleep(4000);
			
			
			//Click on ContainerSelection
			s.click("ContainerSelection.png");
			System.out.println("Clicked on ContainerSelection... ");
			Thread.sleep(4000);
			
			//Click on Bin
			s.click("Binreject.png");
			System.out.println("Clicked on Bin... ");
			Thread.sleep(3000);
			
			//Search on Bin
			s.click("SearchBin.png");
			s.type("ApproveTransferBin.png", ToBinCode);
			System.out.println("Search on Bin... ");
			Thread.sleep(3000);
			
			//Click on Choose
			s.click("Choose.png");
			System.out.println("Clicked on Choose... ");
			Thread.sleep(3000);
			
			//Click on Add
			s.click("Add.png");
			System.out.println("Clicked on Add... ");
			Thread.sleep(4000);
			
			//Click on Add
			s.click("Add.png");
			System.out.println("Clicked on Add... ");
			Thread.sleep(4000);
			
			//Click on Add
			s.click("Add.png");
			System.out.println("Clicked on Add... ");
			Thread.sleep(4000);
			
			
			//Click on yes
			s.click("YesAlertButton.png");
			System.out.println("Clicked on yes... ");
			Thread.sleep(4000);
			
			// Click on the ok Button 			
		    s.click("OKQC.png"); 
			System.out.println("Clicked on ok.. ");
			Thread.sleep(4000);
			
			// Click on the Close Button 			
		    s.click("ClosedApprovedQC.png"); 
			System.out.println("Clicked on Close.. ");
			Thread.sleep(4000);
			
			// Click on the ok Button 			
		    s.click("OKQC.png"); 
			System.out.println("Clicked on ok.. ");
			Thread.sleep(4000);
			
				
				
				
			}
			
			else if (STA.equalsIgnoreCase("ONHOLD"))
			
			{
				//Click on OnHoldBy
				s.click("OnHoldBy.png");
				System.out.println("Clicked on OnHoldBy... ");
				Thread.sleep(1000);
				
				//Click on SearchOnHoldBy
				s.click("SearchApprovedBy.png");
				System.out.println("Clicked on SearchOnHoldBy... ");
				Thread.sleep(2000);
				
				//Click on Choose
				s.click("Choose.png");
				System.out.println("Clicked on Choose... ");
				Thread.sleep(1000);
				
				//Click on Warehouse
				s.click("Wareho.png");
				System.out.println("Clicked on Warehouse... ");
				Thread.sleep(2000);
				
				//Click on SearchOnHoldBy
				s.click("SearchApprovedBy.png");
				s.type("ApprovedByWarehouse.png", OnHoldWhs);
				System.out.println("Clicked on SearchOnHoldBy... ");
				Thread.sleep(2000);
				
				//Click on Choose
				s.click("Choose.png");
				System.out.println("Clicked on Choose... ");
				Thread.sleep(2000);
				
				//Enter the TestOnHoldStatus		
				String TestOnHoldStatus= "Test onhold";
				s.click("TestRejectedStatus.png");
				Thread.sleep(3000);
				s.type(Key.BACKSPACE);
				Thread.sleep(3000);
				s.type("ChangeRejectedStatus.png", TestOnHoldStatus);
				Thread.sleep(1000);
			    System.out.println("CharacterStatus Entered...==> " + TestOnHoldStatus);
				Thread.sleep(1000);
				
				//Click on PrintReport
				s.click("PrintReport.png");
				System.out.println("Clicked on PrintReport... ");
				Thread.sleep(2000);

				//Click on OnHoldPrint
				s.click("OnHoldPrint.png");
				System.out.println("Clicked on OnHoldPrint... ");
				Thread.sleep(3000);
				
				//Click on OnHoldLevelPrint
				s.click("OnHoldLevelPrint.png");
				System.out.println("Clicked on OnHoldLevelPrint... ");
				Thread.sleep(10000);
				
				//Open the OnHold print file
				s.click("SamplePrintfile.png"); 
				Thread.sleep(3000);
				
							
				//Close OnHold print file
				s.click("SamplePrintFileClose.png"); 
				Thread.sleep(2000);
				
				//Click on UpdateQCCheck
			s.click("UpdateQCCheck.png");
			System.out.println("Clicked on UpdateQCCheck... ");
			Thread.sleep(6000);
			
			// Click on the ok Button 			
		    //s.click("QCTestSetupok.png"); 
			//System.out.println("Clicked on ok.. ");
			//Thread.sleep(7000);
			 
				//Click on InventoryTransfer
			s.click("InventoryTransfer.png");
			System.out.println("Clicked on InventoryTransfer... ");
			Thread.sleep(4000);
			
			
			//Click on ContainerSelection
			s.click("ContainerSelection.png");
			System.out.println("Clicked on ContainerSelection... ");
			Thread.sleep(4000);
			
			//Click on Bin
			s.click("Binreject.png");
			System.out.println("Clicked on Bin... ");
			Thread.sleep(3000);
			
			//Search on Bin
			s.click("SearchBin.png");
			s.type("ApproveTransferBin.png", ToBinCode);
			System.out.println("Search on Bin... ");
			Thread.sleep(2000);
			
			//Click on Choose
			s.click("Choose.png");
			System.out.println("Clicked on Choose... ");
			Thread.sleep(2000);
			
			//Click on Add
			s.click("Add.png");
			System.out.println("Clicked on Add... ");
			Thread.sleep(2000);
			
			//Click on Add
			s.click("Add.png");
			System.out.println("Clicked on Add... ");
			Thread.sleep(2000);
			
			//Click on Add
			s.click("Add.png");
			System.out.println("Clicked on Add... ");
			Thread.sleep(2000);
			
			//Click on yes
			s.click("YesAlertButton.png");
			System.out.println("Clicked on yes... ");
			Thread.sleep(10000);
			
			// Click on the ok Button 			
		    s.click("OKQC.png"); 
			System.out.println("Clicked on ok.. ");
			Thread.sleep(7000);
			
				
				
			}
			
			else
			{
				System.out.println("CHoose values of Approved, Rejected, OnHold in foother... ");
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
		    	Object data[][]=TestUtil.getTestData("QualityCheck");
		    	return data;
		    }
	
}
