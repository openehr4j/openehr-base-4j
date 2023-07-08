package org.openehr.base.base_types.builtins;

import java.lang.Object;
import org.openehr.base.foundation_types.primitive_types.Double;
import org.openehr.base.foundation_types.primitive_types.Numeric;

/**
 * A basic statistical evaluator class providing common functions on collections of numbers.
 */
public interface StatisticalEvaluator {
  /**
   * Sum of a container of values.
   */
  Double sum(Object vals);

  /**
   * Synonym for `_mean()_`.
   */
  Double avg(Object vals);

  /**
   * Mean (arithmetic average) of a container of values.
   */
  Double mean(Object vals);

  /**
   * Return numerically centre value in ordered form of container contents.
   */
  Numeric median(Object vals);

  /**
   * Mode (most frequent) of a container of values.
   */
  Numeric mode(Object vals);

  /**
   * Maximum of a container of values.
   */
  Numeric max(Object vals);

  /**
   * Minimum of a container of values.
   */
  Numeric min(Object vals);

  /**
   * Return the number of items in `_vals_`, i.e. `_vals.count_`.
   */
  Numeric count(Object vals);

  /**
   * Compute standard deviation of a container of values.
   */
  Double stdDev(Object vals);
}
