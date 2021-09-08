Startup services
-----------------
DataLoaderImpl.JAVA
-Waits for the Spring Boot context to start than reads the XLS data file
-Persists the data file records into the in memory derby DB

ORM
-------
-Tried not to have an unnecessarily deep object graph, could have had a Graph object that contains 
a set of Planets and a set of Routes but instead went with the below more perfromance friendly approach.
-Mapped a Unidirectional Route --->Planet
-Planet.java
-Route.java

Business Logic
-----------------
ShortestPathService.java
-Contains the DijkstraAlgorithm business logic
-Uses the strategy pattern to delegate finding the shortes path to SimpleDirectedWeightedGraph
-Lazily initializes the SimpleDirectedWeightedGraph at service invocation time


Rest Layer
-------------
InterstellarRestController.java
-Reuses ShortestPathService.java to return the shortes path 
-Sample usage-->http://localhost:8080/shortestpath/A/Z

HATEOAS endpoints that expose the DB objetcs
-Sample usage-->http://localhost:8080/planets
-Sample usage-->http://localhost:8080/routes


SOAP layer
-------------
-Will use apache CFX


Front end
---------
-Will use Thymeleaf


Unit testing
-------------
@SpringBootTest with assertj

