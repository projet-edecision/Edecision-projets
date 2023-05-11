package fr.clam.edecision;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface projetRepository extends CrudRepository<projetEntity, UUID> {

    projetRepository deleteByuuid(String id);
}
