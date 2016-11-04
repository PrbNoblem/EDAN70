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
 * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/grammar/Java.ast:188
 * @production Modifiers : {@link ASTNode} ::= <span class="component">{@link Modifier}*</span>;

 */
public class Modifiers extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Java4PrettyPrint
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/PrettyPrint.jadd:511
   */
  public void prettyPrint(PrettyPrinter out) {
    if (hasModifier()) {
      out.join(getModifierList(), new PrettyPrinter.Joiner() {
        @Override
        public void printSeparator(PrettyPrinter out) {
          out.print(" ");
        }
      });
      out.print(" ");
    }
  }
  /**
   * @declaredat ASTNode:1
   */
  public Modifiers() {
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
    children = new ASTNode[1];
    setChild(new List(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  public Modifiers(List<Modifier> p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:18
   */
  protected int numChildren() {
    return 1;
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
    isPublic_reset();
    isPrivate_reset();
    isProtected_reset();
    isStatic_reset();
    isFinal_reset();
    isAbstract_reset();
    isVolatile_reset();
    isTransient_reset();
    isStrictfp_reset();
    isSynchronized_reset();
    isNative_reset();
    isSynthetic_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public Modifiers clone() throws CloneNotSupportedException {
    Modifiers node = (Modifiers) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:53
   */
  public Modifiers copy() {
    try {
      Modifiers node = (Modifiers) clone();
      node.parent = null;
      if (children != null) {
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
   * @declaredat ASTNode:72
   */
  @Deprecated
  public Modifiers fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:82
   */
  public Modifiers treeCopyNoTransform() {
    Modifiers tree = (Modifiers) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
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
   * @declaredat ASTNode:102
   */
  public Modifiers treeCopy() {
    Modifiers tree = (Modifiers) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:116
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Modifier list.
   * @param list The new list node to be used as the Modifier list.
   * @apilevel high-level
   */
  public void setModifierList(List<Modifier> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Modifier list.
   * @return Number of children in the Modifier list.
   * @apilevel high-level
   */
  public int getNumModifier() {
    return getModifierList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Modifier list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Modifier list.
   * @apilevel low-level
   */
  public int getNumModifierNoTransform() {
    return getModifierListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Modifier list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Modifier list.
   * @apilevel high-level
   */
  public Modifier getModifier(int i) {
    return (Modifier) getModifierList().getChild(i);
  }
  /**
   * Check whether the Modifier list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasModifier() {
    return getModifierList().getNumChild() != 0;
  }
  /**
   * Append an element to the Modifier list.
   * @param node The element to append to the Modifier list.
   * @apilevel high-level
   */
  public void addModifier(Modifier node) {
    List<Modifier> list = (parent == null) ? getModifierListNoTransform() : getModifierList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addModifierNoTransform(Modifier node) {
    List<Modifier> list = getModifierListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Modifier list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setModifier(Modifier node, int i) {
    List<Modifier> list = getModifierList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Modifier list.
   * @return The node representing the Modifier list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Modifier")
  public List<Modifier> getModifierList() {
    List<Modifier> list = (List<Modifier>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Modifier list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Modifier list.
   * @apilevel low-level
   */
  public List<Modifier> getModifierListNoTransform() {
    return (List<Modifier>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Modifier list without
   * triggering rewrites.
   */
  public Modifier getModifierNoTransform(int i) {
    return (Modifier) getModifierListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Modifier list.
   * @return The node representing the Modifier list.
   * @apilevel high-level
   */
  public List<Modifier> getModifiers() {
    return getModifierList();
  }
  /**
   * Retrieves the Modifier list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Modifier list.
   * @apilevel low-level
   */
  public List<Modifier> getModifiersNoTransform() {
    return getModifierListNoTransform();
  }
  /**
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:369
   */
  private Collection<Problem> refined_Modifiers_Modifiers_modifierProblems()
{
    Collection<Problem> problems = new LinkedList<Problem>();
    if (numProtectionModifiers() > 1) {
      problems.add(error("only one public, protected, private allowed"));
    }
    if (numModifier("static") > 1) {
      problems.add(error("only one static allowed"));
    }
    // 8.4.3.1
    // 8.4.3.2
    // 8.1.1.2
    if (numCompletenessModifiers() > 1) {
      problems.add(error("only one of final, abstract, volatile allowed"));
    }
    if (numModifier("synchronized") > 1) {
      problems.add(error("only one synchronized allowed"));
    }
    if (numModifier("transient") > 1) {
      problems.add(error("only one transient allowed"));
    }
    if (numModifier("native") > 1) {
      problems.add(error("only one native allowed"));
    }
    if (numModifier("strictfp") > 1) {
      problems.add(error("only one strictfp allowed"));
    }
    if (isPublic() && !mayBePublic()) {
      problems.add(error("modifier public not allowed in this context"));
    }
    if (isPrivate() && !mayBePrivate()) {
      problems.add(error("modifier private not allowed in this context"));
    }
    if (isProtected() && !mayBeProtected()) {
      problems.add(error("modifier protected not allowed in this context"));
    }
    if (isStatic() && !mayBeStatic()) {
      problems.add(error("modifier static not allowed in this context"));
    }
    if (isFinal() && !mayBeFinal()) {
      problems.add(error("modifier final not allowed in this context"));
    }
    if (isAbstract() && !mayBeAbstract()) {
      problems.add(error("modifier abstract not allowed in this context"));
    }
    if (isVolatile() && !mayBeVolatile()) {
      problems.add(error("modifier volatile not allowed in this context"));
    }
    if (isTransient() && !mayBeTransient()) {
      problems.add(error("modifier transient not allowed in this context"));
    }
    if (isStrictfp() && !mayBeStrictfp()) {
      problems.add(error("modifier strictfp not allowed in this context"));
    }
    if (isSynchronized() && !mayBeSynchronized()) {
      problems.add(error("modifier synchronized not allowed in this context"));
    }
    if (isNative() && !mayBeNative()) {
      problems.add(error("modifier native not allowed in this context"));
    }
    return problems;
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:369
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:369")
  public Collection<Problem> modifierProblems() {
    {
        Collection<Problem> problems = refined_Modifiers_Modifiers_modifierProblems();
        if (numModifier("default") > 1) {
          problems.add(error("only one default allowed"));
        }
        return problems;
      }
  }
  /** @apilevel internal */
  private void isPublic_reset() {
    isPublic_computed = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle isPublic_computed = null;

  /** @apilevel internal */
  protected boolean isPublic_value;

  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:445
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:445")
  public boolean isPublic() {
    ASTNode$State state = state();
    if (isPublic_computed == ASTNode$State.NON_CYCLE || isPublic_computed == state().cycle()) {
      return isPublic_value;
    }
    isPublic_value = hasModifier("public");
    if (state().inCircle()) {
      isPublic_computed = state().cycle();
    
    } else {
      isPublic_computed = ASTNode$State.NON_CYCLE;
    
    }
    return isPublic_value;
  }
  /** @apilevel internal */
  private void isPrivate_reset() {
    isPrivate_computed = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle isPrivate_computed = null;

  /** @apilevel internal */
  protected boolean isPrivate_value;

  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:446
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:446")
  public boolean isPrivate() {
    ASTNode$State state = state();
    if (isPrivate_computed == ASTNode$State.NON_CYCLE || isPrivate_computed == state().cycle()) {
      return isPrivate_value;
    }
    isPrivate_value = hasModifier("private");
    if (state().inCircle()) {
      isPrivate_computed = state().cycle();
    
    } else {
      isPrivate_computed = ASTNode$State.NON_CYCLE;
    
    }
    return isPrivate_value;
  }
  /** @apilevel internal */
  private void isProtected_reset() {
    isProtected_computed = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle isProtected_computed = null;

  /** @apilevel internal */
  protected boolean isProtected_value;

  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:447
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:447")
  public boolean isProtected() {
    ASTNode$State state = state();
    if (isProtected_computed == ASTNode$State.NON_CYCLE || isProtected_computed == state().cycle()) {
      return isProtected_value;
    }
    isProtected_value = hasModifier("protected");
    if (state().inCircle()) {
      isProtected_computed = state().cycle();
    
    } else {
      isProtected_computed = ASTNode$State.NON_CYCLE;
    
    }
    return isProtected_value;
  }
  /** @apilevel internal */
  private void isStatic_reset() {
    isStatic_computed = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle isStatic_computed = null;

  /** @apilevel internal */
  protected boolean isStatic_value;

  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:448
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:448")
  public boolean isStatic() {
    ASTNode$State state = state();
    if (isStatic_computed == ASTNode$State.NON_CYCLE || isStatic_computed == state().cycle()) {
      return isStatic_value;
    }
    isStatic_value = hasModifier("static");
    if (state().inCircle()) {
      isStatic_computed = state().cycle();
    
    } else {
      isStatic_computed = ASTNode$State.NON_CYCLE;
    
    }
    return isStatic_value;
  }
  /** @apilevel internal */
  private void isFinal_reset() {
    isFinal_computed = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle isFinal_computed = null;

  /** @apilevel internal */
  protected boolean isFinal_value;

  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:449
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:449")
  public boolean isFinal() {
    ASTNode$State state = state();
    if (isFinal_computed == ASTNode$State.NON_CYCLE || isFinal_computed == state().cycle()) {
      return isFinal_value;
    }
    isFinal_value = hasModifier("final");
    if (state().inCircle()) {
      isFinal_computed = state().cycle();
    
    } else {
      isFinal_computed = ASTNode$State.NON_CYCLE;
    
    }
    return isFinal_value;
  }
  /** @apilevel internal */
  private void isAbstract_reset() {
    isAbstract_computed = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle isAbstract_computed = null;

  /** @apilevel internal */
  protected boolean isAbstract_value;

  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:450
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:450")
  public boolean isAbstract() {
    ASTNode$State state = state();
    if (isAbstract_computed == ASTNode$State.NON_CYCLE || isAbstract_computed == state().cycle()) {
      return isAbstract_value;
    }
    isAbstract_value = hasModifier("abstract");
    if (state().inCircle()) {
      isAbstract_computed = state().cycle();
    
    } else {
      isAbstract_computed = ASTNode$State.NON_CYCLE;
    
    }
    return isAbstract_value;
  }
  /** @apilevel internal */
  private void isVolatile_reset() {
    isVolatile_computed = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle isVolatile_computed = null;

  /** @apilevel internal */
  protected boolean isVolatile_value;

  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:451
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:451")
  public boolean isVolatile() {
    ASTNode$State state = state();
    if (isVolatile_computed == ASTNode$State.NON_CYCLE || isVolatile_computed == state().cycle()) {
      return isVolatile_value;
    }
    isVolatile_value = hasModifier("volatile");
    if (state().inCircle()) {
      isVolatile_computed = state().cycle();
    
    } else {
      isVolatile_computed = ASTNode$State.NON_CYCLE;
    
    }
    return isVolatile_value;
  }
  /** @apilevel internal */
  private void isTransient_reset() {
    isTransient_computed = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle isTransient_computed = null;

  /** @apilevel internal */
  protected boolean isTransient_value;

  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:452
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:452")
  public boolean isTransient() {
    ASTNode$State state = state();
    if (isTransient_computed == ASTNode$State.NON_CYCLE || isTransient_computed == state().cycle()) {
      return isTransient_value;
    }
    isTransient_value = hasModifier("transient");
    if (state().inCircle()) {
      isTransient_computed = state().cycle();
    
    } else {
      isTransient_computed = ASTNode$State.NON_CYCLE;
    
    }
    return isTransient_value;
  }
  /** @apilevel internal */
  private void isStrictfp_reset() {
    isStrictfp_computed = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle isStrictfp_computed = null;

  /** @apilevel internal */
  protected boolean isStrictfp_value;

  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:453
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:453")
  public boolean isStrictfp() {
    ASTNode$State state = state();
    if (isStrictfp_computed == ASTNode$State.NON_CYCLE || isStrictfp_computed == state().cycle()) {
      return isStrictfp_value;
    }
    isStrictfp_value = hasModifier("strictfp");
    if (state().inCircle()) {
      isStrictfp_computed = state().cycle();
    
    } else {
      isStrictfp_computed = ASTNode$State.NON_CYCLE;
    
    }
    return isStrictfp_value;
  }
  /** @apilevel internal */
  private void isSynchronized_reset() {
    isSynchronized_computed = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle isSynchronized_computed = null;

  /** @apilevel internal */
  protected boolean isSynchronized_value;

  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:454
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:454")
  public boolean isSynchronized() {
    ASTNode$State state = state();
    if (isSynchronized_computed == ASTNode$State.NON_CYCLE || isSynchronized_computed == state().cycle()) {
      return isSynchronized_value;
    }
    isSynchronized_value = hasModifier("synchronized");
    if (state().inCircle()) {
      isSynchronized_computed = state().cycle();
    
    } else {
      isSynchronized_computed = ASTNode$State.NON_CYCLE;
    
    }
    return isSynchronized_value;
  }
  /** @apilevel internal */
  private void isNative_reset() {
    isNative_computed = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle isNative_computed = null;

  /** @apilevel internal */
  protected boolean isNative_value;

  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:455
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:455")
  public boolean isNative() {
    ASTNode$State state = state();
    if (isNative_computed == ASTNode$State.NON_CYCLE || isNative_computed == state().cycle()) {
      return isNative_value;
    }
    isNative_value = hasModifier("native");
    if (state().inCircle()) {
      isNative_computed = state().cycle();
    
    } else {
      isNative_computed = ASTNode$State.NON_CYCLE;
    
    }
    return isNative_value;
  }
  /** @apilevel internal */
  private void isSynthetic_reset() {
    isSynthetic_computed = null;
  }
  /** @apilevel internal */
  protected ASTNode$State.Cycle isSynthetic_computed = null;

  /** @apilevel internal */
  protected boolean isSynthetic_value;

  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:457
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:457")
  public boolean isSynthetic() {
    ASTNode$State state = state();
    if (isSynthetic_computed == ASTNode$State.NON_CYCLE || isSynthetic_computed == state().cycle()) {
      return isSynthetic_value;
    }
    isSynthetic_value = hasModifier("synthetic");
    if (state().inCircle()) {
      isSynthetic_computed = state().cycle();
    
    } else {
      isSynthetic_computed = ASTNode$State.NON_CYCLE;
    
    }
    return isSynthetic_value;
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:459
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:459")
  public int numProtectionModifiers() {
    int numProtectionModifiers_value = numModifier("public") + numModifier("protected") + numModifier("private");
    return numProtectionModifiers_value;
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:462
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:462")
  public int numCompletenessModifiers() {
    int numCompletenessModifiers_value = numModifier("abstract") + numModifier("final") + numModifier("volatile");
    return numCompletenessModifiers_value;
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:465
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:465")
  public int numModifier(String name) {
    {
        int n = 0;
        for (Modifier modifier : getModifierList()) {
          if (modifier.getID().equals(name)) {
            n++;
          }
        }
        return n;
      }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:475
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:475")
  public boolean hasModifier(String name) {
    {
        for (Modifier modifier : getModifierList()) {
          if (modifier.getID().equals(name)) {
            return true;
          }
        }
        return false;
      }
  }
  /**
   * @attribute syn
   * @aspect Annotations
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Annotations.jrag:321
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Annotations", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Annotations.jrag:321")
  public Annotation annotation(TypeDecl typeDecl) {
    {
        for (int i = 0; i < getNumModifier(); i++) {
          if (getModifier(i) instanceof Annotation) {
            Annotation a = (Annotation) getModifier(i);
            if (a.type() == typeDecl) {
              return a;
            }
          }
        }
        return null;
      }
  }
  /**
   * @attribute syn
   * @aspect Annotations
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Annotations.jrag:333
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Annotations", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Annotations.jrag:333")
  public boolean hasAnnotation(String packageName, String name) {
    {
        for (int i = 0; i < getNumModifier(); i++) {
          if (getModifier(i).isAnnotation(packageName, name)) {
            return true;
          }
        }
        return false;
      }
  }
  /**
   * @attribute syn
   * @aspect Annotations
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Annotations.jrag:442
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Annotations", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Annotations.jrag:442")
  public boolean hasAnnotationSuppressWarnings(String annot) {
    {
        Annotation a = annotation(lookupType("java.lang", "SuppressWarnings"));
        if (a != null && a.getNumElementValuePair() == 1
            && a.getElementValuePair(0).getName().equals("value")) {
          return a.getElementValuePair(0).getElementValue().hasValue(annot);
        }
        return false;
      }
  }
  /**
   * @attribute syn
   * @aspect Annotations
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Annotations.jrag:479
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Annotations", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Annotations.jrag:479")
  public boolean hasDeprecatedAnnotation() {
    boolean hasDeprecatedAnnotation_value = hasAnnotation("java.lang", "Deprecated");
    return hasDeprecatedAnnotation_value;
  }
  /**
   * @return true if the modifier list includes the SafeVarargs annotation
   * @attribute syn
   * @aspect SafeVarargs
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java7/frontend/SafeVarargs.jrag:66
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="SafeVarargs", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java7/frontend/SafeVarargs.jrag:66")
  public boolean hasAnnotationSafeVarargs() {
    boolean hasAnnotationSafeVarargs_value = hasAnnotation("java.lang", "SafeVarargs");
    return hasAnnotationSafeVarargs_value;
  }
  /**
   * @attribute syn
   * @aspect Annotations
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java8/frontend/Annotations.jrag:46
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Annotations", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java8/frontend/Annotations.jrag:46")
  public boolean hasAnnotationFunctionalInterface() {
    boolean hasAnnotationFunctionalInterface_value = hasAnnotation("java.lang", "FunctionalInterface");
    return hasAnnotationFunctionalInterface_value;
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java8/frontend/Modifiers.jrag:29
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java8/frontend/Modifiers.jrag:29")
  public boolean isDefault() {
    boolean isDefault_value = hasModifier("default");
    return isDefault_value;
  }
  /**
   * @attribute inh
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:431
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:431")
  public TypeDecl hostType() {
    TypeDecl hostType_value = getParent().Define_hostType(this, null);
    return hostType_value;
  }
  /**
   * @attribute inh
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:433
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:433")
  public boolean mayBePublic() {
    boolean mayBePublic_value = getParent().Define_mayBePublic(this, null);
    return mayBePublic_value;
  }
  /**
   * @attribute inh
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:434
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:434")
  public boolean mayBePrivate() {
    boolean mayBePrivate_value = getParent().Define_mayBePrivate(this, null);
    return mayBePrivate_value;
  }
  /**
   * @attribute inh
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:435
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:435")
  public boolean mayBeProtected() {
    boolean mayBeProtected_value = getParent().Define_mayBeProtected(this, null);
    return mayBeProtected_value;
  }
  /**
   * @attribute inh
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:436
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:436")
  public boolean mayBeStatic() {
    boolean mayBeStatic_value = getParent().Define_mayBeStatic(this, null);
    return mayBeStatic_value;
  }
  /**
   * @attribute inh
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:437
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:437")
  public boolean mayBeFinal() {
    boolean mayBeFinal_value = getParent().Define_mayBeFinal(this, null);
    return mayBeFinal_value;
  }
  /**
   * @attribute inh
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:438
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:438")
  public boolean mayBeAbstract() {
    boolean mayBeAbstract_value = getParent().Define_mayBeAbstract(this, null);
    return mayBeAbstract_value;
  }
  /**
   * @attribute inh
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:439
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:439")
  public boolean mayBeVolatile() {
    boolean mayBeVolatile_value = getParent().Define_mayBeVolatile(this, null);
    return mayBeVolatile_value;
  }
  /**
   * @attribute inh
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:440
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:440")
  public boolean mayBeTransient() {
    boolean mayBeTransient_value = getParent().Define_mayBeTransient(this, null);
    return mayBeTransient_value;
  }
  /**
   * @attribute inh
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:441
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:441")
  public boolean mayBeStrictfp() {
    boolean mayBeStrictfp_value = getParent().Define_mayBeStrictfp(this, null);
    return mayBeStrictfp_value;
  }
  /**
   * @attribute inh
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:442
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:442")
  public boolean mayBeSynchronized() {
    boolean mayBeSynchronized_value = getParent().Define_mayBeSynchronized(this, null);
    return mayBeSynchronized_value;
  }
  /**
   * @attribute inh
   * @aspect Modifiers
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:443
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Modifiers", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:443")
  public boolean mayBeNative() {
    boolean mayBeNative_value = getParent().Define_mayBeNative(this, null);
    return mayBeNative_value;
  }
  /**
   * @attribute inh
   * @aspect Annotations
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Annotations.jrag:109
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Annotations", declaredAt="/h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Annotations.jrag:109")
  public TypeDecl lookupType(String packageName, String typeName) {
    TypeDecl lookupType_String_String_value = getParent().Define_lookupType(this, null, packageName, typeName);
    return lookupType_String_String_value;
  }
  /**
   * @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Annotations.jrag:604
   * @apilevel internal
   */
  public Annotation Define_lookupAnnotation(ASTNode _callerNode, ASTNode _childNode, TypeDecl typeDecl) {
    if (_callerNode == getModifierListNoTransform()) {
      // @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java5/frontend/Annotations.jrag:606
      int index = _callerNode.getIndexOfChild(_childNode);
      {
          return annotation(typeDecl);
        }
    }
    else {
      return getParent().Define_lookupAnnotation(this, _callerNode, typeDecl);
    }
  }
  protected boolean canDefine_lookupAnnotation(ASTNode _callerNode, ASTNode _childNode, TypeDecl typeDecl) {
    return true;
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
    // @declaredat /h/dc/q/stv10hjo/Documents/EDAN70/extension-base/extendj/java4/frontend/Modifiers.jrag:367
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
    for (Problem value : modifierProblems()) {
      collection.add(value);
    }
  }
}
