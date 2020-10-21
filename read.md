Assist a Purchase API
The purchase system helps in selecting and delivering the right solution. It serves both the customer as well as Philips personnel.

Index
Prerequisites
Compiling
Executing
APIs Created
Goal Set and Achieved
Prerequisites
Firstly, the project makes use of Spring Boot in order to build the source files and hence, the target system must have a Spring tool suite (recommmended: Spring 3.0) . Then, the target system must have Java (>=8) installed and available in the system path. The project makes use of Maven as the build tool and hence, Maven must also be in the system path. Also, SQLite must be installed on the system.

Compiling
In the root directory of the project, a batch file by the name "AutoBuildTest.bat" is present. Run the batch file in the command line and it will compile the sources and execute the test cases.

./../Monitoring-System-API> AutoBuildTest.bat
Once the batch file has sucessfully executed, you should be able to see a "build successful" message.

NOTE 1: This AutoBuildTest.bat also runs JaCoCo code coverage library and you can check the code coverage report by opening "index.html" in browser.

./target/site/jacoco> index.html
NOTE 2: This AutoBuildTest.bat also runs javancss cyclomatic cmplexity measuring library and you can check the cyclomatic complexity report by opening "javancss.html" in browser.

./target/site> javancss.html
Execution
Once the main spring application (com.example.demo) has been run,Tomcat apache server would set up.

APIs Created
Monitor Service API
HTTP Mehtod	API URL	Description	Success Response	Failure Response
GET	"/monitor"	Fetches list of all monitors in the system along with their status	200 status code with "OK"	--
POST	"/monitor/newmonitor"	This adds a new monitor to the system	201 status code with "CREATED"	--
GET	"/monitor/{monitorId}"	Fetches the details of monitor with the monitorID = "id"	200 Status code 'OK'	404 status code 'Not Found'
DELETE	"/monitor/delete/{id}"	Deletes specified record of monitor	204 status code 'NO CONTENT'	400 status code 'BAD REQUEST'
Customer Service API
HTTP Mehtod	API URL	Description	Success Response	Failure Response
POST	"monitor/category/touchscreen/interoperability/connectivity_EMR/selectFinalProduct{monitorID}"	This adds a new request for the selected product to the system	201 status code 'CREATED'	400 status code 'BAD REQUEST'
GET	"/monitor/category"	Display list of category of monitors in the system	200 status code 'OK'	--
GET	"/monitor/category/Touchscreen"	Fetches the details of the particular monitor with touchscreen property	status code 200 with 'NO CONTENT'	status code 404 'NOT FOUND'
GET	"/monitor/category/Touchscreen"	Fetches the details of the particular monitor with touchscreen property	status code 200 with 'NO CONTENT'	status code 404 'NOT FOUND'
| GET | "/monitor/category/touchscreen/interoperability/connectivity_EMR" | Fetches the details of the particular monitor with touchscreen, interoperability and connectivity_EMRproperty as property | status code 200 with 'NO CONTENT' | status code 404 'NOT FOUND' |

| GET | "/monitor/category/touchscreen/interoperability" | Fetches the details of the particular monitor with touchscreen and interopability property | status code 200 with 'NO CONTENT' | status code 404 'NOT FOUND' | | GET | "/monitor/category/touchscreen/nointeroperability" | Fetches the details of the particular monitor with touchscreen and no interopability property | status code 200 with 'NO CONTENT' | status code 404 'NOT FOUND' |

For more info on the API's, start the springboot application and goto http://localhost:8080/monitor on the browser.
