/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
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
 * @ast node
 * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/grammar/Java.ast:170
 * @production LogicalExpr : {@link Binary};

 */
public abstract class LogicalExpr extends Binary implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public LogicalExpr() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[2];
  }
  /**
   * @declaredat ASTNode:13
   */
  public LogicalExpr(Expr p0, Expr p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:18
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:24
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    type_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public LogicalExpr clone() throws CloneNotSupportedException {
    LogicalExpr node = (LogicalExpr) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:48
   */
  @Deprecated
  public abstract LogicalExpr fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:56
   */
  public abstract LogicalExpr treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:64
   */
  public abstract LogicalExpr treeCopy();
  /**
   * Replaces the LeftOperand child.
   * @param node The new node to replace the LeftOperand child.
   * @apilevel high-level
   */
  public void setLeftOperand(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the LeftOperand child.
   * @return The current node used as the LeftOperand child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="LeftOperand")
  public Expr getLeftOperand() {
    return (Expr) getChild(0);
  }
  /**
   * Retrieves the LeftOperand child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the LeftOperand child.
   * @apilevel low-level
   */
  public Expr getLeftOperandNoTransform() {
    return (Expr) getChildNoTransform(0);
  }
  /**
   * Replaces the RightOperand child.
   * @param node The new node to replace the RightOperand child.
   * @apilevel high-level
   */
  public void setRightOperand(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the RightOperand child.
   * @return The current node used as the RightOperand child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="RightOperand")
  public Expr getRightOperand() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the RightOperand child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the RightOperand child.
   * @apilevel low-level
   */
  public Expr getRightOperandNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
  /** @apilevel internal */
  private void type_reset() {
    type_computed = null;
    type_value = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle type_computed = null;

  /** @apilevel internal */
  protected TypeDecl type_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/TypeAnalysis.jrag:296
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/TypeAnalysis.jrag:296")
  public TypeDecl type() {
    ASTNode$State state = state();
    if (type_computed == ASTNode$State.NON_CYCLE || type_computed == state().cycle()) {
      return type_value;
    }
    type_value = typeBoolean();
    if (state().inCircle()) {
      type_computed = state().cycle();
    
    } else {
      type_computed = ASTNode$State.NON_CYCLE;
    
    }
    return type_value;
  }
  /**
   * @attribute syn
   * @aspect TypeCheck
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/TypeCheck.jrag:294
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeCheck", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/TypeCheck.jrag:294")
  public Collection<Problem> typeProblems() {
    {
        Collection<Problem> problems = new LinkedList<Problem>();
        if (!getLeftOperand().type().isBoolean()) {
          problems.add(errorf("%s is not boolean", getLeftOperand().type().typeName()));
        }
        if (!getRightOperand().type().isBoolean()) {
          problems.add(errorf("%s is not boolean", getRightOperand().type().typeName()));
        }
        return problems;
      }
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
  protected void collect_contributors_CompilationUnit_problems(CompilationUnit _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/TypeCheck.jrag:291
    {
      java.util.Set<ASTNode> contributors = _map.get(_root);
      if (contributors == null) {
        contributors = new java.util.LinkedHashSet<ASTNode>();
        _map.put((ASTNode) _root, contributors);
      }
      contributors.add(this);
    }
    super.collect_contributors_CompilationUnit_problems(_root, _map);
  }
  protected void contributeTo_CompilationUnit_problems(LinkedList<Problem> collection) {
    super.contributeTo_CompilationUnit_problems(collection);
    for (Problem value : typeProblems()) {
      collection.add(value);
    }
  }
}
