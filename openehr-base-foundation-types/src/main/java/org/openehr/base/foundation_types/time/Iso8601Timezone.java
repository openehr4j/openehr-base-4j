package org.openehr.base.foundation_types.time;

import java.lang.Boolean;
import java.lang.String;

/**
 * <div class="content"><div class="paragraph">
 * <p>ISO8601 timezone string, in format:</p>
 * </div>
 * <div class="ulist">
 * <ul>
 * <li>
 * <p><code>Z | ±hh[mm]</code></p>
 * </li>
 * </ul>
 * </div>
 * <div class="paragraph">
 * <p>where:</p>
 * </div>
 * <div class="ulist">
 * <ul>
 * <li>
 * <p><code>hh</code> is "00" - "23" (0-filled to two digits)</p>
 * </li>
 * <li>
 * <p><code>mm</code> is "00" - "59" (0-filled to two digits)</p>
 * </li>
 * <li>
 * <p><code>Z</code> is a literal meaning UTC (modern replacement for GMT), i.e. timezone <code>+0000</code></p>
 * </li>
 * </ul>
 * </div></div>
 *
 * @see <a href="https://specifications.openehr.org/releases/BASE/Release-1.2.0/foundation_types.html#_iso8601_timezone_class">specifications.openehr.org</a>
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
