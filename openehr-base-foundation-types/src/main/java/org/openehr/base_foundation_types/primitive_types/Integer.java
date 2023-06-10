package org.openehr.base_foundation_types.primitive_types;

import java.lang.Boolean;
import java.lang.Object;

/**
 * Type representing minimal interface of built-in Integer type.
 */
public interface Integer extends OrderedNumeric {
  /**
   * Integer addition.
   */
  Integer add(Object other);

  /**
   * Integer subtraction.
   */
  Integer subtract(Object other);

  /**
   * Integer multiplication.
   */
  Integer multiply(Object other);

  /**
   * Integer division.
   */
  Double divide(Object other);

  /**
   * Integer exponentiation.
   */
  Double exponent(Object other);

  /**
   * Return self modulo other.
   */
  Integer modulo(Object mod);

  /**
   * Returns True if current Integer is less than `_other_`.
   */
  Boolean lessThan(Object other);

  /**
   * Generate negative of current Integer value.
   */
  Integer negative();

  /**
   * Value equality: return True if `this` and `_other_` are attached to objects considered to be equal in value.
   */
  Boolean isEqual(Object other);

  /**
   * Reference equality for reference types, value equality for value types.
   */
  Boolean equal(Object other);
}
