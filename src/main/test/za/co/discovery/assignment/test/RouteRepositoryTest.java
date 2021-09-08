package za.co.discovery.assignment.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.co.discovery.assignment.context.listener.DataLoaderImpl;
import za.co.discovery.assignment.orm.Route;
import za.co.discovery.assignment.repository.RouteRepository;


/**
 * 
 * @author Philani Dlamini
 * RouteRepository test
 * @TODO write test method for testSave()
 * @TODO write test method for testDelete()
 * @TODO write test method for testFindOne()
 * 
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RouteRepositoryTest {
	
	@Autowired
	RouteRepository routeRepo;
	
	@Autowired
	DataLoaderImpl initializer;

	@Test
	public void testFindAll() {
		initializer.readXlsDataFile();
		List<Route>routeList = routeRepo.findAll();
		assertThat(routeList).isNotEmpty();
	}
}
