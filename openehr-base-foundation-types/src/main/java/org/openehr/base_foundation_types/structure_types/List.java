package org.openehr.base_foundation_types.structure_types;

import java.lang.Object;

/**
 * Ordered container that may contain duplicates.
 */
public interface List extends Container {
  /**
   * Return first element.
   */
  Object first();

  /**
   * Return last element.
   */
  Object last();
}
