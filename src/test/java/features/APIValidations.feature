Feature: Validating rest API's
@AddObject @Regression
Scenario Outline: Verify if object is being Succesfully added using AddObjectAPI
	Given Add object Payload with "<name>"  "<cpumodel>" "<harddisksize>"
	When user calls "AddObjectAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	And "year" in response body is "2019"
	And verify Object is created "<name>" using "getobjectAPI"
	
Examples:
	|name 	 | cpumodel |harddisksize|
	|Apple MacBook Pro 178 |  Intel Core i9 |1 TB|


@DeleteObject @Regression
Scenario: Verify if Delete object functionality is working

	Given DeleteObject Payload
	When user calls "deleteOjectAPI" with "POST" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"