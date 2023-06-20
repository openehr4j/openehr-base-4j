package org.openehr.base_foundation_types.terminology;

import java.lang.String;
import org.openehr.base_foundation_types.Any;
import org.openehr.base_foundation_types.primitive_types.Uri;

/**
 * Primitive type representing a standalone reference to a terminology concept, in the form of a terminology identifier, optional version, and a code or code string from the terminology.
 */
public interface TerminologyCode extends Any {
  /**
   * The archetype environment namespace identifier used to identify a terminology. Typically a value like `"snomed_ct"` that is mapped elsewhere to the full URI identifying the terminology.
   */
  String getTerminologyId();

  /**
   * Optional string value representing terminology version, typically a date or dotted numeric.
   */
  String getTerminologyVersion();

  /**
   * A terminology code or post-coordinated code expression, if supported by the terminology. The code may refer to a single term, a value set consisting of multiple terms, or some other entity representable within the terminology.
   */
  String getCodeString();

  /**
   * The URI reference that may be used as a concrete key into a notional terminology service for queries that can obtain the term text, definition, and other associated elements.
   */
  Uri getUri();
}
