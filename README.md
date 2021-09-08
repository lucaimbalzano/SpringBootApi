# SpringBootApi
SpringBoot application RESTful api


  <img alt="Spring" src="https://img.shields.io/badge/-Spring-00FF00?style=flat-square&logo=hibernate&logoColor=green" /> <img alt="Java" src="https://img.shields.io/badge/-Java-DD0031?style=flat-square&logo=java&logoColor=white" />
  <img alt="Hibernate" src="https://img.shields.io/badge/-Hibernate-00FF00?style=flat-square&logo=hibernate&logoColor=green" />
  <img alt="Mysql" src="https://img.shields.io/badge/-mysql-blue?style=flat-square&logo=mysql&logoColor=green" />


## Database📌
you can create the table by using this query [Mysql Dialect]:
```
CREATE TABLE `customer` (
  `customer_id` smallint unsigned NOT NULL AUTO_INCREMENT,
  `store_id` tinyint unsigned DEFAULT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `address_id` smallint unsigned NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `create_date` datetime NOT NULL,
  `last_update` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`customer_id`),
  KEY `idx_fk_store_id` (`store_id`),
  KEY `idx_fk_address_id` (`address_id`),
  KEY `idx_last_name` (`last_name`),
  CONSTRAINT `fk_customer_address` FOREIGN KEY (`address_id`) REFERENCES `address` (`address_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk_customer_store` FOREIGN KEY (`store_id`) REFERENCES `store` (`store_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=601 DEFAULT CHARSET=utf8;

```
You can Insert some data using this query [___INSERT_DATA___](https://github.com/lucaimbalzano/SpringBootApi/blob/main/INSERT_customer.sql)


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
|                                   | |       ``   "customer_id": 0 ,                       ``                   |
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
+-----------------------------------+----------------------------------------------------------------------------+
| PUT                               | | ``http://localhost:8080/api/customers/{id}``                             |
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
+-----------------------------------+----------------------------------------------------------------------------+
| DELETE                            | | ``http://localhost:8080/api/customers/{id}``                             |
|                                   | |                                                                          |
+-----------------------------------+----------------------------------------------------------------------------+
```
## Browser Support API📌


<img src="https://github.com/creativetimofficial/public-assets/blob/master/logos/chrome-logo.png?raw=true" width="64" height="64">  <img src="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/logos/edge-logo.png" width="64" height="64"> <img src="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/logos/safari-logo.png" width="64" height="64"> <img src="https://raw.githubusercontent.com/creativetimofficial/public-assets/master/logos/opera-logo.png" width="64" height="64">

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Made with ❤ by ![](https://img.shields.io/badge/luca-informational?style=flat&logo=#DD0031&logoColor=white&color=2bbc8a)![](https://img.shields.io/badge/Imbalzano-informational?style=flat&logo=&logoColor=white&color=2bbc8a)

