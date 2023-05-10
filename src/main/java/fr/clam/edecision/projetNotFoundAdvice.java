package fr.clam.edecision;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class projetNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(projetNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(projetNotFoundException ex) {
        return ex.getMessage();
    }

}
