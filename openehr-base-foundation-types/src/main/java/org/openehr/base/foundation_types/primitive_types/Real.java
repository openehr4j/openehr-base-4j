package org.openehr.base.foundation_types.primitive_types;

import java.lang.Boolean;
import java.lang.Object;

/**
 * Type used to represent decimal numbers. Corresponds to a single-precision floating point value in most languages.
 */
public interface Real extends OrderedNumeric {
  /**
   * Return the greatest integer no greater than the value of this object.
   */
  Integer floor();

  /**
   * Real number addition.
   */
  Real add(Object other);

  /**
   * Real number subtraction.
   */
  Real subtract(Object other);

  /**
   * Real number multiplication.
   */
  Real multiply(Object other);

  /**
   * Real number division.
   */
  Double divide(Object other);

  /**
   * Real number exponentiation.
   */
  Double exponent(Object other);

  /**
   * Returns True if current Real is less than `_other_`.
   */
  Boolean lessThan(Object other);

  /**
   * Generate negative of current Real value.
   */
  Real negative();

  /**
   * Value equality: return True if `this` and `_other_` are attached to objects considered to be equal in value.
   */
  Boolean isEqual(Object other);

  /**
   * Reference equality for reference types, value equality for value types.
   */
  Boolean equal(Object other);
}
