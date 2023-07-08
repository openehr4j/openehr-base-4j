package org.openehr.base.resource_model.resource;

import java.lang.String;
import java.util.List;
import java.util.Map;
import org.openehr.base.foundation_types.terminology.TerminologyCode;

/**
 * Class providing details of a natural language translation.
 */
public interface TranslationDetails {
  /**
   * Language of the translation, coded using ISO 639-1 (2 character) language codes.
   */
  TerminologyCode getLanguage();

  /**
   * Primary translator name and other demographic details.
   */
  Map getAuthor();

  /**
   * Accreditation of primary translator or group, usually a national translator's registration or association membership id.
   */
  String getAccreditation();

  /**
   * Any other meta-data.
   */
  Map getOtherDetails();

  /**
   * Version of this resource last time it was translated into the language represented by this `TRANSLATION_DETAILS` object.
   */
  String getVersionLastTranslated();

  /**
   * Additional contributors to this translation, each listed in the preferred format of the relevant organisation for the artefacts in question. A typical default is `"name <email>"` if nothing else is specified.
   */
  List getOtherContributors();
}
