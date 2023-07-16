package org.openehr.base.foundation_types.time_types;

import java.lang.Boolean;
import java.lang.String;

/**
 * ISO8601 timezone string, in format:
 */
public interface Iso8601Timezone extends Iso8601Type {
  /**
   * Extract the hour part of timezone, as an Integer in the range `00 - 14`.
   */
  Integer hour();

  /**
   * Extract the hour part of timezone, as an Integer, usually either 0 or 30.
   */
  Integer minute();

  /**
   * Direction of timezone expresssed as +1 or -1.
   */
  Integer sign();

  /**
   * Indicates whether minute part known.
   */
  Boolean minuteUnknown();

  /**
   * True if this time zone is partial, i.e. if minutes is missing.
   */
  Boolean isPartial();

  /**
   * True if this time-zone uses ‘:’ separators.
   */
  Boolean isExtended();

  /**
   * True if timezone is UTC, i.e. `+0000`.
   */
  Boolean isGmt();

  /**
   * Return timezone string in extended format.
   */
  String asString();
}
