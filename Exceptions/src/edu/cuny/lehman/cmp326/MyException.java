package edu.cuny.lehman.cmp326;

public class MyException extends Exception {

    /**
     * Precondition: This constructor will create an exception with default
     * message �Index too low.� Postcondition: If index is between -15 and 0, it
     * will throw a MyException with the default message.
     */
    public MyException() {
        super("Index too low.");
    }

    /**
     * Precondition: This constructor will create an exception with a custom
     * message. Postcondition: if index is less than -15, it will throw a
     * MyException with the message that was input.
     */
    public MyException(String message) {
        super(message);
    }

    /**
     * Per/Postcondition: return the message from super.
     */
    public String getMessage() {
        return super.getMessage();
    }
}
