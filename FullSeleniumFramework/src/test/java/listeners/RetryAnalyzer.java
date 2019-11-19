/* 
 * This class is called when tests fail and need to be rerun again
 */

package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
 
public class RetryAnalyzer implements IRetryAnalyzer {
 
  private int retryCount = 0;								//Retries counter = 0
  private static final int maxRetryCount = 3;				//Maximum retries = 3
 
  
  public boolean retry(ITestResult result) {				//Function that is returning true of false 
    if (retryCount < maxRetryCount) {						//Checking if counter is less than maxRetryCount
      retryCount++;											//If not less increasing the counter and running the retry again
      return true;
    }
    return false;
  }
}
