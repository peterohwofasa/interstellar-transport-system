package za.co.discovery.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import za.co.discovery.bus.DijkstraAlgorithm;

/**
 * 
 * @author Philani Dlamini
 * This Restful controller delegates to the ShortestPathService stragegy to compute the shortest path
 */
@RestController
public class InterstellarRestController {
	
	@Autowired
	@Lazy
	private DijkstraAlgorithm shortestPathService;
	
	/**
	 * Finds the shortest path given the source and destinaiton
	 * @param source source node
	 * @param destinaiton  destinaiton node
	 * @Usage http://localhost:8080/shortestpath/A/Z
	 */
	@RequestMapping(method = RequestMethod.GET, value="/shortestpath/{source}/{destination}")
	@ResponseBody
	public String getShortestPath(@PathVariable("source") String source, @PathVariable("destination") String destination){
		return shortestPathService.findShortestPath(source, destination);
	}
}
