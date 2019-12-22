package day10.classroom;

import org.testng.annotations.Test;

public class Test003 extends Parameterization{
		@Test(dataProvider="getData")
		public void runCreateLead(String Cname,String firname,String lasname) {
			driver.findElementByClassName("decorativeSubmit").click();
			// Click on crm/sfa button
			driver.findElementByLinkText("CRM/SFA").click();
			// Click on Leads
			driver.findElementByLinkText("Leads").click();
			// Click on Create Lead button
			driver.findElementByLinkText("Create Lead").click();
			// Enter Company Name
			driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
			// Enter First Name
			driver.findElementById("createLeadForm_firstName").sendKeys(firname);
			// Enter Last Name
			driver.findElementById("createLeadForm_lastName").sendKeys(lasname);
			// Click on Create Lead (Submit) button
			driver.findElementByClassName("smallSubmit").click();
		}

	}



