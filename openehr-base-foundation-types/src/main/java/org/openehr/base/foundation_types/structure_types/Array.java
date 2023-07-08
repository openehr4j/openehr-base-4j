package org.openehr.base.foundation_types.structure_types;

import java.lang.Object;

/**
 * Container whose storage is assumed to be contiguous.
 */
public interface Array extends Container {
  /**
   * Return item for key  `_a_key_`.
   */
  Object item(Object aKey);
}
