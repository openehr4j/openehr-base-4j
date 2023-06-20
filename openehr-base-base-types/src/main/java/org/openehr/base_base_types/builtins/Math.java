package org.openehr.base_base_types.builtins;

import java.lang.Object;
import org.openehr.base_foundation_types.primitive_types.Double;

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
