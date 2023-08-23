package org.openehr.base.foundation_types.time;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

import org.openehr.base.foundation_types.primitive_types.Real;

/**
 * <div class="content"><div class="paragraph">
 * <p>Represents an ISO 8601 duration, which may have multiple parts from years down to seconds. The <code><em>value</em></code> attribute is a String in the format:</p>
 * </div>
 * <div class="ulist">
 * <ul>
 * <li>
 * <p><code>P[nnY][nnM][nnW][nnD][T[nnH][nnM][nnS]]</code></p>
 * </li>
 * </ul>
 * </div>
 * <div class="admonitionblock note">
 * <table>
 * <tbody><tr>
 * <td class="icon">
 * <div class="title">Note</div>
 * </td>
 * <td class="content">
 * two deviations from ISO 8601 are supported, the first, to allow a negative sign, and the second allowing the 'W' designator to be mixed with other designators.
 * </td>
 * </tr>
 * </tbody></table>
 * </div></div>
 *
 * @see <a href="https://specifications.openehr.org/releases/BASE/Release-1.2.0/foundation_types.html#_iso8601_duration_class">specifications.openehr.org</a>
 */
public interface Iso8601Duration extends Iso8601Type {
  /**
   * Returns True.
   */
  Boolean isExtended();

  /**
   * Returns False.
   */
  Boolean isPartial();

  /**
   * Number of years in the `_value_`, i.e. the number preceding the `'Y'` in the `'YMD'` part, if one exists.
   */
  Integer years();

  /**
   * Number of months in the `_value_`, i.e. the value preceding the `'M'` in the `'YMD'` part, if one exists.
   */
  Integer months();

  /**
   * Number of days in the `_value_`, i.e. the number preceding the `'D'` in the `'YMD'` part, if one exists.
   */
  Integer days();

  /**
   * Number of hours in the `_value_`, i.e. the number preceding the `'H'` in the `'HMS'` part, if one exists.
   */
  Integer hours();

  /**
   * Number of minutes in the `_value_`, i.e. the number preceding the `'M'` in the `'HMS'` part, if one exists.
   */
  Integer minutes();

  /**
   * Number of seconds in the `_value_`, i.e. the integer number preceding the `'S'` in the `'HMS'` part, if one exists.
   */
  Integer seconds();

  /**
   * Fractional seconds in the `_value_`, i.e. the decimal part of the number preceding the `'S'` in the `'HMS'` part, if one exists.
   */
  Double fractionalSeconds();

  /**
   * Number of weeks in the `_value_`, i.e. the value preceding the `W`, if one exists.
   */
  Integer weeks();

  /**
   * True if this time has a decimal part indicated by ',' (comma) rather than '.' (period).
   */
  Boolean isDecimalSignComma();

  /**
   * Total number of seconds equivalent (including fractional) of entire duration. Where non-definite elements such as year and month (i.e. 'Y' and 'M') are included, the corresponding 'average' durations from `Time_definitions` are used to compute the result.
   */
  Double toSeconds();

  /**
   * Return the duration string value.
   */
  String asString();

  /**
   * Arithmetic addition of a duration to a duration, via conversion to seconds, using `Time_definitions._Average_days_in_year_` and `Time_definitions._Average_days_in_month_`
   */
  Iso8601Duration add(Object aVal);

  /**
   * Arithmetic subtraction of a duration from a duration, via conversion to seconds, using `Time_definitions._Average_days_in_year_` and `Time_definitions._Average_days_in_month_`
   */
  Iso8601Duration subtract(Object aVal);

  /**
   * Arithmetic multiplication a duration by a number.
   */
  Iso8601Duration multiply(Object aVal);

  /**
   * Arithmetic division of a duration by a number.
   */
  Iso8601Duration divide(Object aVal);

  /**
   * Generate negative of current duration value.
   */
  Iso8601Duration negative();
}
