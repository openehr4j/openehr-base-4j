package org.openehr.base_foundation_types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

/**
 * Abstract ancestor class for all other classes. Usually maps to a type like `Any` or `Object` in an object-oriented technology. Defined here to provide value and reference equality semantics.
 */
public interface Any {
  /**
   * Value equality: return True if `this` and `_other_` are attached to objects considered to be equal in value.
   */
  Boolean isEqual(Object other);

  /**
   * Reference equality for reference types, value equality for value types.
   */
  Boolean equal(Object other);

  /**
   * Create new instance of a type.
   */
  Any instanceOf(Object aType);

  /**
   * Type name of an object as a string. May include generic parameters, as in `"Interval<Time>"`.
   */
  String typeOf(Object anObject);

  /**
   * True if current object not equal to `_other_`. Returns not `_equal_()`.
   */
  Boolean notEqual(Object other);
}
