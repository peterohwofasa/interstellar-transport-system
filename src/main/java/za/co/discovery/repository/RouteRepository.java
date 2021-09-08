package za.co.discovery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import za.co.discovery.domain.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Short>
{

}
