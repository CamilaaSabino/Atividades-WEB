package br.edu.uepb.projetoweb.exceptions;

public class ExistingObjectSameNameException extends Exception {
    public ExistingObjectSameNameException(String message) {
        super(message);
    }
}