package org.openehr.base.foundation_types.interval;

import java.lang.Boolean;
import java.lang.Object;

/**
 * Interval abstraction, featuring upper and lower limits that may be open or closed, included or not included.
 */
public interface Interval {
  /**
   * Lower bound.
   */
  Object getLower();

  /**
   * Upper bound.
   */
  Object getUpper();

  /**
   * `lower` boundary open (i.e. = -infinity).
   */
  Boolean getLowerUnbounded();

  /**
   * `upper` boundary open (i.e. = +infinity).
   */
  Boolean getUpperUnbounded();

  /**
   * `lower` boundary value included in range if not `lower_unbounded`.
   */
  Boolean getLowerIncluded();

  /**
   * `upper` boundary value included in range if not `upper_unbounded`.
   */
  Boolean getUpperIncluded();

  /**
   * True if the value `e` is properly contained in this Interval.
   */
  Boolean has(Object e);

  /**
   * True if there is any overlap between intervals represented by Current and `_other_`. True if at least one limit of other is strictly inside the limits of this interval.
   */
  Boolean intersects(Object other);

  /**
   * True if current interval properly contains `_other_`? True if all points of `_other_` are inside the current interval.
   */
  Boolean contains(Object other);

  /**
   * True if current object's interval is semantically same as `_other_`.
   */
  Boolean isEqual(Object other);
}
