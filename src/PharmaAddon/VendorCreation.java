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

public class VendorCreation {
	
	@Test(dataProvider="getDataForAccount")
	 public void CreateVendor(String BPCode, String BPName, String BPType, String GroupCode, String Telephone1, String Currency, String AddressType,
			 String	AddressName, String Street, String Block, String ZipCode, String City, String Country, String State, 
			 String	BuildingFloorRoom, String	AddressName2, String AddressName3, String StreetNo, String GSTIN,String	GSTType) throws SikuliException, FindFailed, InterruptedException {
								
		  ImagePath.setBundlePath("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
		  ImagePath.add("C:\\Users\\admin\\eclipse-workspace\\SAPWindowsPharmaAddonApplication\\ImageFiles");
			long startTime = System.nanoTime();
			methodToTime();
			Screen s=new Screen();
			Thread.sleep(1000);
			
			//Click on BusinessPartnerMenu main menu			
			s.click("BusinessPartnersMenu.png");
			System.out.println("Clicked on the BusinessPartners Menu... ");
			Thread.sleep(1000);
			
			//Click on Vendor sub menu
			s.click("VendorMenu.png");
			System.out.println("Clicked on the Vendor Menu... ");
			Thread.sleep(1000);
			
			//Click on add button to add vendorNo
			s.click("AddIcon.png");
			System.out.println("Clicked on the Add Icon... ");
			
			//Enter the Vendor code
			s.click("Code.png");
			s.type("Code.png", BPCode);
			System.out.println("Code Entered...==> " + BPCode);
			Thread.sleep(2000);
			
			String BPT = BPType.trim().toUpperCase();
			if(BPT.equalsIgnoreCase("VENDOR"))
			{
			
				//Click on the Vendor type menu
				s.click("Type.png");
				System.out.println("Clicked on the vendor type selection... ");
				Thread.sleep(1000);
				
				//Choose Vendor
				s.click("Vendor.png");
				System.out.println("Choose the vendor... ");
				Thread.sleep(1000);		
			}
			
			else if(BPT.equalsIgnoreCase("LEAD"))
		
			{
			//Click on the Vendor type menu
			s.click("Type.png");
			System.out.println("Clicked on the vendor type selection... ");
			Thread.sleep(1000);
			
			//Choose Vendor
			s.click("Lead.png");
			System.out.println("Choose the Lead... ");
			Thread.sleep(1000);
			}
			
			else
			{
				System.out.println("Plese select the type... ");
				Thread.sleep(1000);
			}
			
			//Enter the Vendor Name
			s.click("VendorNameBusiness.png");
			s.type("VendorName.png", BPName);
			System.out.println("VendorName Entered...==> " + BPName);
			Thread.sleep(1000);
			
			//Enter the Tel1
			s.click("Tel1.png");
			s.type("Tel1.png", Telephone1);
			System.out.println("Telephone1 Entered...==> " + Telephone1);
			Thread.sleep(1000);
			
			String CU = Currency.trim().toUpperCase();
			if(CU.equalsIgnoreCase("BRITISH POUND"))
			{
			
				//Click on the Currency menu
				s.click("Currency.png");
				System.out.println("Clicked on the Currency... ");
				Thread.sleep(1000);
				
				//Choose British Pound
				s.click("BritishPound.png");
				System.out.println("Choose the BritishPound... ");
				Thread.sleep(1000);		
			}
			
			else if(BPT.equalsIgnoreCase("CANADIAN DOLLAR"))
		
			{
				//Click on the Currency menu
				s.click("Currency.png");
				System.out.println("Clicked on the Currency... ");
				Thread.sleep(1000);
				
				//Choose CanadianDollar
				s.click("CanadianDollar.png");
				System.out.println("Choose the CanadianDollar... ");
				Thread.sleep(1000);	
			}
			
			else if(BPT.equalsIgnoreCase("EURO"))
				
			{
				//Click on the Currency menu
				s.click("Currency.png");
				System.out.println("Clicked on the Currency... ");
				Thread.sleep(1000);
				
				//Choose Euro
				s.click("Euro.png");
				System.out.println("Choose the Euro... ");
				Thread.sleep(1000);	
			}
			
			else if(BPT.equalsIgnoreCase("US DOLLAR"))
				
			{
				//Click on the Currency menu
				s.click("Currency.png");
				System.out.println("Clicked on the Currency... ");
				Thread.sleep(1000);
				
				//Choose USDollar
				s.click("USDollar.png");
				System.out.println("Choose the USDollar... ");
				Thread.sleep(1000);	
			}
			
			else if(BPT.equalsIgnoreCase("ALL CURRENCIES"))
				
			{
				//Click on the Currency menu
				s.click("Currency.png");
				System.out.println("Clicked on the Currency... ");
				Thread.sleep(1000);
				
				//Choose AllCurrencies
				s.click("AllCurrencies.png");
				System.out.println("Choose the AllCurrencies... ");
				Thread.sleep(1000);	
			}
			
			else
			{
				System.out.println("Plese select the Currency... ");
				Thread.sleep(1000);
			}
		
			
			//Click on Contact Person Tab
			//s.click("ContactPersonMenu.png");
			//System.out.println("Clicked on the Contact Person Menu... ");
			//Thread.sleep(1000);
			
			//Enter the contact ID
			//String ContactID= "Cont002";
			//s.click("ContactID.png");
			//s.type("ContactID.png", ContactID);
			//System.out.println("ContactID Entered...==> " + ContactID);
			//Thread.sleep(1000);
			
			//Click on Address Tab
			s.click("AddressButton.png");
			System.out.println("Choose the Address Button... ");
			Thread.sleep(1000);
			
			//Enter the Pay to AddressID
			String AddressID= "test001";
			s.click("AddressID.png");
			Thread.sleep(1000);
			s.type(Key.BACKSPACE);
			Thread.sleep(1000);
			s.type("AddressIDenter.png", AddressID);
			System.out.println("AddressID Entered...==> " + AddressID);
			Thread.sleep(1000);
			
			//Enter the Pay to AddressName
			s.click("AddressName2.png");
			s.type("AddressName2Enter.png", AddressName);
			System.out.println("AddressName Entered...==> " + AddressName);
			Thread.sleep(1000);
			
			//Enter the Street
			s.click("Street.png");
			s.type("StreetEnter.png", Street);
		    System.out.println("Street Entered...==> " + Street);
			Thread.sleep(2000);
			
			//Enter the Block
			s.click("Block.png");
			s.type("BlockEnter.png", Block);
		    System.out.println("Block Entered...==> " + Block);
			Thread.sleep(2000);
			
			//Enter the ZipCode
			s.click("ZipCode.png");
			s.type("ZipCodeEnter.png", ZipCode);
		    System.out.println("ZipCode Entered...==> " + ZipCode);
			Thread.sleep(2000);
		
			//Enter the City
			s.click("PayCity.png");
			s.type("PayCity.png", City);
			System.out.println("City Entered...==> " + City);
			Thread.sleep(2000);
			
			//Enter the Country
			s.click("Country.png");
			s.type("CountryEnter.png", Country);
			System.out.println("Country Entered...==> " + Country);
			Thread.sleep(2000);
			
			//Enter the State
			String PayState= "Uttar Pradesh";
			s.click("PayState.png");
			s.type("PayState.png", PayState);
			System.out.println("PayState Entered...==> " + PayState);
			Thread.sleep(3000);
			
			//Enter the BFRoom
			s.click("BFRoom.png");
			s.type("BFRoomEnter.png", BuildingFloorRoom);
			System.out.println("BFRoom Entered...==> " + BuildingFloorRoom);
			Thread.sleep(3000);
			
			//Scroll down to enter the GSTIN and GSTType
			s.click("VScrollVendor.png");
			System.out.println("Single click for Scroll..... ");
			Thread.sleep(3000);
			
			//Enter the GSTIN
			s.click("GSTIN.png");
			s.type("GSTINEnter.png", GSTIN);
			System.out.println("GSTIN Entered...==> " + GSTIN);
			Thread.sleep(3000);
			
			String GSTT = GSTType.trim().toUpperCase();
			if(GSTT.equalsIgnoreCase("CASUAL TAXABLE PERSON"))
			{
			
				//Enter the GSTType
				s.click("GSTType.png");
				s.click("CasualTaxablePerson.png");
				System.out.println("GSTType Entered...==> " + GSTT);
				Thread.sleep(2000);
				
			}
			
			else if(GSTT.equalsIgnoreCase("COMPOSITION LEVY"))
		
			{
				//Enter the GSTType
				s.click("GSTType.png");
				s.click("CompositionLevy.png");
				System.out.println("GSTType Entered...==> " + GSTT);
				Thread.sleep(2000);
			}
			
			else if(GSTT.equalsIgnoreCase("GOVERNMENT DEPARTMENT OR PSU"))
				
			{
				
				//Enter the GSTType
				s.click("GSTType.png");
				s.click("GovernmentDepartmentorPSU.png");
				System.out.println("GSTType Entered...==> " + GSTT);
				Thread.sleep(2000);
				
			}
			
			else if(GSTT.equalsIgnoreCase("NON RESIDENT TAXABLE PERSON"))
				
			{
				//Enter the GSTType
				s.click("GSTType.png");
				s.click("NonResidentTaxablePerson.png");
				System.out.println("GSTType Entered...==> " + GSTT);
				Thread.sleep(2000);
					
			}
			
			else if(GSTT.equalsIgnoreCase("Regular/TDS/ISD"))
				
			{
				//Enter the GSTType
				s.click("GSTType.png");
				s.click("ReguralTDSIDS.png");
				System.out.println("GSTType Entered...==> " + GSTT);
				Thread.sleep(2000);
					
			}
			else if(GSTT.equalsIgnoreCase("UN AGENCY OR EMBASSY"))
				
			{
				//Enter the GSTType
				s.click("GSTType.png");
				s.click("UNAgency.png");
				System.out.println("GSTType Entered...==> " + GSTT);
				Thread.sleep(2000);
			}
			
			else
			{
				System.out.println("Plese select the GSTType... ");
				Thread.sleep(1000);
			}
		
			
			//Click on the Payto button
			s.click("ClickPay.png"); 
			System.out.println("Clicked on the PayTo... ");
			Thread.sleep(2000);
			
			//Click on the Shipto button to copy payto data
			s.click("ShipTo.png"); 
			System.out.println("Clicked on the Ship To copy Menu... ");
			Thread.sleep(2000);
			
			s.click("VScrollNew.png");
			System.out.println("Single click for Scroll..... ");
			Thread.sleep(1000);
			
			// Click on the Add Button 			
			s.click("AddVendor.png"); 
			System.out.println("Clicked on the Add Button... ");
			Thread.sleep(3000);
			
			//Close the Vendor Screen
			s.click("CloseVendor.png"); 
			System.out.println("Clicked on the Close Button... ");
			Thread.sleep(3000);
			
			//Click on BusinessPartnerMenu main menu			
			s.click("BusinessPartnersMenu.png");
			System.out.println("Clicked on the BusinessPartners Menu... ");
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
	    	Object data[][]=TestUtil.getTestData("VendorCreation");
	    	return data;
	    }

}
