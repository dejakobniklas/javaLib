package de.jakobniklas.javalib.commonutil.subclasses.file;

import java.io.File;

/**
 * Functional interface to be implemented while iterating over a directory in {@link
 * de.jakobniklas.javalib.commonutil.FileUtil} to filter if a file gets iterated over
 *
 * @author Jakob-Niklas See
 * @see #predicate(File)
 */
@FunctionalInterface
public interface DirectoryIteratorFilter
{
    Boolean predicate(File file);
}
