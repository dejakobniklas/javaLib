package de.jakobniklas.javalib.exception;

/**
 * A class to be implemented which is a custom handler for exception. If registered can be called by {@link
 * de.jakobniklas.javalib.exception.Exceptions#customHandle(Exception)}
 *
 * @author Jakob-Niklas See
 * @see #handle(Exception)
 */
public abstract class ExceptionHandleEvent
{
    /**
     * The handler method to be implemented
     *
     * @param e the exception which should be handled
     */
    public abstract void handle(Exception e);
}
