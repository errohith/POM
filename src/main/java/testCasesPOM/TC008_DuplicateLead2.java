package testCasesPOM;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagesPOM.MyHomePage;
import wdMethods.Annotations;

public class TC008_DuplicateLead2 extends Annotations {
	
	@BeforeTest
	public void setValues() {
		excelName = "CHANGES";//rOHITH
		testCaseName = "duplicateLead";
		testDescription = "DuplicateLead";
		category = "Smoke";
		author = "Rohith";
		moduleName = "Lead";
	}

	@Test(dataProvider = "getData")
	/* groups="smoke" */
	public void duplicateLead(String fname,String cname) throws Exception {
		
		new MyHomePage()
		.clickLeads()
		.clickFindlead()
		.FirstName(fname)
		.FindLead()
		.sleep()
		.Firstlink()
		.Duplicate()
		.companyname(cname)
		.update()
		.verfiyDuplicateLead(cname);
		
	}	
		
}
