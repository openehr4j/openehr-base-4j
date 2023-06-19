package org.openehr.base_foundation_types.structure_types;

import java.lang.Boolean;
import java.lang.Object;

/**
 * Type representing a keyed table of values. V is the value type, and K the type of the keys.
 */
public interface Hash extends Container {
  /**
   * Test for presence of `_a_key_`.
   */
  Boolean hasKey(Object aKey);

  /**
   * Return item for key `_a_key_`.
   */
  Object item(Object aKey);
}
