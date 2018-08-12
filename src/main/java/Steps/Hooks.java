package Steps;

import wdMethods.SeMethods;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends SeMethods {
	
	@Before
	public void before(Scenario Sc)
	{
		beginResult();
		startTest(Sc.getClass().getName(), Sc.getStatus());
		startTestIteration(Sc.getClass().getName(),"Rohith","Smoke");
		//String ScenarioName = Sc.getName();
		//System.out.println(ScenarioName);
		String RowId = Sc.getClass().getName();
		System.out.println(RowId);
	}
	@After
	public void after(Scenario Sc)
	{
		
		
		String TestCaseStatus = Sc.getStatus();
		System.out.println(TestCaseStatus);
		boolean FailedStatus = Sc.isFailed();
		System.out.println(FailedStatus);
	}
	

}
