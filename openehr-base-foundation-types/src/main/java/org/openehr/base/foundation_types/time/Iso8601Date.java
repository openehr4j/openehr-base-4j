package org.openehr.base.foundation_types.time;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

/**
 * <div class="content"><div class="paragraph">
 * <p>Represents an ISO 8601 date, including partial and extended forms. Value may be:</p>
 * </div>
 * <div class="ulist">
 * <ul>
 * <li>
 * <p><code>YYYY-MM-DD</code> (extended, preferred)</p>
 * </li>
 * <li>
 * <p><code>YYYYMMDD</code> (compact)</p>
 * </li>
 * <li>
 * <p>a partial invariant.</p>
 * </li>
 * </ul>
 * </div>
 * <div class="paragraph">
 * <p>See <code>Time_definitions.<em>valid_iso8601_date()</em></code> for validity.</p>
 * </div></div>
 *
 * @see <a href="https://specifications.openehr.org/releases/BASE/Release-1.2.0/foundation_types.html#_iso8601_date_class">specifications.openehr.org</a>
 */
public interface Iso8601Date extends Iso8601Type {
  /**
   * Extract the year part of the date as an Integer.
   */
  Integer year();

  /**
   * Extract the month part of the date as an Integer, or return 0 if not present.
   */
  Integer month();

  /**
   * Extract the day part of the date as an Integer, or return 0 if not present.
   */
  Integer day();

  /**
   * Timezone; may be Void.
   */
  Iso8601Timezone timezone();

  /**
   * Indicates whether month in year is unknown. If so, the date is of the form `"YYYY"`.
   */
  Boolean monthUnknown();

  /**
   * Indicates whether day in month is unknown. If so, and month is known, the date is of the form `"YYYY-MM"` or `"YYYYMM"`.
   */
  Boolean dayUnknown();

  /**
   * True if this date is partial, i.e. if days or more is missing.
   */
  Boolean isPartial();

  /**
   * True if this date uses `'-'` separators.
   */
  Boolean isExtended();

  /**
   * Return string value in extended format.
   */
  String asString();

  /**
   * Arithmetic addition of a duration to a date.
   */
  Iso8601Date add(Object aDiff);

  /**
   * Arithmetic subtraction of a duration from a date.
   */
  Iso8601Date subtract(Object aDiff);

  /**
   * Difference of two dates.
   */
  Iso8601Duration diff(Object aDate);

  /**
   * Addition of nominal duration represented by `_a_diff_`. For example, a duration of `'P1Y'` means advance to the same date next year, with the exception of the date 29 February in a leap year, to which the addition of a nominal year will result in 28 February of the following year. Similarly, `'P1M'` is understood here as a nominal month, the addition of which will result in one of:
   */
  Iso8601Date addNominal(Object aDiff);

  /**
   * Subtraction of nominal duration represented by `_a_diff_`. See `_add_nominal_()` for semantics.
   */
  Iso8601Date subtractNominal(Object aDiff);
}
