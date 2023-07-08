package org.openehr.base.base_types.builtins;

import org.openehr.base.foundation_types.terminology.TerminologyCode;

/**
 * Class representing current Locale.
 */
public interface Locale {
  /**
   * Primary language of the current locale.
   */
  TerminologyCode primaryLanguage();
}
