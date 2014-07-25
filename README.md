[![Build Status](https://travis-ci.org/ogstation/credit.svg)](https://travis-ci.org/ogstation/credit)

credit
===========

How to build ?
======
mvn clean install

How to run ?
======
mvn jetty:run
 
API
======
* /api/error/400: handle 400 error
* /api/error/401: handle 401 error
* /api/error/403: handle 403 error
* /api/error/404: handle 404 error
* /api/error/500: handle 500 error


* /api/credit(POST): add credit for member
```
Post data
{  
   "member":{  
      "id":"id",
      "identityCard":"identity_card",
      "telephone":"15912345678",
      "email":"test@test.com"
   },
   "gasStation":{  
      "id":"id",
      "name":"name"
   },
   "amount":"2000"
}
```
