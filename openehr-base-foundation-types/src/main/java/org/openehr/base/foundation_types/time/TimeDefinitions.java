package org.openehr.base.foundation_types.time;

import java.lang.Boolean;
import java.lang.Object;

/**
 * <p>Definitions for date/time classes. Note that the timezone limits are set by where the international dateline is. Thus, time in New Zealand is quoted using <code>+12:00</code>, not <code>-12:00</code>.</p>
 *
 * @see <a href="https://specifications.openehr.org/releases/BASE/Release-1.2.0/foundation_types.html#_time_definitions_class">specifications.openehr.org</a>
 */
public interface TimeDefinitions {

  public static final Integer SECONDS_IN_MINUTE = 60;
  public static final Integer MINUTES_IN_HOUR = 60;
  public static final Integer HOURS_IN_DAY = 24;
  public static final Double AVERAGE_DAYS_IN_MONTH = 30.42;
  public static final Integer MAX_DAYS_IN_MONTH = 31;
  public static final Integer DAYS_IN_YEAR = 365;
  public static final Double AVERAGES_DAYS_IN_YEAR = 365.24;
  public static final Integer DAYS_IN_LEAP_YEAR = 366;
  public static final Integer MAX_DAYS_IN_YEAR = DAYS_IN_LEAP_YEAR;
  public static final Integer DAYS_IN_WEEK = 7;
  public static final Integer MONTHS_IN_YEAR = 12;
  public static final Integer MIN_TIMEZONE_HOUR = 12;
  public static final Integer MAX_TIMEZONE_HOUR = 14;
  public static final Double NOMINAL_DAYS_IN_MONTH = 30.42;
  public static final Double NOMINAL_DAYS_IN_YEAR = 365.24;

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
   * <div class="content"><div class="paragraph">
   * <p>String is a valid ISO 8601 date, i.e. takes the complete form:</p>
   * </div>
   * <div class="ulist">
   * <ul>
   * <li>
   * <p><code>YYYY-MM-DD</code> (extended, preferred) or one of the partial forms <code>YYYY-MM</code> or <code>YYYY</code></p>
   * </li>
   * <li>
   * <p><code>YYYYMMDD</code> (compact) or a partial variant <code>YYYYMM</code>.</p>
   * </li>
   * </ul>
   * </div>
   * <div class="paragraph">
   * <p>Where:</p>
   * </div>
   * <div class="ulist">
   * <ul>
   * <li>
   * <p><code>YYYY</code> is the string form of any positive number in the range <code>0000</code> - <code>9999</code> (zero-filled to four digits)</p>
   * </li>
   * <li>
   * <p><code>MM</code> is <code>01</code> - <code>12</code> (zero-filled to two digits)</p>
   * </li>
   * <li>
   * <p><code>DD</code> is <code>01</code> - <code>31</code> (zero-filled to two digits)</p>
   * </li>
   * </ul>
   * </div>
   * <div class="paragraph">
   * <p>The combinations of <code>YYYY</code>, <code>MM</code>, <code>DD</code> numbers must be correct with respect to the Gregorian calendar.</p>
   * </div></div>
   */
  Boolean validIso8601Date(String s);

