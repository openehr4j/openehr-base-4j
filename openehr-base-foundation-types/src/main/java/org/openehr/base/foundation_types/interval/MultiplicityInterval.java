package org.openehr.base.foundation_types.interval;

import java.lang.Boolean;

/**
 * An Interval of Integer, used to represent multiplicity, cardinality and optionality in models.
 */
public interface MultiplicityInterval extends ProperInterval {
  /**
   * True if this interval imposes no constraints, i.e. is set to `0..*`.
   */
  Boolean isOpen();

  /**
   * True if this interval expresses optionality, i.e. `0..1`.
   */
  Boolean isOptional();

  /**
   * True if this interval expresses mandation, i.e. `1..1`.
   */
  Boolean isMandatory();

  /**
   * True if this interval is set to `0..0`.
   */
  Boolean isProhibited();
}
