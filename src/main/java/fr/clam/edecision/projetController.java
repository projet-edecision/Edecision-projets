package fr.clam.edecision;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.*;

@RestController
public class projetController {

    private final projetRepository repositoryProjet;

    projetController(projetRepository repository){
        this.repositoryProjet = repository;
    }

    @GetMapping("/projets")
    List<projetEntity> all() {
        return (List<projetEntity>) repositoryProjet.findAll();
    }

    @PostMapping("/projet")
    projetEntity newProjet(@RequestBody projetEntity newProjet) {
        return repositoryProjet.save(newProjet);
    }

    @GetMapping("/projet/{id}")
    projetEntity one(@PathVariable UUID id) {

        return repositoryProjet.findById(id)
                .orElseThrow(() -> new projetNotFoundException(id));
    }

    @PutMapping("/projet/{id}")
    projetEntity edit(@RequestBody projetEntity newProjet, @PathVariable UUID id) {

        return repositoryProjet.findById(id)
                .map(equipe -> {
                    equipe.setUuid(newProjet.getUuid());
                    equipe.setName(newProjet.getName());
                    equipe.setState(newProjet.getState());
                    equipe.setDescription(newProjet.getDescription());
                    return repositoryProjet.save(equipe);
                })
                .orElseGet(() -> {
                    newProjet.setUuid(id);
                    return repositoryProjet.save(newProjet);
                });
    }

    @DeleteMapping("/projet/{id}")
    void delete(@PathVariable UUID id) {
        repositoryProjet.delete(one(id));
    }

}
