package binding_TestRail;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestRailManager {
    public static String TEST_RUN_ID = "8";
    public static String TESTRAIL_USERNAME = "lbarrera@solvd.com";
    public static String TESTRAIL_PASSWORD = "Bruno2022!";
    public static String RAILS_ENGINE_URL = "https://a2r.testrail.io/";

    public static final int TEST_CASE_PASSED_STATUS = 1;
    public static final int TEST_CASE_FAILED_STATUS = 5;

    public static void addResultForTestCase(String testCaseId, int status, String error) throws IOException, APIException {
        String testRunId = TEST_RUN_ID;

        APIClient client = new APIClient(RAILS_ENGINE_URL);
        client.setUser(TESTRAIL_USERNAME);
        client.setPassword(TESTRAIL_PASSWORD);
        Map data = new HashMap();
        data.put("status_id", status);
        if (status == 1) {
            data.put("comment", "Test Executed - Status updated automatically via integration with Selenium and Jenkins. Test Succesfully Passed");
        } else if (status == 5) {
            data.put("comment", "Test Executed and Failed - Status updated automatically via integration with Selenium and Jenkins. Error: " + error);
        }
        client.sendPost("add_result_for_case/" + testRunId + "/" + testCaseId + "", data);
    }
}