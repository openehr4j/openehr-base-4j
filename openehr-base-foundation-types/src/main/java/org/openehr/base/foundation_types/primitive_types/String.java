package org.openehr.base.foundation_types.primitive_types;

import java.lang.Boolean;
import java.lang.Object;

/**
 * Type representing minimal interface of built-in String type, as used to represent textual data in any natural or formal language.
 */
public interface String extends Ordered {
  /**
   * True if string is empty, i.e. equal to "".
   */
  Boolean isEmpty();

  /**
   * True if string can be parsed as an integer.
   */
  Boolean isInteger();

  /**
   * Return the integer corresponding to the integer value represented in this string.
   */
  Integer asInteger();

  /**
   * Concatenation operator - causes `_other_` to be appended to this string.
   */
  java.lang.String append(Object other);

  /**
   * Lexical comparison of string content based on ordering in relevant character set.
   */
  Boolean lessThan(Object other);

  /**
   * Return True if this String contains `_other_` (case-sensitive).
   */
  Boolean contains(Object other);
}
