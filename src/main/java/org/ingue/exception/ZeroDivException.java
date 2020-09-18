package org.ingue.exception;

public class ZeroDivException extends ArithmeticException {

    private static final String msg = "exception occur because divide 0";

    public ZeroDivException() {
        super(msg);
    }

    public ZeroDivException(String s) {
        super(s);
    }
}
