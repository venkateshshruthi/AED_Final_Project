/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;



/**
 *
 * @author samhitha
 */
public class SponsorApprovalStatus extends WorkRequest{
    
    private String testResult;

    //issue resolved with test result
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