  /**
   * <div class="content"><div class="paragraph">
   * <p>String is a valid ISO 8601 date, i.e. takes the form:</p>
   * </div>
   * <div class="ulist">
   * <ul>
   * <li>
   * <p><code>hh:mm:ss[(,|.)s+][Z|±hh[:mm]]</code> (extended)</p>
   * </li>
   * <li>
   * <p><code>hhmmss[(,|.)s+][Z|±hh[mm]]</code> (compact)</p>
   * </li>
   * <li>
   * <p>or one of the partial forms:</p>
   * <div class="ulist">
   * <ul>
   * <li>
   * <p><code>hh:mm</code> (extended)</p>
   * </li>
   * <li>
   * <p><code>hhmm</code> or <code>hh</code> (compact)</p>
   * </li>
   * </ul>
   * </div>
   * </li>
   * </ul>
   * </div>
   * <div class="paragraph">
   * <p>with an additional optional timezone indicator of:</p>
   * </div>
   * <div class="ulist">
   * <ul>
   * <li>
   * <p><code>Z</code> or <code>±hh[:mm]</code> (extended)  <code>±hh[mm]</code> (compact)</p>
   * </li>
   * </ul>
   * </div>
   * <div class="paragraph">
   * <p>Where:</p>
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
   * <p><code>ss</code> is "00" - "60" (0-filled to two digits)</p>
   * </li>
   * <li>
   * <p><code>[(,|.)s+]</code> is an optional string consisting of a comma or decimal point followed by numeric string of 1 or more digits, representing a fractional second</p>
   * </li>
   * <li>
   * <p><code>Z</code> is a literal meaning UTC (modern replacement for GMT), i.e. timezone <code>+0000</code></p>
   * </li>
   * </ul>
   * </div></div>
   */
  Boolean validIso8601Time(String s);

  /**
   * <div class="content"><div class="paragraph">
   * <p>String is a valid ISO 8601 date-time, i.e. takes the form:</p>
   * </div>
   * <div class="ulist">
   * <ul>
   * <li>
   * <p><code>YYYY-MM-DDThh:mm:ss[(,|.)s+][Z|±hh[:mm]]</code> (extended)</p>
   * </li>
   * <li>
   * <p><code>YYYYMMDDThhmmss[(,|.)s+][Z|±hh[mm]]</code> (compact)</p>
   * </li>
   * <li>
   * <p>or one of the partial forms:</p>
   * <div class="ulist">
   * <ul>
   * <li>
   * <p><code>YYYY-MM-DDThh:mm</code> or <code>YYYY-MM-DDThh</code> (extended)</p>
   * </li>
   * <li>
   * <p><code>YYYYMMDDThhmm</code> or <code>YYYYMMDDThh</code> (compact)</p>
   * </li>
   * </ul>
   * </div>
   * </li>
   * </ul>
   * </div></div>
   */
  Boolean validIso8601DateTime(String s);

  /**
   * <div class="content"><div class="paragraph">
   * <p>String is a valid ISO 8601 duration, i.e. takes the form:</p>
   * </div>
   * <div class="ulist">
   * <ul>
   * <li>
   * <p><code>P[nnY][nnM][nnW][nnD][T[nnH][nnM][nnS]]</code></p>
   * </li>
   * </ul>
   * </div>
   * <div class="paragraph">
   * <p>Where each nn represents a number of years, months, etc. <code>nnW</code> represents a number of 7-day weeks.</p>
   * </div>
   * <div class="paragraph">
   * <p>Note: allowing the <code>W</code> designator in the same expression as other designators is an exception to the published standard, but necessary in clinical information (typically for representing pregnancy duration).</p>
   * </div>
   * <div class="hdlist">
   * <div class="title">Parameters<br></div>
   * <table>
   * <tbody><tr>
   * <td class="hdlist1">
   * <code><em>s</em></code>
   * </td>
   * <td class="hdlist2">
   * <p>String is a valid ISO 8601 duration, i.e. takes the form:</p>
   * <div class="ulist">
   * <ul>
   * <li>
   * <p><code>P[nnY][nnM][nnW][nnD][T[nnH][nnM][nnS]]</code></p>
   * </li>
   * </ul>
   * </div>
   * </td>
   * </tr>
   * </tbody></table>
   * </div>
   * <div class="paragraph">
   * <p>Where each <code>nn</code> represents a number of years, months, etc. <code>nnW</code> represents a number of 7- day weeks.</p>
   * </div>
   * <div class="admonitionblock note">
   * <table>
   * <tbody><tr>
   * <td class="icon">
   * <div class="title">Note</div>
   * </td>
   * <td class="content">
   * allowing the <code>W</code> designator in the same expression as other designators is an exception to the published standard, but necessary in clinical information (typically for representing pregnancy duration).
   * </td>
   * </tr>
   * </tbody></table>
   * </div></div>
   */
  Boolean validIso8601Duration(String s);
}
