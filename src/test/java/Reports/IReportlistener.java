package Reports;

import java.util.List;
import java.util.Map;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class IReportlistener implements IReporter {

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		for(ISuite suite:suites){
			String s=suite.getName();
			Map<String, ISuiteResult> suiteresult = suite.getResults();
			for(ISuiteResult sr:suiteresult.values()){
				ITestContext tc = sr.getTestContext();
				System.out.println("passed test suite"+s+tc.getPassedTests().getAllResults());
				System.out.println("Failed test suite"+s+tc.getFailedTests().getAllResults());
				System.out.println("Skipped test suite"+s+tc.getSkippedTests().getAllResults());
				
			}
			
			
			}

		
	}

	
}
