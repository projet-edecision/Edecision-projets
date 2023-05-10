package fr.clam.edecision;

public class projetNotFoundException extends RuntimeException {

    projetNotFoundException(String id) {
        super("Could not find employee " + id);
    }
}
