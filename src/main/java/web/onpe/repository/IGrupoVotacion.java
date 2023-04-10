package web.onpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import web.onpe.model.GrupoVotacion;


@Repository
public interface IGrupoVotacion extends JpaRepository<GrupoVotacion ,Integer> {
	
	@Query(value = "{call sp_getGrupoVotacion(:id)}", nativeQuery = true)
	GrupoVotacion getGrupoVotacion(int id);

}
