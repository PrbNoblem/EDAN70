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
 * @aspect Generics
 * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Generics.jrag:296
 */
 interface ParTypeDecl {
public Access createQualifiedAccess();


     
    TypeVariable getTypeParameter(int i);

     
    Parameterization getParameterization();

     
    public String typeName();

     
    SimpleSet<Variable> localFields(String name);

     
    Map<String, SimpleSet<MethodDecl>> localMethodsSignatureMap();
public int numTypeParameter();

public TypeVariable typeParameter(int index);

  /**
   * @attribute syn
   * @aspect GenericsParTypeDecl
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/GenericsParTypeDecl.jrag:55
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GenericsParTypeDecl", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/GenericsParTypeDecl.jrag:55")
  public String nameWithArgs();
  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Generics.jrag:299
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Generics", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Generics.jrag:299")
  public boolean isParameterizedType();
  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Generics.jrag:300
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Generics", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Generics.jrag:300")
  public boolean isRawType();
  /**
   * @attribute syn
   * @aspect GenericsTypeCheck
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Generics.jrag:600
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="GenericsTypeCheck", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Generics.jrag:600")
  public boolean sameArguments(ParTypeDecl decl);
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Generics.jrag:813
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Generics.jrag:813")
  public boolean sameSignature(Access a);
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Generics.jrag:860
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isCircular=true)
  @ASTNodeAnnotation.Source(aspect="LookupParTypeDecl", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Generics.jrag:860")
  public boolean sameSignature(java.util.List<TypeDecl> list);
  /**
   * @attribute inh
   * @aspect GenericsParTypeDecl
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/GenericsParTypeDecl.jrag:74
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="GenericsParTypeDecl", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/GenericsParTypeDecl.jrag:74")
  public TypeDecl genericDecl();
}
