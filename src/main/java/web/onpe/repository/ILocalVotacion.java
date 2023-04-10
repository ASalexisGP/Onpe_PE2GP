package web.onpe.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import web.onpe.model.LocalVotacion;



@Repository
public interface ILocalVotacion extends JpaRepository<LocalVotacion, Integer> {
	
	@Query(value = "{call sp_getLocalVotacion (:id)}", nativeQuery = true )
	LocalVotacion getLocalVotacion (int id);

}
