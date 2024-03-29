package org.openehr.base.base_types.builtins;

import java.lang.Object;

/**
 * Mathematical computation.
 */
public interface Math {
  /**
   * Compute natural log of v.
   */
  Double ln(Object v);

  /**
   * Compute base 10 log of v.
   */
  Double log(Object v);

  /**
   * Compute sin(v).
   */
  Double sin(Object v);
}
