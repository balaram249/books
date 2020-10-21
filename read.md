# Assist a Purchase API


The purchase system helps in selecting and delivering the right solution.
It serves both the customer as well as Philips personnel.

## Index
1. [Prerequisites](#Prerequisites)
2. [Setup](#Setup)
3. [Executing](#Executing)
4. [APIs Created](#ApiCreated)
5. [Goal Set and Achieved](#Goalset)

## Prerequisites
This application is built on java and utilises spring boot frame work and MySQL database server running on port 3306.This project uses Maven as build tool and project management system.So, Java>8,MySQL >=8.0 and maven>=4.0 are necessary for running this project.

## Setup
Clone the repo into your local system and in the root directory of the project, a sql file by the name "db.sql" is present. 
Open the MySQL command line and run the command  

```   
source <path_to_sql_file>
```  
  and the server would create the database philips_products required for project.


## Execution
now execute the java class target.classes.com.example.purchase.PurchaseApplication.class 

## APIs Created



### Client API
| HTTP MetHod | ENDPOINT      |Query String                                                               | description |Response  |                                
|-------------|----------------|----------------------------------------------------------------------------|--------------------------------------------------|-------------------|
| GET        | "/purchase/client" | | 200 status code with "OK"    | -- |
| GET        | "/purchase/client" |Fetches list of all monitors in the system along with their status | 200 status code with "OK"    | -- |
| GET        | "/purchase/client" |Fetches list of all monitors in the system along with their status | 200 status code with "OK"    | -- |
| GET        | "/purchase/client" |Fetches list of all monitors in the system along with their status | 200 status code with "OK"    | -- |
| GET        | "/purchase/client" |Fetches list of all monitors in the system along with their status | 200 status code with "OK"    | -- |
| GET        | "/purchase/client" |Fetches list of all monitors in the system along with their status | 200 status code with "OK"    | -- |




### Customer Service API

| HTTP Mehtod | API URL        | Description                                                                | Success Response                                 | Failure Response  |
|-------------|----------------|----------------------------------------------------------------------------|--------------------------------------------------|-------------------|
| POST        | "monitor/category/touchscreen/interoperability/connectivity_EMR/selectFinalProduct{monitorID}"      | This adds a new request for the selected product to the system | 201 status code 'CREATED'  | 400 status code 'BAD REQUEST' |
| GET         | "/monitor/category"      |Display list of category of monitors in the system              | 200 status code 'OK'                   | --                |
| GET         | "/monitor/category/Touchscreen" | Fetches the details of the particular monitor with touchscreen property                                   | status code 200 with 'NO CONTENT'  | status code 404 'NOT FOUND'    |
| GET         | "/monitor/category/Touchscreen" | Fetches the details of the particular monitor with touchscreen property                                   | status code 200 with 'NO CONTENT'  | status code 404 'NOT FOUND'    |

| GET         | "/monitor/category/touchscreen/interoperability/connectivity_EMR" | Fetches the details of the particular monitor with touchscreen, interoperability and connectivity_EMRproperty  as property                                 | status code 200 with 'NO CONTENT'  | status code 404 'NOT FOUND'    |

| GET         | "/monitor/category/touchscreen/interoperability" | Fetches the details of the particular monitor with touchscreen and interopability property                                   | status code 200 with 'NO CONTENT'  | status code 404 'NOT FOUND'    |
| GET         | "/monitor/category/touchscreen/nointeroperability" | Fetches the details of the particular monitor with touchscreen and  no interopability property                                   | status code 200 with 'NO CONTENT'  | status code 404 'NOT FOUND'    |


For more info on the API's, start the springboot application and goto 
http://localhost:8080/monitor on the browser.
