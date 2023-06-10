package org.openehr.base_foundation_types.time_types;

import java.lang.Boolean;
import java.lang.String;

/**
 * Abstract ancestor type of ISO 8601 types, defining interface for 'extended' and 'partial' concepts from ISO 8601.
 */
public interface Iso8601Type extends Temporal, TimeDefinitions {
  /**
   * Representation of all descendants is a single String.
   */
  String getValue();

  /**
   * True if this date time is partial, i.e. if trailing end (right hand) value(s) is/are missing.
   */
  Boolean isPartial();

  /**
   * True if this ISO8601 string is in the 'extended' form, i.e. uses `'-'` and / or `':'` separators. This is the preferred format.
   */
  Boolean isExtended();
}
