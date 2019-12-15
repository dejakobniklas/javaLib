package de.jakobniklas.javalib.commonutil.subclasses.file;

import java.io.File;

/**
 * Functional interface to be implemented while iterating over a directory in {@link de.jakobniklas.javalib.commonutil.FileUtil}
 *
 * @author Jakob-Niklas See
 * @see #file(String, File)
 */
@FunctionalInterface
public interface DirectoryIterator
{
    void file(String fileName, File file);
}
