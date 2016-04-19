**MicroDG -  Base Business Details Service **

Author: *David Brady*
Date:   *19/04/2016*

The purpose of this microservice is to retrieve information pertaining Businesses. 
The information is retrieved from a an in memory collection:

The Data Model is defined as:
* Name              (Business Name)
* Channel           (The category such as food, design, financial, etc)
* Channel Type      (A sub category such as butchers, art supplies, etc)
* Phone             (Phone number)
* Address           (Full human readable address)
* Town              (Town/City name)
* County            (Example: Dublin, Mayo)
* Region            (Example: Leinster, Munster)


To run this service locally:
* From within the PROD-Base-Business-Details Directory
'''
sbt clean compile
sbt test
sbt run
'''
* This will compile the service, test it and run it. 
* Then open a browser, navigate to localhost:8080 proceeded by the desired endpoint
* A list of endpoints can be found at: localhost:8080/hello

Alternatively, you can open this source code in the Typesafe Activator UI:
* From within the PROD-Base-Business-Details Directory
'''
activator ui
'''


**PLEASE NOTE**
This project contains work that does not belong to me:
* src/main/scala/support/CORSSupport

Title: joseraya/CorsSupport.scala
Author: Jose Raya
Date: 19/04/2016
Code version: 1.0 
Type: Source Code
Availability: https://gist.github.com/joseraya/176821d856b43b1cfe19





