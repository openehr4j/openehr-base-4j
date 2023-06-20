package org.openehr.base_base_types.builtins;

import org.openehr.base_foundation_types.terminology.TerminologyCode;

/**
 * Class representing current Locale.
 */
public interface Locale {
  /**
   * Primary language of the current locale.
   */
  TerminologyCode primaryLanguage();
}
