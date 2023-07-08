package org.openehr.base.base_types.identification;

import java.lang.String;

/**
 * Ancestor class of identifiers of informational objects. Ids may be completely meaningless, in which case their only job is to refer to something, or may carry some information to do with the identified object.
 */
public interface ObjectId {
  /**
   * The value of the id in the form defined below.
   */
  String getValue();
}
