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
| GET        | "/purchase/client" | --| shows all the products  | success: 200 WITH "OK" Fail : - |
| GET        | "/purchase/client/category/isWireless" |value=<boolean > |shows all the products with the desired Wireless type    |success: 200 WITH "OK" Fail : - -- |
| GET        | "/purchase/client/isTouchscreen" | value=<boolean >| shows all the products with the desired Touchscreen type   |success: 200 WITH "OK" Fail : - -- |
| GET        | "/purchase/client/isInteroperable" |value=<boolean >| shows all the products with the desired Interoperable type  |success: 200 WITH "OK" Fail : - -- |
| GET        | "/purchase/client/name" |name=<String > | shows all the products with the given name     | success: 200 WITH "OK" Fail : 400 with "no product with given name"--- |





### Admin API

| HTTP Method |Enpoint        | Query String                                                                | Description                               |  Response  |
|-------------|----------------|----------------------------------------------------------------------------|--------------------------------------------------|-------------------|
| POST        | "/purchase/admin/"      | name=<String >&price=<Boolean >&isWireless=<Boolean >&isTouchscreen=<Boolean >&isInteroperable=<Boolean > |  adds a product to the database | success: 201 status code 'CREATED' |
| DELETE       | "/purchase/admin/"      |id=<int >          |                 deletes a product with given id  |            success: 200 status code 'OK'  Fail:- 400 with "product does not exist" | 
| PUT      | "/purchase/admin/" | name=<String >&price=<Boolean >&isWireless=<Boolean >&isTouchscreen=<Boolean >&isInteroperable=<Boolean >                                 | updates the product with given parameters success: 200 with "OK" Fail:-400 "cannot be update because no product with given specifications"    |
