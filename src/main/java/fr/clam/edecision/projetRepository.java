package fr.clam.edecision;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface projetRepository extends CrudRepository<projetEntity, String> {

    projetRepository deleteByuuid(String id);
}
