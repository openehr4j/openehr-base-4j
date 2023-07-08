package org.openehr.base.base_types.builtins;

import java.lang.Object;
import org.openehr.base.foundation_types.primitive_types.Real;

/**
 * Quantity conversion.
 */
public interface QuantityConverter {
  /**
   * Convert `_value_` of physical property type (e.g. 'pressure' etc) from one units to another.
   */
  Real convertValue(Object value, Object fromUnits, Object toUnits, Object property);
}
