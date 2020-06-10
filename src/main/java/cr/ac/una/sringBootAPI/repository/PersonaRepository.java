package cr.ac.una.sringBootAPI.repository;

import cr.ac.una.sringBootAPI.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {
}