package org.openehr.base.base_types.identification;

import java.lang.String;

/**
 * Generic identifier type for identifiers whose format is otherwise unknown to openEHR. Includes an attribute for naming the identification scheme (which may well be local).
 */
public interface GenericId extends ObjectId {
  /**
   * Name of the scheme to which this identifier conforms. Ideally this name will be recognisable globally but realistically it may be a local ad hoc scheme whose name is not controlled or standardised in any way.
   */
  String getScheme();
}
