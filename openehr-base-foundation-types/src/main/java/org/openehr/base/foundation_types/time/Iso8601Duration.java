package org.openehr.base.foundation_types.time;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

import org.openehr.base.foundation_types.primitive_types.Real;

/**
 * Represents an ISO 8601 duration, which may have multiple parts from years down to seconds. The `_value_` attribute is a String in the format:
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
  Real toSeconds();

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
