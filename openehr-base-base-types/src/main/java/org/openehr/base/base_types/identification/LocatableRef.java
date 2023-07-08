package org.openehr.base.base_types.identification;

import java.lang.String;

/**
 * Purpose Reference to a `LOCATABLE` instance inside the top-level content structure inside a `VERSION<T>`; the path attribute is applied to the object that `VERSION._data_` points to.
 */
public interface LocatableRef extends ObjectRef {
  /**
   * The path to an instance in question, as an absolute path with respect to the object found at `VERSION._data_`. An empty path means that the object referred to by id being specified.
   */
  String getPath();

  /**
   * Globally unique id of an object, regardless of where it is stored.
   */
  UidBasedId getId();

  /**
   * A URI form of the reference, created by concatenating the following:
   */
  String asUri();
}
