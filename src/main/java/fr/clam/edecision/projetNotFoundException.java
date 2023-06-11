package fr.clam.edecision;

import java.util.UUID;

public class projetNotFoundException extends RuntimeException {

    projetNotFoundException(UUID id) {
        super("Could not find projet " + id);
    }
}
