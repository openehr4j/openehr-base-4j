package org.openehr.base_foundation_types.interval;

import java.lang.Boolean;

/**
 * Express constraints on the cardinality of container objects which are the values of multiply-valued attributes, including uniqueness and ordering, providing the means to state that a container acts like a logical list, set or bag.
 */
public interface Cardinality {
  /**
   * The interval of this cardinality.
   */
  MultiplicityInterval getInterval();

  /**
   * True if the members of the container attribute to which this cardinality refers are ordered.
   */
  Boolean getIsOrdered();

  /**
   * True if the members of the container attribute to which this cardinality refers are unique.
   */
  Boolean getIsUnique();

  /**
   * True if the semantics of this cardinality represent a bag, i.e. unordered, non-unique membership.
   */
  Boolean isBag();

  /**
   * True if the semantics of this cardinality represent a list, i.e. ordered, non-unique membership.
   */
  Boolean isList();

  /**
   * True if the semantics of this cardinality represent a set, i.e. unordered, unique membership.
   */
  Boolean isSet();
}
