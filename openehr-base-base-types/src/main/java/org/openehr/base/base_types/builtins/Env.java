package org.openehr.base.base_types.builtins;

import org.openehr.base.foundation_types.time_types.Iso8601Date;
import org.openehr.base.foundation_types.time_types.Iso8601DateTime;
import org.openehr.base.foundation_types.time_types.Iso8601Time;
import org.openehr.base.foundation_types.time_types.Iso8601Timezone;

/**
 * Class representing the real-world environment, providing basic information like current time, date, etc.
 */
public interface Env {
  /**
   * Return today's date in the current locale.
   */
  Iso8601Date currentDate();

  /**
   * Return current time in the current locale.
   */
  Iso8601Time currentTime();

  /**
   * Return current date/time in the current locale.
   */
  Iso8601DateTime currentDateTime();

  /**
   * Return the timezone of the current locale.
   */
  Iso8601Timezone currentTimeZone();
}
