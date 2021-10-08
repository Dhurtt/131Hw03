package grading;

import java.util.List;

public class SizeException extends Exception {

   private static final long serialVersionUID = 1L;

   public SizeException() {}

   public SizeException(String message) {
       super(message);
