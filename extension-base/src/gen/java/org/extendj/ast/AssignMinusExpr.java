/* This file was generated with JastAdd2 (http://jastadd.org) version 2.1.10-34-g8379457 */
package org.extendj.ast;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.io.File;
import java.util.Set;
import beaver.*;
import org.jastadd.util.*;
import java.util.zip.*;
import java.io.*;
import org.jastadd.util.PrettyPrintable;
import org.jastadd.util.PrettyPrinter;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
/**
 * @ast node
 * @declaredat extendj/java4/grammar/Java.ast:114
 * @production AssignMinusExpr : {@link AssignAdditiveExpr};

 */
public class AssignMinusExpr extends AssignAdditiveExpr implements Cloneable {
  /**
   * @aspect TypeCheck
   * @declaredat extendj/java4/frontend/TypeCheck.jrag:113
   */
  public void typeCheck() {
    if (getSource().type().isBoolean() || getDest().type().isBoolean()) {
      error("Operator - does not operate on boolean types");
    }
    super.typeCheck();
  }
  /**
   * @declaredat ASTNode:1
   */
  public AssignMinusExpr() {
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
  public AssignMinusExpr(Expr p0, Expr p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   * @declaredat ASTNode:20
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:26
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:32
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:38
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @api internal
   * @declaredat ASTNode:44
   */
  public void flushRewriteCache() {
    super.flushRewriteCache();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:50
   */
  public AssignMinusExpr clone() throws CloneNotSupportedException {
    AssignMinusExpr node = (AssignMinusExpr) super.clone();
    return node;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:57
   */
  public AssignMinusExpr copy() {
    try {
      AssignMinusExpr node = (AssignMinusExpr) clone();
      node.parent = null;
      if(children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:76
   */
  public AssignMinusExpr fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:85
   */
  public AssignMinusExpr treeCopyNoTransform() {
    AssignMinusExpr tree = (AssignMinusExpr) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if(child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:105
   */
  public AssignMinusExpr treeCopy() {
    doFullTraversal();
    return treeCopyNoTransform();
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:112
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Dest child.
   * @param node The new node to replace the Dest child.
   * @apilevel high-level
   */
  public void setDest(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Dest child.
   * @return The current node used as the Dest child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Dest")
  public Expr getDest() {
    return (Expr) getChild(0);
  }
  /**
   * Retrieves the Dest child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Dest child.
   * @apilevel low-level
   */
  public Expr getDestNoTransform() {
    return (Expr) getChildNoTransform(0);
  }
  /**
   * Replaces the Source child.
   * @param node The new node to replace the Source child.
   * @apilevel high-level
   */
  public void setSource(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Source child.
   * @return The current node used as the Source child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Source")
  public Expr getSource() {
    return (Expr) getChild(1);
  }
  /**
   * Retrieves the Source child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Source child.
   * @apilevel low-level
   */
  public Expr getSourceNoTransform() {
    return (Expr) getChildNoTransform(1);
  }
  @ASTNodeAnnotation.Attribute
  public String printOp() {
    ASTNode$State state = state();
    String printOp_value = "-=";

    return printOp_value;
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}