package day9.classroom;

import org.testng.annotations.Test;

public class test001  extends Annotations{
	@Test
	public void createLead() {
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
		driver.findElementByLinkText("Leads").click();
		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();
		// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Test Leaf");
		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Preethi");
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Sylvia");
		// Click on Create Lead (Submit) button
		driver.findElementByClassName("smallSubmit").click();
	}

}
