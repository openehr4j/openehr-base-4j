package org.openehr.base.foundation_types.primitive_types;

import java.lang.Object;

/**
 * Abstract parent class of numeric types, which are types which have various arithmetic and comparison operators defined.
 */
public interface Numeric {
  /**
   * Sum with `_other_` (commutative). Actual type of result depends on arithmetic balancing rules.
   */
  Numeric add(Object other);

  /**
   * Result of subtracting `_other_`. Actual type of result depends on arithmetic balancing rules.
   */
  Numeric subtract(Object other);

  /**
   * Product by `_other_`. Actual type of result depends on arithmetic balancing rules.
   */
  Numeric multiply(Object other);

  /**
   * Divide by`_other_`. Actual type of result depends on arithmetic balancing rules.
   */
  Numeric divide(Object other);

  /**
   * Expontiation of this by `_other_`.
   */
  Numeric exponent(Object other);

  /**
   * Generate negative of current value.
   */
  Numeric negative();
}
