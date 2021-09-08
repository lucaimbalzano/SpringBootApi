# SpringBootApi
SpringBoot application RESTful api


# Ecommerce <img src="https://user-images.githubusercontent.com/45575898/131373141-7311f706-2c7c-4a27-85fa-38357b37cf25.png"  width="70" height="70" />

  <img alt="angular" src="https://img.shields.io/badge/-Angular-DD0031?style=flat-square&logo=angular&logoColor=white" /> <img alt="npm" src="https://img.shields.io/badge/-NPM-CB3837?style=flat-square&logo=npm&logoColor=white" />
  <img alt="html5" src="https://img.shields.io/badge/-HTML5-E34F26?style=flat-square&logo=html5&logoColor=white" />
  <img alt="TypeScript" src="https://img.shields.io/badge/-TypeScript-007ACC?style=flat-square&logo=typescript&logoColor=white" />
  <img alt="Css3" src="https://img.shields.io/badge/-CSS3-00FF00?style=flat-square&logo=css3&logoColor=brown" />
  <img alt="Javascript" src="https://img.shields.io/badge/-Javascript-ADD8E6?style=flat-square&logo=javascript&logoColor=black" />
  <img alt="Java" src="https://img.shields.io/badge/-Java-DD0031?style=flat-square&logo=java&logoColor=white" />
  <img alt="Hibernate" src="https://img.shields.io/badge/-Hibernate-00FF00?style=flat-square&logo=hibernate&logoColor=green" />

## Preview📌
![image](https://user-images.githubusercontent.com/45575898/131372608-8f01300b-a6df-4a7a-94df-d3922e34944f.png)
![image](https://user-images.githubusercontent.com/45575898/131372716-f77cff17-3604-47b1-9b27-3b36061565ff.png)
![image](https://user-images.githubusercontent.com/45575898/131372790-06e00298-6cdc-4491-880b-4d6828734637.png)

## Frontend📌

Run `npm install` to install all the dependencies
Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.


This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 11.2.11.

## Backend📌

Run `mvn clean install` to install all the dependencies
Then change the database properties in `Hibernate.cfg.xml` for the connection, and `build` the project and add the `.war` file into a Server,
i used wildfly as web-server

## Database📌
![image](https://user-images.githubusercontent.com/45575898/131374429-f2c89d64-5123-4dee-a302-cdd5206c3bea.png)

You can copy the schema here: https://github.com/lucaimbalzano/Ecommerce/blob/de2b9d53cb5658ad3a0c865f9e100c4d424613bf/ECOMMERCE_SCHEMA-TABLES.SQL

I used Mysql as db, i used pretty simple diagram so i could do the application quickly and for some reasons i didn't linked all table i preffered take separated voluntarily, is an example-app.

## URI📌
```
+-----------------------------------+----------------------------------------------------------------------------+
| METHOD                            | URI                                                                        |
+===================================+============================================================================+
| GET                               | | ``http://localhost:8080/api/customers/getListCustomers``                 |
|                                   | |                                                                          |
+-----------------------------------+----------------------------------------------------------------------------+
| GET                               | | ``http://localhost:8080/api/customers/{id}``                             |
|                                   | |                                                                          |
+-----------------------------------+----------------------------------------------------------------------------+
| POST                              | | ``http://localhost:8080/api/customers``                                  |
|                                   | |                                                                          | 
|                                   | |       ``{                                           ``                   |
|                                   | |       ``   "store_id": 0 ,                          ``                   |
|                                   | |       ``  "first_name": "Marco",                    ``                   |
|                                   | |       ``   "last_name": "Maniscalco",               ``                   |
|                                   | |       ``   "email": "marcoinfo@gmail.com",          ``                   |
|                                   | |       ``    "address_id":3,                         ``                   |
|                                   | |       ``    "active":1,                             ``                   |
|                                   | |       ``    "create_date": "2006-02-14 22:04:40",   ``                   |
|                                   | |       ``    "last_update":"2006-02-14 22:04:36"     ``                   |
|                                   | |       ``}                                           ``                   |
|                                   | |                                                                          |
|                                   | |                                                                          |
|                                   | |                                                                          |
|                                   | |                                                                          |
|                                   | |                                                                          |
|                                   | |                                                                          |
+-----------------------------------+----------------------------------------------------------------------------+
| PUT                               | | ``$ git add .``                                                          |
|                                   | |                                                                          |
|                                   | |                                                                          |
+-----------------------------------+----------------------------------------------------------------------------+
| DELETE                            | | ``$ dvc remote add myremote -d s3://mybucket/image_cnn``                 |
|                                   | |                                                                          |
+-----------------------------------+----------------------------------------------------------------------------+
```
## Browser Support API📌

At present, i officially aim to support the last two versions of the following browsers:

<img src="https://github.com/creativetimofficial/public-assets/blob/master/logos/chrome-logo.png?raw=true" width="64" height="64">  <img src="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/logos/edge-logo.png" width="64" height="64"> <img src="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/logos/safari-logo.png" width="64" height="64"> <img src="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/logos/opera-logo.png" width="64" height="64">

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Made with ❤ by ![](https://img.shields.io/badge/luca-informational?style=flat&logo=#DD0031&logoColor=white&color=2bbc8a)![](https://img.shields.io/badge/Imbalzano-informational?style=flat&logo=&logoColor=white&color=2bbc8a)

