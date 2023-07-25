package org.openehr.base.foundation_types.time;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

import org.openehr.base.foundation_types.primitive_types.Real;

/**
 * <div class="content"><div class="paragraph">
 * <p>Represents an ISO 8601 time, including partial and extended forms. Value may be:</p>
 * </div>
 * <div class="ulist">
 * <ul>
 * <li>
 * <p><code>hh:mm:ss[(,|.)sss][Z|±hh[:mm]]</code> (extended, preferred) or</p>
 * </li>
 * <li>
 * <p><code>hhmmss[(,|.)sss][Z|±hh[mm]]</code> (compact)</p>
 * </li>
 * <li>
 * <p>or a partial invariant.</p>
 * </li>
 * </ul>
 * </div>
 * <div class="paragraph">
 * <p>See <code><em>valid_iso8601_time()</em></code> for validity.</p>
 * </div>
 * <div class="admonitionblock note">
 * <table>
 * <tbody><tr>
 * <td class="icon">
 * <div class="title">Note</div>
 * </td>
 * <td class="content">
 * A small deviation to the ISO 8601:2004 standard in this class is that the time <code>24:00:00</code> is not allowed, for consistency with <code>Iso8601_date_time</code>.
 * </td>
 * </tr>
 * </tbody></table>
 * </div></div>
 *
 * @see <a href="https://specifications.openehr.org/releases/BASE/Release-1.2.0/foundation_types.html#_iso8601_time_class">specifications.openehr.org</a>
 */
public interface Iso8601Time extends Iso8601Type {
  /**
   * Extract the hour part of the date/time as an Integer.
   */
  Integer hour();

  /**
   * Extract the minute part of the time as an Integer, or return 0 if not present.
   */
  Integer minute();

  /**
   * Extract the integral seconds part of the time (i.e. prior to any decimal sign) as an Integer, or return 0 if not present.
   */
  Integer second();

  /**
   * Extract the fractional seconds part of the time (i.e. following to any decimal sign) as a Real, or return 0.0 if not present.
   */
  Double fractionalSecond();

  /**
   * Timezone; may be Void.
   */
  Iso8601Timezone timezone();

  /**
   * Indicates whether minute is unknown. If so, the time is of the form “hh”.
   */
  Boolean minuteUnknown();

  /**
   * Indicates whether second is unknown. If so and month is known, the time is of the form `"hh:mm"` or `"hhmm"`.
   */
  Boolean secondUnknown();

  /**
   * True if this time has a decimal part indicated by `','` (comma) rather than `'.'` (period).
   */
  Boolean isDecimalSignComma();

  /**
   * True if this time is partial, i.e. if seconds or more is missing.
   */
  Boolean isPartial();

  /**
   * True if this time uses `'-'`, `':'` separators.
   */
  Boolean isExtended();

  /**
   * True if the `_fractional_second_` part is significant (i.e. even if = 0.0).
   */
  Boolean hasFractionalSecond();

  /**
   * Return string value in extended format.
   */
  String asString();

  /**
   * Arithmetic addition of a duration to a time.
   */
  Iso8601Time add(Object aDiff);

  /**
   * Arithmetic subtraction of a duration from a time.
   */
  Iso8601Time subtract(Object aDiff);

  /**
   * Difference of two times.
   */
  Iso8601Duration diff(Object aTime);
}
