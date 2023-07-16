package org.openehr.base.foundation_types.structure_types;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;

/**
 * Abstract ancestor of container types whose items are addressable in some way.
 */
public interface Container {
  /**
   * Test for membership of a value.
   */
  Boolean has(Object v);

  /**
   * Number of items in container.
   */
  Integer count();

  /**
   * True if container is empty.
   */
  Boolean isEmpty();

  /**
   * Existential quantifier applied to container, taking one agent argument `_test_` whose signature is `(v:T): Boolean`.
   */
  Boolean thereExists(Object test);

  /**
   * Universal quantifier applied to container, taking one agent argument `_test_` whose signature is `(v:T): Boolean`.
   */
  Boolean forAll(Object test);

  /**
   * Return a List all items matching the predicate function `_test_` which has signature `(v:T): Boolean`. If no matches, an empty List is returned.
   */
  List matching(Object test);

  /**
   * Return first item matching the predicate function `_test_` which has signature `(v:T): Boolean`, or Void if no match.
   */
  Object select(Object test);
}
