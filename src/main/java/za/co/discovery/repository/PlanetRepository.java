package za.co.discovery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import za.co.discovery.domain.Planet;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, String> {

}
