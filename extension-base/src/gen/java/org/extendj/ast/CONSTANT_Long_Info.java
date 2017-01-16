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
 * @ast class
 * @aspect BytecodeCONSTANT
 * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/BytecodeCONSTANT.jrag:212
 */
 class CONSTANT_Long_Info extends CONSTANT_Info {
  
    public long value;

  

    public CONSTANT_Long_Info(AbstractClassfileParser parser) throws IOException {
      super(parser);
      value = p.readLong();
    }

  

    @Override
    public String toString() {
      return "LongInfo: " + Long.toString(value);
    }

  

    @Override
    public Expr expr() {
      return Literal.buildLongLiteral(value);
    }


}
