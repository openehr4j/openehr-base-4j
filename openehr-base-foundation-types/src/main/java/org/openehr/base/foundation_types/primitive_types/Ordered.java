package org.openehr.base.foundation_types.primitive_types;

import java.lang.Boolean;
import java.lang.Object;

/**
 * Abstract parent class of ordered types i.e. types on which the '<' operator is defined.
 */
public interface Ordered {
  /**
   * Arithmetic value comparison. Returns True if current object is less than `_other_`. This operator is effected and/or redefined in descendants to provide the appropriate ordering semantics for concrete types.
   */
  Boolean lessThan(Object other);

  /**
   * True if current object less than or equal to `_other_`.
   */
  Boolean lessThanOrEqual(Object other);

  /**
   * True if current object greater than `_other_`.
   */
  Boolean greaterThan(Object other);

  /**
   * True if current object greater than or equal to `_other_`.
   */
  Boolean greaterThanOrEqual(Object other);
}
