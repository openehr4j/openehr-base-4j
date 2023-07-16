package org.openehr.base.foundation_types.primitive_types;

import java.lang.Object;

/**
 * Type representing minimal interface of built-in Boolean type.
 */
public interface Boolean {
  /**
   * Logical conjunction of this with `_other_`.
   */
  java.lang.Boolean conjunction(Object other);

  /**
   * Boolean semi-strict conjunction with `_other_`.
   */
  java.lang.Boolean semistrictConjunction(Object other);

  /**
   * Boolean disjunction with `_other_`.
   */
  java.lang.Boolean disjunction(Object other);

  /**
   * Boolean semi-strict disjunction with `_other_`.
   */
  java.lang.Boolean semistrictDisjunction(Object other);

  /**
   * Boolean exclusive or with `_other_`.
   */
  java.lang.Boolean exclusiveDisjunction(Object other);

  /**
   * Boolean implication of `_other_` (semi-strict)
   */
  java.lang.Boolean implication(Object other);

  /**
   * Boolean negation of the current value.
   */
  java.lang.Boolean negation();
}
