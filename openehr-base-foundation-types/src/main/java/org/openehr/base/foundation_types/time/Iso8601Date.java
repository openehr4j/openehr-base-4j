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
  Iso8601Date add(Iso8601Duration aDiff);

  /**
   * Arithmetic subtraction of a duration from a date.
   */
  Iso8601Date subtract(Iso8601Duration aDiff);

  /**
   * Difference of two dates.
   */
  Iso8601Duration diff(Iso8601Date aDate);

  /**
   * <div class="paragraph">
   * <p>Addition of nominal duration represented by <code><em>a_diff</em></code>. For example, a duration of <code>'P1Y'</code> means advance to the same date next year, with the exception of the date 29 February in a leap year, to which the addition of a nominal year will result in 28 February of the following year. Similarly, <code>'P1M'</code> is understood here as a nominal month, the addition of which will result in one of:</p>
   * </div>
   * <div class="ulist">
   * <ul>
   * <li>
   * <p>the same day in the following month, if it exists, or;</p>
   * </li>
   * <li>
   * <p>one or two days less where the following month is shorter, or;</p>
   * </li>
   * <li>
   * <p>in the case of adding a month to the date 31 Jan, the result will be 28 Feb in a non-leap year (i.e. three less) and 29 Feb in a leap year (i.e. two less).</p>
   * </li>
   * </ul>
   * </div>
   */
  Iso8601Date addNominal(Iso8601Duration aDiff);

  /**
   * <p>Subtraction of nominal duration represented by <code><em>a_diff</em></code>. See <code><em>add_nominal</em>()</code> for semantics.</p>
   */
  Iso8601Date subtractNominal(Iso8601Duration aDiff);
}
