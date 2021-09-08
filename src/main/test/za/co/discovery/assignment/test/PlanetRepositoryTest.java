package za.co.discovery.assignment.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.co.discovery.assignment.context.listener.DataLoaderImpl;
import za.co.discovery.assignment.orm.Planet;
import za.co.discovery.assignment.repository.PlanetRepository;

/**
 * 
 * @author Philani Dlamini
 * PlanetRepository test
 * @TODO write test method for testSave()
 * @TODO write test method for testDelete()
 * @TODO write test method for testFindOne()
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PlanetRepositoryTest {
	
	@Autowired
	PlanetRepository planetRepo;
	
	@Autowired
	DataLoaderImpl initializer;

	@Test
	public void testFindAll() {
		
		initializer.readXlsDataFile();
		List<Planet>planetList = planetRepo.findAll();
		assertThat(planetList).isNotEmpty();
		assertThat(planetList).size().isEqualTo(37);
	}

}
