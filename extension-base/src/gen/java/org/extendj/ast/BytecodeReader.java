package org.extendj.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import java.util.Set;
import beaver.*;
import org.jastadd.util.*;
import org.jastadd.util.PrettyPrintable;
import org.jastadd.util.PrettyPrinter;
import java.util.zip.*;
import java.io.*;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
/**
 * @ast interface
 * @aspect ClassPath
 * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/ClassPath.jrag:45
 */
public interface BytecodeReader {

     
    CompilationUnit read(InputStream is, String fullName, Program p)
        throws FileNotFoundException, IOException;
}
