package web.onpe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import web.onpe.model.Distrito;


@Repository
public interface IDistrito extends JpaRepository<Distrito, Integer> {
	
	@Query(value = "{call sp_getDistrito()}",nativeQuery = true )
	List<Distrito> getDistrito();
	
}
