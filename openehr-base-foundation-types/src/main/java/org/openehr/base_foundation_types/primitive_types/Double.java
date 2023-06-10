package org.openehr.base_foundation_types.primitive_types;

import java.lang.Boolean;
import java.lang.Object;

/**
 * Type used to represent double-precision decimal numbers. Corresponds to a double-precision floating point value in most languages.
 */
public interface Double extends OrderedNumeric {
  /**
   * Return the greatest integer no greater than the value of this object.
   */
  Integer floor();

  /**
   * Double-precision real number addition.
   */
  Double add(Object other);

  /**
   * Double-precision real number subtraction.
   */
  Double subtract(Object other);

  /**
   * Double-precision real number multiplication.
   */
  Double multiply(Object other);

  /**
   * Double-precision real number division.
   */
  Double divide(Object other);

  /**
   * Double-precision real number exponentiation.
   */
  Double exponent(Object other);

  /**
   * Returns True if current Double is less than `_other_`.
   */
  Boolean lessThan(Object other);

  /**
   * Generate negative of current Double value.
   */
  Double negative();

  /**
   * Value equality: return True if `this` and `_other_` are attached to objects considered to be equal in value.
   */
  Boolean isEqual(Object other);

  /**
   * Reference equality for reference types, value equality for value types.
   */
  Boolean equal(Object other);
}
