package org.openehr.base.foundation_types.time;

import java.lang.Boolean;
import java.lang.Object;

/**
 * Definitions for date/time classes. Note that the timezone limits are set by where the international dateline is. Thus, time in New Zealand is quoted using `+12:00`, not `-12:00`.
 *
 * @see <a href="https://specifications.openehr.org/releases/BASE/Release-1.2.0/foundation_types.html#_time_definitions_class">specifications.openehr.org</a>
 */
public interface TimeDefinitions {
  /**
   * True if `y >= 0`.
   */
  Boolean validYear(Integer y);

  /**
   * True if `m >= 1 and m \<= months_in_year`.
   */
  Boolean validMonth(Integer m);

  /**
   * True if `d >= 1 and d \<= days_in_month (m, y)`.
   */
  Boolean validDay(Integer y, Integer m, Integer d);

  /**
   * True if `(h >= 0 and h < Hours_in_day) or (h = Hours_in_day and m = 0 and s = 0)` .
   */
  Boolean validHour(Integer h, Integer m, Integer s);

  /**
   * True if `m >= 0 and m < Minutes_in_hour`.
   */
  Boolean validMinute(Integer m);

  /**
   * True if `s >= 0 and s < Seconds_in_minute` .
   */
  Boolean validSecond(Integer s);

  /**
   * True if `fs >= 0.0` and `fs < 1.0` .
   */
  Boolean validFractionalSecond(Double fs);

  /**
   * String is a valid ISO 8601 date, i.e. takes the complete form:
   */
  Boolean validIso8601Date(String s);

  /**
   * String is a valid ISO 8601 date, i.e. takes the form:
   */
  Boolean validIso8601Time(String s);

  /**
   * String is a valid ISO 8601 date-time, i.e. takes the form:
   */
  Boolean validIso8601DateTime(String s);

  /**
   * String is a valid ISO 8601 duration, i.e. takes the form:
   */
  Boolean validIso8601Duration(String s);
}
