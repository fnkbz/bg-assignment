# bg-assignment

Here you will find a small Sping Boot application that consumes a RESTful web service.

It is a main class that gets the json response, parses the json tree and write the properties into a file.

Change the FILENAME constant before run at the Application.java

An alternative way (not implemented completely) is to map the response to POJOs. You can find the respsective POJOs at the entities

The mapping can be done through the restTemplate.getForObject e.g

WUResponse response = restTemplate.getForObject("http://api.wunderground.com/api/fd1e148f67645411/history_20171030/q/NY/New_York.json", WUResponse.class);

Then get the DailySummary array print it and pass the values of Table 2 to a file.