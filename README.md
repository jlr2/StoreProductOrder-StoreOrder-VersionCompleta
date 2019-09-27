# order-service

It's a service which is part of a microservices project. This project consists in an online store, and the service manage the orders.
This service storage users and products data.


## Execution

You can execute the project using the command `mvn clean springboot:run` in boot module. 

## How it works

### POST
The URI to made POST is 

`/api/v1/orders`

The body to insert is like this:
```
{"shippingAddress":{
   
                   "country": "Spain",
                   "province": "Sevilla",
                   "city": "Sevilla",
                   "zipCode": 41006,
                   "homeAddress": "C/Anfield"
               },
               "user":{
                   "email": "name.email@example.es",
                   "name": "Alberto",
                   "surname": "Serrano",
                   "billingAddress":{
                       "country": "Spain",
                       "province": "Sevilla",
                       "city": "Sevilla",
                       "zipCode": 41006,
                       "homeAddress": "C/Anfield"
                   }
               },
               "products": [
                   {
                       "reference":"r3425fs",
                       "price":15, 
                       "quantity":2
                   }
               ]
           }
````              
### GET

The URI to made  **GET** is
 `/api/v1/orders`
###### SEARCH BY REFERENCE
 The URI to made GET orders by reference is:
`/api/v1/orders/REFERENCE`

where REFERENCE is the reference of the order that you want to get.        
### DELETE
 The URI to made **DELETE** orders is:
`/api/v1/orders/orderid`

### PUT
 The URI to made **PUT** orders is:
`/api/v1/orders/REFERENCE`

where REFERENCE is the reference of the order that you want upgrade. 

The body to upgrade the order is like this:
```
{"shippingAddress":{
   
                   "country": "Spain",
                   "province": "Sevilla",
                   "city": "Sevilla",
                   "zipCode": 41006,
                   "homeAddress": "C/Anfield"
               },
               "user":{
                   "email": "name.email@example.es",
                   "name": "Alberto",
                   "surname": "Serrano",
                   "billingAddress":{
                       "country": "Spain",
                       "province": "Sevilla",
                       "city": "Sevilla",
                       "zipCode": 41006,
                       "homeAddress": "C/Anfield"
                   }
               },
               "products": [
                   {
                       "reference":"r3425fs",
                       "price":15, 
                       "quantity":2
                   }
               ]
           }
````        
