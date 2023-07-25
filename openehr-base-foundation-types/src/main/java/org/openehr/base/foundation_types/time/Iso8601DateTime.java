package org.openehr.base.foundation_types.time;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

import org.jetbrains.annotations.Nullable;
import org.openehr.base.foundation_types.primitive_types.Real;

/**
 * Represents an ISO 8601 date/time, including partial and extended forms. Value may be:
 */
public interface Iso8601DateTime extends Iso8601Type {
  /**
   * Extract the year part of the date as an Integer.
   */
  Integer year();

  /**
   * Extract the month part of the date/time as an Integer, or return 0 if not present.
   */
  Integer month();

  /**
   * Extract the day part of the date/time as an Integer, or return 0 if not present.
   */
  Integer day();

  /**
   * Extract the hour part of the date/time as an Integer, or return 0 if not present.
   */
  Integer hour();

  /**
   * Extract the minute part of the date/time as an Integer, or return 0 if not present.
   */
  Integer minute();

  /**
   * Extract the integral seconds part of the date/time (i.e. prior to any decimal sign) as an Integer, or return 0 if not present.
   */
  Integer second();

  /**
   * Extract the fractional seconds part of the date/time (i.e. following to any decimal sign) as a Real, or return 0.0 if not present.
   */
  Double fractionalSecond();

  /**
   * Timezone; may be Void.
   */
  @Nullable
  Iso8601Timezone timezone();

  /**
   * Indicates whether month in year is unknown.
   */
  Boolean monthUnknown();

  /**
   * Indicates whether day in month is unknown.
   */
  Boolean dayUnknown();

  /**
   * Indicates whether minute in hour is known.
   */
  Boolean minuteUnknown();

  /**
   * Indicates whether minute in hour is known.
   */
  Boolean secondUnknown();

  /**
   * True if this time has a decimal part indicated by `','` (comma) rather than `'.'` (period).
   */
  Boolean isDecimalSignComma();

  /**
   * True if this date time is partial, i.e. if seconds or more is missing.
   */
  Boolean isPartial();

  /**
   * True if this date/time uses `'-'`, `':'` separators.
   */
  Boolean isExtended();

  /**
   * True if the `_fractional_second_` part is significant (i.e. even if = 0.0).
   */
  Boolean hasFractionalSecond();

  /**
   * Return the string value in extended format.
   */
  String asString();

  /**
   * Arithmetic addition of a duration to a date/time.
   */
  Iso8601DateTime add(Object aDiff);

  /**
   * Arithmetic subtraction of a duration from a date/time.
   */
  Iso8601DateTime subtract(Object aDiff);

  /**
   * Difference of two date/times.
   */
  Iso8601Duration diff(Object aDateTime);

  /**
   * Addition of nominal duration represented by `_a_diff_`. See `Iso8601_date._add_nominal_()` for semantics.
   */
  Iso8601Date addNominal(Object aDiff);

  /**
   * Subtraction of nominal duration represented by `_a_diff_`. See `_add_nominal_()` for semantics.
   */
  Iso8601Date subtractNominal(Object aDiff);
}
